/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.simuladorautomovil.models.Vehiculo
 * @version 1.0.0
 * 
 */
public class Hospital {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private String logo;
    private double presupuesto;
    private double metaVentasAnual;
    private LocalDate fechaFundacion;
    private boolean estadoActivo;
    private Localizacion localizacion;
    private Gerente gerente;
    private ArrayList<Empleado>empleados;
    private ArrayList<Paciente> pacientes;
    private Inventario inventario;
    private ArrayList<Nomina>nominas;

    public Hospital(String nombre, String direccion, String telefono, String logo, double presupuesto, double metaVentasAnual, LocalDate fechaFundacion, boolean estadoActivo, Localizacion localizacion, Gerente gerente, ArrayList<Empleado> empleados, ArrayList<Paciente> pacientes, Inventario inventario, ArrayList<Nomina> nominas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estadoActivo = estadoActivo;
        this.localizacion = localizacion;
        this.gerente = gerente;
        this.empleados = empleados;
        this.pacientes = pacientes;
        this.inventario = inventario;
        this.nominas = nominas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
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

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public ArrayList<Nomina> getNominas() {
        return nominas;
    }

    public void setNominas(ArrayList<Nomina> nominas) {
        this.nominas = nominas;
    }
    
    
    public void generarNomina(){
        for (Empleado empleado : empleados) {
            double sueldo = empleado.calcularSalario();
            String nombreEmpleado = empleado.getNombre();  
            LocalDate fechaNomina = LocalDate.now();  
            Nomina nomina = new Nomina(nombreEmpleado, fechaNomina, sueldo); 
            nominas.add(nomina);
     }
        
    }
    
    public void registrarPatrocinio(double monto){

        if (monto > 0) {
            presupuesto += monto;  
            System.out.println("Patrocinio registrado exitosamente. Monto recibido: " + monto);
        } else {
            System.out.println("El monto del patrocinio debe ser mayor que 0.");
        }
    }
    
    public void descontarDelPresupuesto(double valor) {
        if (presupuesto >= valor) {
            presupuesto -= valor;
        } else {
            System.out.println("No hay suficiente presupuesto.");
        }

        
    }
    
    public String visualizarEstado(){
         return estadoActivo ? "El hospital está activo." : "El hospital está inactivo.";
    }
    
    public void comprarMedicamento(){
        
    }
    

}
