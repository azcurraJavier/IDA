package SplitID;

import Listas.Clase;
import Listas.ListaClase;
import Listas.MostrarTabla;
import java.util.Iterator;

public class SamuraiPaper {

    private Clase claseActual;
    private String identificador;
    private int cantTotalIde;

    public SamuraiPaper(Clase claseAc, String ide) {
        this.claseActual = claseAc;
        this.identificador = ide;
        this.cantTotalIde = claseAc.getCantTotalId();
    }

    private double frecuenciaLocal(String id) {//Freq(t; p)        

        int cantApa = 0;
        for (MostrarTabla m : claseActual.getIdTablaClase()) {

            if (id.equals(m.getNomId())) {
                cantApa = m.getNumApa();
                break;
            }
        }

        return cantApa / cantTotalIde;
    }

    private double frecuenciaGlobal() {//globalFreq(t)

        int cantApa = 0;

        for (Iterator<Clase> it = ListaClase.getLisClases().iterator(); it.hasNext();) {
            Clase cla = it.next();


            for (MostrarTabla m : cla.getIdTablaClase()) {

                if (identificador.equals(m.getNomId())) {
                    cantApa += m.getNumApa();
                }
            }

        }

        return cantApa / cantTotalIde;
    }

    private double todasFreqStr() {//AllStrsFreq(p)

        double freAcum = 0.0;

        for (Iterator<Clase> it = ListaClase.getLisClases().iterator(); it.hasNext();) {
            Clase cla = it.next();


            for (MostrarTabla m : cla.getIdTablaClase()) {


                freAcum += frecuenciaLocal(m.getNomId());

            }

        }

        return freAcum;

    }

    private double score(String id) {

        double freqApa = frecuenciaLocal(id);//Freq(t; p)
        double freqGlobal = frecuenciaGlobal();//globalFreq(t)
        double todasFreqStr = todasFreqStr();//AllStrsFreq(p)        

        //Freq(t; p) + globalFreq(t)/log10(AllStrsFreq(p))        
        double logFreq = Math.log10(todasFreqStr);

        return freqApa + (freqGlobal / logFreq);
    }

    private String splitOnSpecialCharsAndDigits(String token) {
        token = token.replace('$', ' ');
        token = token.replace('_', ' ');
        token = token.replace('-', ' ');
        token = token.replace('.', ' ');

        return token;
    }

    private String splitOnLowercaseToUppercase(String token) {

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < token.length() - 1; i++) {//-1 sino puede dar excepción en i+1
            if (Character.isLowerCase(token.charAt(i)) && Character.isUpperCase(token.charAt(i + 1))) {
                newStr.append(" ");
            }
            newStr.append(token.charAt(i));
        }

        token = newStr.toString();

        return token;
    }

    private int existUpperToLower(String s) {

        for (int i = 0; i < s.length() - 1; i++) {//-1 sino puede dar excepción en i+1
            if (Character.isUpperCase(s.charAt(i)) && Character.isLowerCase(s.charAt(i + 1))) {
                return i;
            }
        }

        return -1;
    }

    private String subStr(String s, int x, int y) {

        return s.substring(x, y);

    }

    private String mixedCaseSplit() {
        String sToken = "";
        String token = this.identificador;

        token = splitOnSpecialCharsAndDigits(token);
        token = splitOnLowercaseToUppercase(token);

        String lisToken[] = token.split(" ");

        for (String s : lisToken) {

            int i = existUpperToLower(s);

            if (i != -1) {

                int n = s.length() - 1;
                double camelScore;

                if (i > 0) {
                    camelScore = score(subStr(s, i, n));
                } else {

                    camelScore = score(subStr(s, 0, n));
                }

                double altScore = score(subStr(s, i + 1, n));
                double raizAltSco = Math.sqrt(altScore);

                if (camelScore > raizAltSco) {
                    if (i > 0) {
                        s = subStr(s, 0, i - 1) + " " + subStr(s, i, n);
                    }
                } else {
                    s = subStr(s, 0, i) + " " + subStr(s, i + 1, n);
                }

            }

            sToken = sToken + " " + s;
        }

        token = sToken;
        sToken = "";

        lisToken = token.split(" ");

        for (String s : lisToken) {
            sToken =  sToken + " " + sameCaseSplit(s,score(s));
        }

        return sToken;
    }

    private String sameCaseSplit(String s, double score){

        String splitS = s;
        int n = s.length() - 1;
        double maxScore = -1;


        double scoreL, scoreR;
        boolean prefix, toSplitL, toSplitR;

        for (int i = 0; i < n; i++) {

            scoreL = score(subStr(s, 0, i));
            scoreR = score(subStr(s, i + 1, n));
            PrefixSufix sStr = new PrefixSufix();
            prefix = sStr.isPrefix(subStr(s,0,i)) || sStr.isSuffix(subStr(s,0,i));            

            toSplitL = Math.sqrt(scoreL) > Math.max(score(s), score);
            toSplitR = Math.sqrt(scoreR) > Math.max(score(s), score);


            if (!prefix && toSplitL && toSplitR) {

                if ((scoreL + scoreR) > maxScore) {
                    maxScore = scoreL + scoreR;
                    splitS = subStr(s, 0, i) + " " + subStr(s, i + 1, n);


                } else if (!prefix && toSplitL) {                    
//                    String temp = sameCaseSplit(subStr(s, i + 1, n), score);
                    
                     System.out.println("if temp was further split");
                     
                }


            }

        }


        return splitS;
    }
}
