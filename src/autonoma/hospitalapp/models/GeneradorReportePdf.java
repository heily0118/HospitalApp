/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class GeneradorReportePdf {
    
    private ArrayList<Empleado>empleados;
    private ArrayList<Paciente> pacientes;
    private Farmacia farmacia;

    public GeneradorReportePdf() {
        this.empleados = empleados;
        this.pacientes = pacientes;
        this.farmacia = farmacia;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }
    
    
    
    
    public void generarReporteEmpleados(){
        
    }
    
    public void generarReportePacientes(){
        
    }
    
    public void generarReporteFarmacia(){
        
    }
}
