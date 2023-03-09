package Examen.Ejercicio4;

public class Client {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", "2000","Sistemas",1991);
        Estudiante e2 = new Estudiante("Carlos", "2001","Admin",1812);
        Estudiante e3 = new Estudiante("Julio", "1999","Comercial",1113);
        Estudiante e4 = new Estudiante("Jack", "2003","Derecho",4444);
        Estudiante e5 = new Estudiante("Michael", "2002","Electromecanica",1152);

        Estudiante[] estudiantes = {e1,e2,e3,e4,e5};
        Colegio colegio = new Colegio(estudiantes);
        System.out.println();
        System.out.println("ORDEN CI's:");
        colegio.setStrategy(new CIOrden());
        colegio.setEstudiantes(colegio.ordenar());
        colegio.showEstudiantes();
        System.out.println();
        System.out.println("ORDEN Carrera:");
        colegio.setStrategy(new CarreraOrden());
        colegio.setEstudiantes(colegio.ordenar());
        colegio.showEstudiantes();
        System.out.println();
        System.out.println("ORDEN Nombre:");
        colegio.setStrategy(new NombreOrden());
        colegio.setEstudiantes(colegio.ordenar());
        colegio.showEstudiantes();

    }
}
