/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author María Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.simuladorautomovil.models.GeneradorReportePdf
 * @version 1.0.0
 */
public class GeneradorReportePdf {
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
     * Constructor vacío de la clase GeneradorReportePdf.
     * 
     */
    public GeneradorReportePdf() {
        
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
    public void generarReporteEmpleados() throws IOException{
        String rutaArchivo = "reporteEmpleados.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo));

        writer.write("===== REPORTE DE EMPLEADOS =====\n");
        if (empleados == null || empleados.isEmpty()) {
            writer.write("No hay empleados registrados.\n");
        } else {
            for (Empleado e : empleados) {
                writer.write("Nombre: " + e.getNombre() + "\n");
                writer.write("Documento: " + e.getDocumento() + "\n");
                writer.write("Edad: " + e.getEdad() + "\n");
                writer.write("Salario Base: $" + e.getSalarioBase() + "\n");
                writer.write("------------------------------------\n");
            }
        }

        writer.close();
    }

    /**
     * Genera un reporte de los pacientes registrados.
     * Muestra el nombre, documento, edad, correo, teléfono, estado y lista de enfermedades y medicamentos de cada paciente.
     * Si no hay pacientes, muestra un mensaje indicando que no hay registros.
     */
    public void generarReportePacientes() throws IOException{
        String rutaArchivo = "reportePacientes.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo));

        writer.write("===== REPORTE DE PACIENTES =====\n");
        if (pacientes == null || pacientes.isEmpty()) {
            writer.write("No hay pacientes registrados.\n");
        } else {
            for (Paciente p : pacientes) {
                writer.write("Nombre: " + p.getNombre() + "\n");
                writer.write("Documento: " + p.getDocumento() + "\n");
                writer.write("Edad: " + p.getEdad() + "\n");
                writer.write("Correo: " + p.getCorreo() + "\n");
                writer.write("Teléfono: " + p.getTelefono() + "\n");
                writer.write("Estado: " + (p.isEstadoPaciente() ? "Activo" : "Inactivo") + "\n");

                writer.write("Enfermedades:\n");
                if (p.getEnfermedades().isEmpty()) {
                    writer.write("  - No registra enfermedades.\n");
                } else {
                    for (Enfermedad e : p.getEnfermedades()) {
                        writer.write("  - " + e.getNombre() + "\n");
                    }
                }

                writer.write("Medicamentos:\n");
                if (p.getMedicinas().isEmpty()) {
                    writer.write("  - No tiene medicamentos asignados.\n");
                } else {
                    for (Medicamento m : p.getMedicinas()) {
                        writer.write("  - " + m.getNombre() + "\n");
                    }
                }

                writer.write("------------------------------------\n");
            }
        }

        writer.close();
    }

    /**
     * Genera un reporte de la farmacia registrada.
     * Muestra el nombre y dirección del hospital asociado, así como el inventario de medicamentos de la farmacia.
     * Si no hay información de la farmacia, muestra un mensaje indicando que no hay registros.
     */
    public void generarReporteFarmacia() throws IOException{
        String rutaArchivo = "reporteFarmacia.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo));

        writer.write("===== REPORTE DE FARMACIA =====\n");

        if (farmacia == null) {
            writer.write("No hay información de farmacia registrada.\n");
            writer.close();
            return;
        }

        Hospital h = farmacia.getHospital();
        if (h == null) {
            writer.write("No se pudo obtener la información del hospital.\n");
            writer.close();
            return;
        }

        writer.write(String.format("Hospital Asociado: %s\n", h.getNombre()));
        writer.write(String.format("Dirección del Hospital: %s\n", h.getDireccion()));

        writer.write("Inventario de Medicamentos:\n");

        ArrayList<Medicamento> medicamentos = farmacia.getInventario().getMedicamentos();
        if (medicamentos == null || medicamentos.isEmpty()) {
            writer.write("No hay medicamentos en el inventario.\n");
        } else {
            for (Medicamento m : medicamentos) {
                writer.write(String.format("  - %s\n", m.getNombre()));
            }
        }

        writer.write("------------------------------------\n");

        writer.close();
    }
}
