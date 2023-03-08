package Examen.Ejercicio4;

public class CarreraOrden implements ICategoria{

    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        String[] carrera = new String[estudiantes.length];
        for(int i = 0; i < estudiantes.length;i++){
            carrera[i] = estudiantes[i].getCarrera();
        }
        int n = estudiantes.length;
        String temp;
        Estudiante tempo;
        for (int i = 0 ; i < n; i++){
            for (int j = 1 ; j< (n-i); j++){
                if(carrera[j-1].toCharArray()[0] > carrera[j].toCharArray()[0]){
                    temp = carrera[j-1];
                    carrera[j-1] = carrera[j];
                    carrera[j] = temp;

                    tempo = estudiantes[j-1];
                    estudiantes[j-1] = estudiantes[j];
                    estudiantes[j] = tempo;
                }
            }
        }
        for (int i = 0 ; i < n ; i++){
            System.out.println(carrera[i]+" ");
        }
        System.out.println();
        return estudiantes;
    }
}
