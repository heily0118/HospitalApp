/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.HospitalEnQuiebraException;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.simuladorautomovil.models.Vehiculo
 * @version 1.0.0
 */
public class Farmacia {
    private Inventario inventario;
    private Hospital hospital;

    public Farmacia(Inventario inventario, Hospital hospital) {
        this.inventario = inventario;
        this.hospital = hospital;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
        public void agregarMedicamento(Medicamento medicamento) throws HospitalEnQuiebraException {
        if (hospital.estaEnQuiebra()) {
            throw new HospitalEnQuiebraException();
        }
        medicamento.calcularPrecioVenta();
        hospital.descontarDelPresupuesto(medicamento.getCosto()); 
        inventario.agregarMedicamento(medicamento);
    }

    public void eliminarMedicamento(String nombre) {
        inventario.eliminarMedicamento(nombre);
    }

    public Medicamento buscarMedicamento(String nombre) {
        return inventario.buscarPorNombre(nombre);
    }

    public String mostrarMedicamentos() {
        return inventario.mostrarMedicamentos();
    }

    public void mostrarReporteInventario() {
        GeneradorReportePdf.generarReporteFarmacia();
    }

    
    
}
