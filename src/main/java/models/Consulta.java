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
public class Consulta {
    private String fecha;
    private String diagnostico;
    private ArrayList<Medicamento> medicamentos;

    public Consulta() {
    }

    public Consulta(String fecha, String diagnostico) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.medicamentos = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "Consulta{" + "fecha=" + fecha + ", diagnostico=" + diagnostico + ", medicamentos=" + medicamentos + '}';
    }
    
    
    
    
}
