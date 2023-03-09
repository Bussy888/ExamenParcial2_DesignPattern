package Examen.Ejercicio5;

public class Off implements IState{

    @Override
    public void resManager(PC pc) throws InterruptedException {
        System.out.println("La PC se apagara...");
        pc.setProgramasAbiertos(new String[]{});
        pc.setConsumoRAM(0);
        pc.setConsumoCPU(0);
        pc.showInfo();
    }
}
