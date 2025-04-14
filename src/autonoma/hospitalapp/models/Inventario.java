/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

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

    public Inventario(String codigo, int anioActualizacion) {
        this.codigo = codigo;
        this.anioActualizacion = anioActualizacion;
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
    
    
}
