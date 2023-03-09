package Examen.Ejercicio4;

public class Colegio {
    Estudiante [] estudiantes;
    ICategoria strategy;

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ICategoria getStrategy() {
        return strategy;
    }

    public void setStrategy(ICategoria strategy) {
        this.strategy = strategy;
    }

    public Colegio(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    public Estudiante[] ordenar(){
        return strategy.ordenar(estudiantes);
    }

    public void showEstudiantes(){
        for (Estudiante e: estudiantes){
            System.out.print(e.getNombre()+ "  ");
        }
        System.out.println();
    }
}
