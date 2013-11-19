public class PrincipalColegio {
//método main
    public static void main(String[] args) {
//instanciando un objeto
        Colegio pradosdelNorte = new Colegio("julian", 1, "juana");
        System.out.println(pradosdelNorte.getNombreDocente() + " "
                + pradosdelNorte.getNumeroMaterias() + " "
                + pradosdelNorte.getNombreEstudiante());
    }
}
