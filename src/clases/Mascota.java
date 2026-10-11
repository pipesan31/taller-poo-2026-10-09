package clases;

public class Mascota {
    private String nombre;
    private String especie;
    private double peso;
    private int edad;

    public Mascota(String nombre, String especie, double peso, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    String getNombre() {
        return nombre;
    }

    String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    int getEdad() {
        return edad;
    }

    public void setPeso(double nuevoPeso) {
        if (nuevoPeso <= 0) {
            System.out.println("ERROR: No se pueden ingresar pesos menores o iguales a 0");
            return;
        }
        this.peso = nuevoPeso;
    }

    void setEdad(int nuevoEdad) {
        if (nuevoEdad < 0) {
            System.out.println("ERROR: No se puede ingresar una edad menor a 0");
            return;
        }
        this.edad = nuevoEdad;
    }

    public int valorConsulta(){
        int base = 35000;
        if (peso > 25) {
            base = 55000;
        } else if (peso > 10) {
            base = 45000;
        } if (edad >= 8){
            base = base + 12000;
        }
        return base;
    }

    public String descripcion(){

        return nombre + " (" + especie + ", "  + peso + " kg, " + edad + " años" + ")";
    }
}
