/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.util.ArrayList;

/**
 * @author María Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.simuladorautomovil.models.GeneradorReportePdf
 * @version 1.0.0
 */
public class Reporte {
    /**
     * Lista de empleados
     */
    private ArrayList<Empleado> empleados;
    
    /**
     * Lista de pacientes.
     */
    private ArrayList<Paciente> pacientes; 
    
    /**
     * Objeto de Farmacia farmacia.
     */
    private Farmacia farmacia; 

    /**
     * Constructor de la clase GeneradorReportePdf.
     * @param empleados Es la lista de empleados que se utilizará en el reporte.
     * @param pacientes Es la lista de pacientes que se utilizará en el reporte.
     * @param farmacia Es el objeto de tipo Farmacia que se utilizará en el reporte.
     */
    public Reporte(ArrayList<Empleado> empleados, ArrayList<Paciente> pacientes, Farmacia farmacia) {
        this.empleados = empleados;
        this.pacientes = pacientes;
        this.farmacia = farmacia;
    }

    /**
     * Obtiene la lista de empleados.
     * @return Retorna la lista de empleados.
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Establece la lista de empleados.
     * @param empleados Es la lista de empleados a asignar.
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Obtiene la lista de pacientes.
     * @return Retorna la lista de pacientes.
     */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    /**
     * Establece la lista de pacientes.
     * @param pacientes Es la lista de pacientes a asignar.
     */
    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    /**
     * Obtiene el objeto Farmacia.
     * @return Retorna el objeto Farmacia.
     */
    public Farmacia getFarmacia() {
        return farmacia;
    }

    /**
     * Establece el objeto Farmacia.
     * @param farmacia Es el objeto Farmacia a asignar.
     */
    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

    /**
     * Genera un reporte de los empleados registrados.
     * Muestra el nombre, documento, edad y salario base de cada empleado.
     * Si no hay empleados, muestra un mensaje indicando que no hay registros.
     */
    public void generarReporteEmpleados(){
        System.out.println("===== REPORTE DE EMPLEADOS =====");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado e : empleados) {
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Documento: " + e.getDocumento());
                System.out.println("Edad: " + e.getEdad());
                System.out.println("Salario Base: $" + e.getSalarioBase());
                System.out.println("------------------------------------");
            }
        }
    }

    /**
     * Genera un reporte de los pacientes registrados.
     * Muestra el nombre, documento, edad, correo, teléfono, estado y lista de enfermedades y medicamentos de cada paciente.
     * Si no hay pacientes, muestra un mensaje indicando que no hay registros.
     */
    public void generarReportePacientes(){
        System.out.println("===== REPORTE DE PACIENTES =====");
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (Paciente p : pacientes) {
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Documento: " + p.getDocumento());
                System.out.println("Edad: " + p.getEdad());
                System.out.println("Correo: " + p.getCorreo());
                System.out.println("Teléfono: " + p.getTelefono());
                System.out.println("Estado: " + (p.isEstadoPaciente() ? "Activo" : "Inactivo"));

                System.out.println("Enfermedades:");
                if (p.getEnfermedades().isEmpty()) {
                    System.out.println("  - No registra enfermedades.");
                } else {
                    for (Enfermedad e : p.getEnfermedades()) {
                        System.out.println("  - " + e.getNombre()); 
                    }
                }

                System.out.println("Medicamentos:");
                if (p.getMedicinas().isEmpty()) {
                    System.out.println("  - No tiene medicamentos asignados.");
                } else {
                    for (Medicamento m : p.getMedicinas()) {
                        System.out.println("  - " + m.getNombre());
                    }
                }

                System.out.println("------------------------------------");
            }
        }
    }

    /**
     * Genera un reporte de la farmacia registrada.
     * Muestra el nombre y dirección del hospital asociado, así como el inventario de medicamentos de la farmacia.
     * Si no hay información de la farmacia, muestra un mensaje indicando que no hay registros.
     */
    public void generarReporteFarmacia(){
        System.out.println("===== REPORTE DE FARMACIA =====");

        if (farmacia == null) {
            System.out.println("No hay información de farmacia registrada.");
            return;
        }

        Hospital h = farmacia.getHospital();
        System.out.println("Hospital Asociado: " + h.getNombre());
        System.out.println("Dirección del Hospital: " + h.getDireccion());

        System.out.println("Inventario de Medicamentos:");

        ArrayList<Medicamento> medicamentos = farmacia.getInventario().getMedicamentos();
        if (medicamentos.isEmpty()) {
            System.out.println("  - No hay medicamentos en el inventario.");
        } else {
            for (Medicamento m : medicamentos) {
                System.out.println("  - " + m.getNombre());
            }
        }

        System.out.println("------------------------------------");
    }
}
