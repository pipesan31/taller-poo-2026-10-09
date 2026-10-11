package main;

import clases.Mascota;

public class Veterinaria {
    static void main(String[] args) {
        //se declara el arreglo del objeto con 4 pacientes
        Mascota[] paciente = new Mascota[4];

        paciente[0] = new Mascota("Luna" ,"Perro", 28.5, 9 );
        paciente[1] = new Mascota("Michi","Gato", 4.2, 3);
        paciente[2] = new Mascota("Rocky", "Perro", 12.0, 5);
        paciente[3] = new Mascota("Pepa", "Conejo", 2.1, 1);

        double totalRecaudado = 0;

        for(int i = 0; i < paciente.length; i++){
            double valorConsulta = paciente[i].valorConsulta();
            System.out.println(paciente[i].descripcion() + " - valor de la consulta: $" + valorConsulta);
            totalRecaudado += valorConsulta;
        }
        System.out.println("total recaudado: " + totalRecaudado);

        paciente[1].setPeso(-3);

        System.out.println(paciente[1].descripcion());
    }
}
