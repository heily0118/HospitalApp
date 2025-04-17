/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.util.ArrayList;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.simuladorautomovil.models.Vehiculo
 * @version 1.0.0
 */
public class Inventario {
    private String codigo;
    private int anioActualizacion;
    private ArrayList <Medicamento> medicamentos;

    public Inventario(String codigo, int anioActualizacion) {
        this.codigo = codigo;
        this.anioActualizacion = anioActualizacion;
        this.medicamentos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnioActualizacion() {
        return anioActualizacion;
    }

    public void setAnioActualizacion(int anioActualizacion) {
        this.anioActualizacion = anioActualizacion;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    
    public void agregarMedicamento(Medicamento medicamento, int cantidad) {
        Medicamento existente = buscarPorNombre(medicamento.getNombre());

        if (existente != null) {
            
            existente.setCantidad(existente.getCantidad() + cantidad);
        } else {
            
            medicamento.setCantidad(cantidad);
            medicamentos.add(medicamento);
        }
    }

   
    public boolean eliminarMedicamento(String nombre) {
        Medicamento medicamento = buscarPorNombre(nombre);
        if (medicamento != null) {
            medicamentos.remove(medicamento);
            return true; 
        }
        return false; 
    }

    
    public Medicamento buscarPorNombre(String nombre) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNombre().equals(nombre)) {
                return medicamento;
            }
        }
        return null; 
    }

  
    public ArrayList<Medicamento> obtenerListaMedicamentos() {
        return medicamentos;
    }
}
