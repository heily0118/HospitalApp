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
    private boolean estadoHospital;
    private Localizacion localizacion;
    private Gerente gerente;
    private ArrayList<Empleado>empleados;
    private ArrayList<Paciente> pacientes;
    private Farmacia farmacia;
    private ArrayList<Nomina>nominas;

    public Hospital(String nombre, String direccion, String telefono, String logo, double presupuesto, double metaVentasAnual, LocalDate fechaFundacion, boolean estadoHospital, Localizacion localizacion, Gerente gerente, ArrayList<Empleado> empleados, ArrayList<Paciente> pacientes,Farmacia Farmacia , ArrayList<Nomina> nominas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estadoHospital = estadoHospital;
        this.localizacion = localizacion;
        this.gerente = gerente;
        this.empleados = empleados;
        this.pacientes = pacientes;
        this.farmacia =  farmacia;
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

    public boolean isEstadoHospital() {
        return estadoHospital;
    }

    public void setEstadoHospital(boolean estadoHospital) {
        this.estadoHospital = estadoHospital;
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

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

   

    public ArrayList<Nomina> getNominas() {
        return nominas;
    }

    public void setNominas(ArrayList<Nomina> nominas) {
        this.nominas = nominas;
    }
    
    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    public boolean eliminarEmpleado(String nombre) {
        Empleado empleadoAEliminar = buscarEmpleado(nombre);

        if (empleadoAEliminar != null) {
            empleados.remove(empleadoAEliminar); 
            System.out.println("Empleado eliminado: " + nombre);
            return true;  
        } else {
            
            return false;  
        }
    }

    public void actualizarEmpleado(String nombre, Empleado empleadoActualizado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equals(nombre)) {
                empleados.set(i, empleadoActualizado);
                System.out.println("Empleado actualizado: " + nombre);
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    public Empleado buscarEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        System.out.println("Empleado no encontrado.");
        return null;
    }


    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente agregado: " + paciente.getNombre());
    }

    public void eliminarPaciente(String nombre) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getNombre().equals(nombre)) {
                pacientes.remove(i);
                System.out.println("Paciente eliminado: " + nombre);
                return;
            }
        }
        System.out.println("Paciente no encontrado.");
    }
    



    public void actualizarPaciente(String nombre, Paciente pacienteActualizado) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getNombre().equals(nombre)) {
                pacientes.set(i, pacienteActualizado);
                System.out.println("Paciente actualizado: " + nombre);
                return;
            }
        }
        System.out.println("Paciente no encontrado.");
    }

    public Paciente buscarPaciente(String nombre) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNombre().equals(nombre)) {
                return paciente;
            }
        }
        System.out.println("Paciente no encontrado.");
        return null;
    }

    
    public void generarNomina() {
        for (Empleado empleado : empleados) {
            double sueldo = empleado.calcularSalario();
            String nombreEmpleado = empleado.getNombre();
            LocalDate fechaNomina = LocalDate.now();
            Nomina nomina = new Nomina(nombreEmpleado, fechaNomina, sueldo);
            nominas.add(nomina);
        }
    }

    public void registrarPatrocinio(double monto) {
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

    public String visualizarEstado() {
        return estadoHospital ? "El hospital está activo." : "El hospital esta en quiebra.";
    }

    public void comprarMedicamento(Medicamento medicamento, int cantidad) {
        if (visualizarEstado().equals("El hospital está en quiebra.")) {
            System.out.println("No se puede agregar medicamentos, el hospital está en quiebra.");
            return;
        }

        double costoTotal = medicamento.getCosto() * cantidad;
        if (presupuesto >= costoTotal) {
            farmacia.getInventario().agregarMedicamento(medicamento, cantidad);
            presupuesto -= costoTotal;
            System.out.println("Medicamento comprado exitosamente: " + medicamento.getNombre() + ", Cantidad: " + cantidad);
        } else {
            System.out.println("No hay suficiente presupuesto para comprar el medicamento.");
        }
    }
}