/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author GIGAUSER
 */
public class Propietario {
    private String nombre;
    private String cedula;
    private ArrayList<Mascota> mascotas;

    public Propietario() {
    }

    public Propietario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.mascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", cedula=" + cedula + ", mascotas=" + mascotas + '}';
    }
    
    
}
