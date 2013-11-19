
public class PrincipalPersona {

    public static void main(String[] arreglo) {
		String s = "alksdhfk";
        Persona p = new Persona();
        Persona p1 = new Persona(22, "Marcos", 12);
        p1.setGenero("M");
        Persona p4 = new Persona(33, "Lucia", 34, "F");
        System.out.println(p1.getIdPersona() + " " + p1.getNombre() + " " + p1.getEdad());
		System.out.println(p4.getIdPersona() + " " + p4.getNombre() + " " + p4.getEdad() + " " + p4.getGenero());
    }
}
