/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.CamposObligatoriosException;
import autonoma.hospitalapp.exceptions.CaracteresEspecialesException;
import autonoma.hospitalapp.exceptions.CorreoInvalidoException;
import autonoma.hospitalapp.exceptions.DatoInvalidoException;
import autonoma.hospitalapp.exceptions.EstadoDePacienteInvalidoException;
import autonoma.hospitalapp.exceptions.HospitalEnQuiebraException;
import autonoma.hospitalapp.exceptions.MedicamentoNoEncontradoException;
import autonoma.hospitalapp.exceptions.PacienteDuplicadoException;
import autonoma.hospitalapp.exceptions.PacienteNoEncontradoException;
import java.util.ArrayList;

/**
* @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.simuladorautomovil.models.Vehiculo
 * @version 1.0.0
 */
public class SistemaCentral {
    
    private Hospital hospital;
    

    public SistemaCentral(Hospital hospital) {
        this.hospital = hospital;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }


            
    public void agregarEmpleados(Empleado empleado) {
        
        hospital.agregarEmpleado(empleado);
    }

   public boolean eliminarEmpleado(String nombre) {
        boolean eliminado = hospital.eliminarEmpleado(nombre);  
        return eliminado;  
    }
    public Empleado buscarEmpleado(String nombre) {
        return hospital.buscarEmpleado(nombre);
    }

    public void actualizarEmpleado(Empleado empleado) {
        hospital.actualizarEmpleado(empleado.getNombre(),empleado);
    }
  
    
    public ArrayList<Empleado> obtenerEmpleados() {
         return hospital.getEmpleados();
    }
    
    public void agregarPacientes(Paciente paciente) throws DatoInvalidoException, CamposObligatoriosException, PacienteDuplicadoException, CorreoInvalidoException, 
            CaracteresEspecialesException, EstadoDePacienteInvalidoException{
       
       
        hospital.agregarPaciente(paciente);
    }

    public boolean eliminarPaciente(String nombre) throws PacienteNoEncontradoException {
          boolean eliminadoPaciente = hospital.eliminarPaciente(nombre);
        return eliminadoPaciente;
    }

    public Paciente buscarPaciente(String nombre) {
        return hospital.buscarPaciente(nombre);
    }

    public void actualizarPaciente(Paciente paciente) throws DatoInvalidoException, CamposObligatoriosException, PacienteDuplicadoException, CorreoInvalidoException, 
            CaracteresEspecialesException, EstadoDePacienteInvalidoException{
        hospital.actualizarPaciente(paciente.getNombre(),paciente);
    }

   
    public void realizarCompra(Medicamento medicamento, int cantidad) throws HospitalEnQuiebraException {
        hospital.comprarMedicamento(medicamento, cantidad);
    }
    
    public boolean eliminarMedicamento(String nombre) throws MedicamentoNoEncontradoException {
        return hospital.eliminarMedicamento(nombre);
    }
    
     public ArrayList<Medicamento> obtenerMedicamentos() {
         return hospital.obtenerMedicamentos();
    }
     
     
     public Medicamento buscarMedicamento(String nombre) throws MedicamentoNoEncontradoException {
        Medicamento medicamento = hospital.buscarMedicamento(nombre);
        if (medicamento != null) {
            return medicamento;
        } else {
            throw new MedicamentoNoEncontradoException();
        }
    }
    /**
     * Genera la nómina de todos los empleados del hospital.
     * Si el presupuesto no es suficiente o si el hospital está en quiebra, lanza una excepción.
     */
    public void generarNomina() throws HospitalEnQuiebraException {
       
        if (!hospital.isEstadoHospital()) {
            throw new HospitalEnQuiebraException();
        }

       
        double totalNomina = 0;
        for (Empleado empleado : hospital.getEmpleados()) {
            totalNomina += empleado.calcularSalario(); 
        }

        if (hospital.getPresupuesto() >= totalNomina) {
           
            hospital.generarNomina(); 
            hospital.descontarDelPresupuesto(totalNomina); 
        } else {
            throw new HospitalEnQuiebraException();
        }
    }
}
