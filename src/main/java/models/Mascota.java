/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author GIGAUSER
 */
public class Mascota extends Animal {
    private String raza;
    private String sexo;
    private Propietario propietario;

    public Mascota() {
    }

    public Mascota(String raza, String sexo, Propietario propietario) {
        this.raza = raza;
        this.sexo = sexo;
        this.propietario = propietario;
    }

    public Mascota(String raza, String sexo, Propietario propietario, String nombre, String especie, String edad) {
        super(nombre, especie, edad);
        this.raza = raza;
        this.sexo = sexo;
        this.propietario = propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return super.toString() +
        "Mascota{" + "raza=" + raza + ", sexo=" + sexo + ", propietario=" + propietario + '}';
    }
    
    
}
