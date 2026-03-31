/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author GIGAUSER
 */
public class Veterinario {
    private String nombre;
    private String tarjetaprofesional;
    private String especialidad;

    public Veterinario() {
    }

    public Veterinario(String nombre, String tarjetaprofesional, String especialidad) {
        this.nombre = nombre;
        this.tarjetaprofesional = tarjetaprofesional;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjetaprofesional() {
        return tarjetaprofesional;
    }

    public void setTarjetaprofesional(String tarjetaprofesional) {
        this.tarjetaprofesional = tarjetaprofesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void recetarMedicamento(Medicamento medicamento, Consulta c){
        c.getMedicamentos().add(medicamento);
        
        System.out.println("\n\t----RECETA----");
        System.out.println("\n "+medicamento.getNombre());
        System.out.println("\n\t--------------------");
    }
}
