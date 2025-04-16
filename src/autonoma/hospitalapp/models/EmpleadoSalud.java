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
public class EmpleadoSalud extends Empleado{
    
    private String especialidad;
    private int horasTrabajadas;

    public EmpleadoSalud(String especialidad, int horasTrabajadas, String nombre, String documento, int edad, double salarioBase) {
        super(nombre, documento, edad, salarioBase);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    

    @Override
    public double calcularSalario() {
         return getSalarioBase() + (getSalarioBase() * 0.012 * horasTrabajadas);
    }

    @Override
    public String getTipoEmpleado() {
     return "Salud";
    }

    
    
}
