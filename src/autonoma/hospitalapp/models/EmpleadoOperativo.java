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
public class EmpleadoOperativo extends Empleado{
    
    private String area;

    public EmpleadoOperativo(String area, String nombre, String documento, int edad, double salarioBase) {
        super(nombre, documento, edad, salarioBase);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
   
    

    @Override
    public double calcularSalario() {
         return getSalarioBase() * 1.2;
    }
    
}
