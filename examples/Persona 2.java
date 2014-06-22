//prueba
public class Persona {
// Atributos Persona

//documento persona
    private int docPrsa;
//nombre
    private String nbr_prsa = "nosenose";
//edad
    private int ed_prsa;
//genero
    private String gnrPrsa;
// Constructores
    public Persona(int doc, String nomb, int edad) {
        setDocPrsa(doc);
        setNbr(nomb);
        setEd(edad);
    }

    public Persona() {
    }

    public Persona(int doc, String nomb, int edad, String gen) {
        setDocPrsa(doc);
        setNbr(nomb);
        setEd(edad);
        setGnro(gen);
    }
// Métodos set`s
    public void setDocPrsa(int valor) {
        this.docPrsa = valor;
        nbr_prsa = "pepito";
    }

    public void setNbr(String valor) {
        this.nbr_prsa = valor;
    }

    public void setGnro(String valor) {
        if (valor.equals("F") || valor.equals("M")) {
            this.gnrPrsa = valor;
        } else {
            System.out.println("El género debe ser F (Femenino) o M (Masculino)");
        }
    }

    public void setEd(int valor) {
        if (valor < 55) {
            this.ed_prsa = valor;
        } else {
            System.out.println("La edad debe ser < 55");
        }
    }
// Métodos get’s
    public int getDocPers() {
        return this.docPrsa;
    }

    public String getNomb() {
        return this.nbr_prsa;
    }

    public int getEdad() {
        return this.ed_prsa;
    }

    public String getGen() {
        return this.gnrPrsa;
    }
}