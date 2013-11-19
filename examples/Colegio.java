
public class Colegio {
//atributos
    private String nombre_docente;
    private int numero_materias;
    private String nombre_estudiante;
// metodos constructor
    public Colegio(String nombreDocente, int numeroMaterias, String nombreEstudiante) {
        setNombreDocente(nombreDocente);
        setNumeroMaterias(numeroMaterias);
        setNombreEstudiante(nombreEstudiante);
    }
// metodo set
    public void setNombreDocente(String docenteNum) {
        this.nombre_docente = docenteNum;
    }

    public void setNumeroMaterias(int materiasNum) {
        if (M < 5) {
            this.numero_materias = materiasNum;
        } else {
            System.out.println("numero de materias no >5 materias");
        }
    }

    public void setNombreEstudiante(String estudianteNombre) {
        this.nombre_estudiante = estudianteNombre;
    }
}
