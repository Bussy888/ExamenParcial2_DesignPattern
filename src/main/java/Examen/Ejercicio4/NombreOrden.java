package Examen.Ejercicio4;

public class NombreOrden implements ICategoria{

    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        String[] nombres = new String[estudiantes.length];
        for(int i = 0; i < estudiantes.length;i++){
            nombres[i] = estudiantes[i].getNombre();
        }
        int n = estudiantes.length;
        String temp;
        Estudiante tempo;
        for (int i = 0 ; i < n; i++){
            for (int j = 1 ; j< (n-i); j++){
                if(nombres[j-1].toCharArray()[0] > nombres[j].toCharArray()[0]){
                    temp = nombres[j-1];
                    nombres[j-1] = nombres[j];
                    nombres[j] = temp;

                    tempo = estudiantes[j-1];
                    estudiantes[j-1] = estudiantes[j];
                    estudiantes[j] = tempo;
                }
            }
        }
        for (int i = 0 ; i < n ; i++){
            System.out.print(nombres[i]+" ");
        }
        System.out.println();
        return estudiantes;
    }
}
