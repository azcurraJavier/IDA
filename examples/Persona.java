public class Persona {
// Atributos
    private int idPersona;
    private String nombre_persona;
    private int edad_persona;
    private String generoPersona;
// Constructores
    public Persona(int id, String nombre, int edad) {
        setIdPersona(id);
        setNombre(nombre);
        setEdad(edad);
    }

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String genero) {
        setIdPersona(id);
        setNombre(nombre);
        setEdad(edad);
        setGenero(genero);
    }
// Métodos set`s
    public void setIdPersona(int valor) {
        this.idPersona = valor;
    }

    public void setNombre(String valor) {
        this.nombre_persona = valor;
    }

    public void setGenero(String valor) {
        if (valor.equals("F") || valor.equals("M")) {
            this.generoPersona = valor;
        } else {
            System.out.println("El género debe ser F o M");
        }
    }

    public void setEdad(int valor) {
        if (valor < 55) {
            this.edad_persona = valor;
        } else {
            System.out.println("La edad debe ser < 55");
        }
    }
// Métodos get’s
    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre() {
        return this.nombre_persona;
    }

    public int getEdad() {
        return this.edad_persona;
    }

    public String getGenero() {
        return this.generoPersona;
    }
}
