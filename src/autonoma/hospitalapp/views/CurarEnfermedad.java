/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospitalapp.views;

import autonoma.hospitalapp.models.SistemaCentral;
import javax.swing.ImageIcon;

/**
 *
 * @author Maria Paz Puerta
 */
public class CurarEnfermedad extends javax.swing.JDialog {

    private SistemaCentral sistema;
    /**
     * Creates new form CurarEnfermedad
     */
    public CurarEnfermedad(java.awt.Frame parent, boolean modal, SistemaCentral sistema) {
        super(parent, modal);
        initComponents();
        setSize(620, 700);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
         
        try{ 
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/HospitalApp/images/Hospital.png")).getImage());
        
        }catch(NullPointerException e){
            System.out.println("Imagen no encontrada");
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
