package Examen.Ejercicio4;

public class CIOrden implements ICategoria{

    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        int[] cis = new int[estudiantes.length];
        for(int i = 0; i < estudiantes.length;i++){
            cis[i] = estudiantes[i].getCi();
        }
        int n = estudiantes.length;
        int temp;
        Estudiante tempo;
        for (int i = 0 ; i < n; i++){
            for (int j = 1 ; j< (n-i); j++){
                if(cis[j-1] > cis[j]){
                    temp = cis[j-1];
                    cis[j-1] = cis[j];
                    cis[j] = temp;

                    tempo = estudiantes[j-1];
                    estudiantes[j-1] = estudiantes[j];
                    estudiantes[j] = tempo;
                }
            }
        }
        for (int i = 0 ; i < n ; i++){
            System.out.println(cis[i]+" ");
        }
        System.out.println();
        return estudiantes;
    }

}
