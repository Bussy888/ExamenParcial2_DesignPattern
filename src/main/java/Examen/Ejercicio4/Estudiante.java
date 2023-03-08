package Examen.Ejercicio4;

public class Estudiante {
    private String nombre;
    private String fechaDeN;
    private String carrera;
    private int ci;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeN() {
        return fechaDeN;
    }

    public void setFechaDeN(String fechaDeN) {
        this.fechaDeN = fechaDeN;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Estudiante(String nombre, String fechaDeN, String carrera, int ci) {
        this.nombre = nombre;
        this.fechaDeN = fechaDeN;
        this.carrera = carrera;
        this.ci = ci;
    }
}
