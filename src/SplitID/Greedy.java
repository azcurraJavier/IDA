package SplitID;

import DictionaryDB.Dictionary;

/**
 *
 * @author javier
 */
public class Greedy {

    private boolean buscarDicc(String w){
        
        return (Dictionary.searchWordDic("words_dict", w) ||
                Dictionary.searchWordDic("stop_dict", w) ||
                Dictionary.searchWordDic("acro_dict", w));
    }
    
    public String ejecutar(String idHardword){       
        
        if(idHardword == null || idHardword.isEmpty()){
            return "";
        }
    
        String softwordDiv;
        
        //separa simbolos especiales
        softwordDiv = SplitUtils.splitSymbol(idHardword);
        
        //separa camelcase
        softwordDiv = SplitUtils.splitCamelCaseGreedy(softwordDiv);
        
        //pasamos a minusculas
        softwordDiv = softwordDiv.toLowerCase();       
                
       
        String substring[] = softwordDiv.split(" ");
        
        softwordDiv = "";
        
        for(String s : substring){//ver si el s es una copia del elemento de substring           
            
            if(!buscarDicc(s)){
                
                String pre = buscarPrefijo(s, "");
                String suf = buscarSufijo(s, "");
            
                s =  maxDivision(pre, suf);                
            }
            
            softwordDiv += s + " ";
        
        }
        
        softwordDiv = softwordDiv.substring(0, softwordDiv.length()-1);
        
        return softwordDiv;
    
    }
   
    private String buscarPrefijo(String s1, String s2){        
              
        if(s1.length() == 0){
            return s2;
	}      

	if(buscarDicc(s1)){            
                        
            String res = buscarPrefijo(s2,"");
            
            if(res.isEmpty()){
               return s1;
            }
            
            return s1 + " " + res;           
            
	}
        
        s2 = s1.substring(s1.length() - 1) + s2;
        
        s1 = s1.substring(0,s1.length() - 1);        
        
        return buscarPrefijo(s1,s2);   
        
    }
    
    //------------------------------------------------
    
    
    private String buscarSufijo(String s1, String s2){       
        
        if(s1.length() == 0){
            return s2;
	}
        
	if(buscarDicc(s1)){            
                        
            String res = buscarSufijo(s2,"");
            
            if(res.isEmpty()){
               return s1;
            }
            
            return res + " " + s1;           
            
	}
        
        s2 = s2 + s1.charAt(0);
        
        s1 = s1.substring(1,s1.length());        
        
        return buscarSufijo(s1,s2);   
        
    }
    
    
    private  String maxDivision(String s1, String s2){
       
       int count1 = s1.length() - s1.replace(" ", "").length();
       
       int count2 = s2.length() - s2.replace(" ", "").length();
        
       if(count1 < count2){
           return s2;
       }       
       
       return s1;
    
    }
    
}
