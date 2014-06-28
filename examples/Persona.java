package prueba; 

public class Persona {
// Atributos
    private int idPersona;
    private String nombre_persona;
    private int edad_persona;
    private String generoPersona;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String genero) {
        setIdPersona(id);
        setNombre(nombre);        
    }

// Métodos set`s
    public void setIdPersona(int valor) {
        this.idPersona = valor;
    }

    public void setNombre(String valor) {
        this.nombre_persona = valor;
        int i = 0;        
        if(i>0){
          System.out.println("hola mundo");
        }else{
            i++;
        }
        int j=0;
        j++;
        while(j<10){
            System.out.println("hola mundo");
            j++;
        }
    }

}
