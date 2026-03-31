/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

import java.util.ArrayList;
import models.Consulta;
import models.Mascota;
import models.Medicamento;
import models.Propietario;
import models.Veterinario;

/**
 *
 * @author GIGAUSER
 */
public class ClinicaVeterinari {

    public static void main(String[] args) {


        ArrayList<Propietario> propietarios = new ArrayList<>();
        ArrayList<Consulta> consultas = new ArrayList<>();


        Propietario p1 = new Propietario("Carlos", "123");
        Propietario p2 = new Propietario("Ana", "456");

        propietarios.add(p1);
        propietarios.add(p2);


        Mascota m1 = new Mascota("Labrador", "Macho", p1, "Firulais", "Perro", "3");
        Mascota m2 = new Mascota("Siames", "Hembra", p2, "Michi", "Gato", "2");

        p1.agregarMascota(m1);
        p2.agregarMascota(m2);


        Veterinario vet = new Veterinario("Dr. Lopez", "TP123", "General");


        Consulta c1 = new Consulta("30/03/2026", "Infección");
        consultas.add(c1);

        Medicamento med1 = new Medicamento("Antibiotico", "2 veces al dia");
        Medicamento med2 = new Medicamento("Vitamina", "1 vez al dia");

        vet.recetarMedicamento(med1, c1);
        vet.recetarMedicamento(med2, c1);


        System.out.println("=== PROPIETARIOS Y MASCOTAS ===");

        for (Propietario p : propietarios) {
            System.out.println("Propietario: " + p.getNombre());

            for (Mascota m : p.getMascotas()) {
                System.out.println("  Mascota: " + m.getNombre() + " - " + m.getEspecie());
            }
        }


        System.out.println("\n=== CONSULTAS ===");

        for (Consulta c : consultas) {
            System.out.println("Fecha: " + c.getFecha());
            System.out.println("Diagnóstico: " + c.getDiagnostico());

            System.out.println("Medicamentos:");
            for (Medicamento m : c.getMedicamentos()) {
                System.out.println(" - " + m.getNombre() + " (" + m.getDosis() + ")");
            }
        }
    }
}
