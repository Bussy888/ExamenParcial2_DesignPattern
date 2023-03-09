package Examen.Ejercicio5;

import java.util.Random;

public class Restart implements IState{
    @Override
    public void resManager(PC pc) throws InterruptedException {
        System.out.println("Reiniciando PC");
        System.out.println("Cerrando Programas");
        if(pc.getProgramasAbiertos().length == 0){
            System.out.println("No hay programas por cerrar");
        }else {
            for (String s : pc.getProgramasAbiertos()){
                Thread.sleep(new Random().nextInt(3000));
                System.out.println(s+" fue cerrado con exito");
                pc.setConsumoCPU(pc.getConsumoCPU()-5);
                pc.setConsumoRAM(pc.getConsumoRAM()-5);
            }
        }
        pc.setProgramasAbiertos(new String[]{});
        pc.setConsumoCPU(0);
        pc.setConsumoRAM(0);
        pc.showInfo();
    }
}
