/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.HospitalEnQuiebraException;
import java.io.IOException;

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

   /**
     * Constructor de la clase Farmacia.
     * 
     * @param inventario El inventario de medicamentos.
     */
    public Farmacia(Inventario inventario,Hospital hospital) {
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

    /**
     * Agrega un medicamento al inventario y descuenta el presupuesto del hospital.
     * Verifica si el hospital está en quiebra antes de realizar la compra.
     * 
     * @param medicamento El medicamento a agregar.
     * @throws HospitalEnQuiebraException Si el hospital está en quiebra.
     */
    public void agregarMedicamento(Medicamento medicamento, int cantidad) throws HospitalEnQuiebraException {
      
        if (hospital.visualizarEstado().equals("El hospital esta en quiebra.")) {
            throw new HospitalEnQuiebraException(); 
        }

        double costoTotal = medicamento.getCosto() * cantidad;  
        medicamento.calcularPrecioVenta();  
        
        hospital.descontarDelPresupuesto(costoTotal); 
        inventario.agregarMedicamento(medicamento, cantidad); 
    }


    /**
     * Elimina un medicamento del inventario por su nombre.
     * 
     * @param nombre El nombre del medicamento a eliminar.
     */
    public void eliminarMedicamento(String nombre) {
        inventario.eliminarMedicamento(nombre); 
    }

    /**
     * Busca un medicamento en el inventario por su nombre.
     * 
     * @param nombre El nombre del medicamento a buscar.
     * @return El medicamento encontrado, o null si no existe.
     */
    public Medicamento buscarMedicamento(String nombre) {
        return inventario.buscarPorNombre(nombre); 
    }

    /**
     * Muestra todos los medicamentos del inventario.
     * 
     * @return Un string con la lista de todos los medicamentos.
     */
    public String mostrarMedicamentos() {
        return inventario.mostrarMedicamentos();
    }

    
    
}

