/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.hospitalapp.main;

import autonoma.hospitalapp.views.VentanaPrincipal;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 */
public class HospitalApp {

    public static void main(String[] args) {
        HospitalApp hospitalapp = new HospitalApp();
        
        VentanaPrincipal ventana = new VentanaPrincipal(hospitalapp);
        ventana.setVisible(true);
    }
    
}
