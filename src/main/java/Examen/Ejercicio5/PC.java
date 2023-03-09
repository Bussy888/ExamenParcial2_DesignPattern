package Examen.Ejercicio5;

public class PC {
    private IState state;
    private String[] programasAbiertos = new String[]{};
    private int consumoRAM;
    private int consumoCPU;
    public void showInfo(){
        System.out.println("++++ PC +++");
        System.out.println("Consumo RAM: "+consumoRAM);
        System.out.println("Consumo CPU: "+consumoCPU);
        System.out.print("PROGRAMAS ABIERTOS: ");
        if(programasAbiertos.length == 0){
            System.out.println("NO hay programas abiertos");
        }else{
            for(int i = 0 ; i<programasAbiertos.length; i++){
                if(programasAbiertos[i] != null){
                    System.out.println(programasAbiertos[i]);
                }
            }
        }

    }

    public void resManager() throws InterruptedException {
        state.resManager(this);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public String[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public int getConsumoRAM() {
        return consumoRAM;
    }

    public void setConsumoRAM(int consumoRAM) {
        this.consumoRAM = consumoRAM;
    }

    public int getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(int consumoCPU) {
        this.consumoCPU = consumoCPU;
    }
}
