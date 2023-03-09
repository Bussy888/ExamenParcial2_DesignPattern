package Examen.Ejercicio5;

import java.util.Random;

public class On implements IState{

    @Override
    public void resManager(PC pc) throws InterruptedException {
        System.out.println(" PC ENCENDIDA");
        pc.setProgramasAbiertos(new String[new Random().nextInt(20)]);
        System.out.println("Abriendo programas:");
        System.out.println(pc.getProgramasAbiertos().length);
        for(int i=0; i < pc.getProgramasAbiertos().length ; i++){
            int time = new Random().nextInt(4000);
            Thread.sleep(time);
            System.out.println("Tiempo pasado: "+time+ "milisegundos");
            System.out.println("Abriendo Programa"+i);
            pc.getProgramasAbiertos()[i] = "App "+i;
            if(pc.getConsumoCPU() < 100 && pc.getConsumoRAM() <100){
                pc.setConsumoCPU(pc.getConsumoCPU() +5);
                pc.setConsumoRAM(pc.getConsumoRAM() + 5);
            }
            pc.showInfo();
        }
    }
}
