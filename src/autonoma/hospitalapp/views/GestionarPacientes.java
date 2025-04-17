/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospitalapp.views;

import autonoma.hospitalapp.models.Hospital;
import autonoma.hospitalapp.models.Paciente;
import autonoma.hospitalapp.models.SistemaCentral;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author María Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.simuladorautomovil.views.GestionarPacientes
 * @version 1.0.0
 */
public class GestionarPacientes extends javax.swing.JDialog {
    private SistemaCentral sistema;
    private VentanaPrincipal ventanaPrincipal;

    /**
     * Creates new form GestionarPacientes
     */
    public GestionarPacientes(java.awt.Frame parent, boolean modal,SistemaCentral sistema) {
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

        jPanel1 = new javax.swing.JPanel();
        btnAgregarPaciente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nombreHospital = new javax.swing.JLabel();
        btnMostrarPacientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDiagnosticar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCurar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarPacienteMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/AgregarPaciente.png"))); // NOI18N

        jlabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlabel4.setText("Agregar Paciente");

        javax.swing.GroupLayout btnAgregarPacienteLayout = new javax.swing.GroupLayout(btnAgregarPaciente);
        btnAgregarPaciente.setLayout(btnAgregarPacienteLayout);
        btnAgregarPacienteLayout.setHorizontalGroup(
            btnAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarPacienteLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(btnAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarPacienteLayout.createSequentialGroup()
                        .addComponent(jlabel4)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarPacienteLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33))))
        );
        btnAgregarPacienteLayout.setVerticalGroup(
            btnAgregarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarPacienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jlabel4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(195, 195, 243));

        nombreHospital.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        nombreHospital.setForeground(new java.awt.Color(255, 255, 255));
        nombreHospital.setText("Módulo de Pacientes ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(nombreHospital)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(nombreHospital)
                .addGap(31, 31, 31))
        );

        btnMostrarPacientes.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarPacientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMostrarPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarPacientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarPacientesMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/MostrarListaDePacientes.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Mostrar Pacientes");

        javax.swing.GroupLayout btnMostrarPacientesLayout = new javax.swing.GroupLayout(btnMostrarPacientes);
        btnMostrarPacientes.setLayout(btnMostrarPacientesLayout);
        btnMostrarPacientesLayout.setHorizontalGroup(
            btnMostrarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarPacientesLayout.createSequentialGroup()
                .addGroup(btnMostrarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnMostrarPacientesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(btnMostrarPacientesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMostrarPacientesLayout.setVerticalGroup(
            btnMostrarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMostrarPacientesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnDiagnosticar.setBackground(new java.awt.Color(255, 255, 255));
        btnDiagnosticar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDiagnosticar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiagnosticarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDiagnosticarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDiagnosticarMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/DiagnosticarPacientes.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Diagnosticar Enfermedad");

        javax.swing.GroupLayout btnDiagnosticarLayout = new javax.swing.GroupLayout(btnDiagnosticar);
        btnDiagnosticar.setLayout(btnDiagnosticarLayout);
        btnDiagnosticarLayout.setHorizontalGroup(
            btnDiagnosticarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDiagnosticarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(51, 51, 51))
            .addGroup(btnDiagnosticarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnDiagnosticarLayout.setVerticalGroup(
            btnDiagnosticarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDiagnosticarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(14, 14, 14))
        );

        btnCurar.setBackground(new java.awt.Color(255, 255, 255));
        btnCurar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCurarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCurarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCurarMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/CurarEnfermedad.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Curar Enfermedad");

        javax.swing.GroupLayout btnCurarLayout = new javax.swing.GroupLayout(btnCurar);
        btnCurar.setLayout(btnCurarLayout);
        btnCurarLayout.setHorizontalGroup(
            btnCurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCurarLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(16, 16, 16))
            .addGroup(btnCurarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCurarLayout.setVerticalGroup(
            btnCurarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCurarLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDiagnosticar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDiagnosticar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnMostrarPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPacienteMouseClicked
        AgregarPaciente ventanaAgregarPaciente = new AgregarPaciente(this, true, sistema);
        ventanaAgregarPaciente.setVisible(true);
    }//GEN-LAST:event_btnAgregarPacienteMouseClicked

    private void btnAgregarPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPacienteMouseEntered
        this.mouseEntered(btnAgregarPaciente);
    }//GEN-LAST:event_btnAgregarPacienteMouseEntered

    private void btnAgregarPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPacienteMouseExited
        this.mouseExited(btnAgregarPaciente);
    }//GEN-LAST:event_btnAgregarPacienteMouseExited

    private void btnMostrarPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarPacientesMouseClicked
        MostrarPacientes ventanaMostrarPacientes = new MostrarPacientes(null, true, sistema, ventanaPrincipal);
        ventanaMostrarPacientes.setVisible(true);
    }//GEN-LAST:event_btnMostrarPacientesMouseClicked

    private void btnMostrarPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarPacientesMouseEntered
        this.mouseEntered(btnMostrarPacientes);
    }//GEN-LAST:event_btnMostrarPacientesMouseEntered

    private void btnMostrarPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarPacientesMouseExited
        this.mouseExited(btnMostrarPacientes);
    }//GEN-LAST:event_btnMostrarPacientesMouseExited

    private void btnDiagnosticarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiagnosticarMouseClicked
        DiagnosticarEnfermedad ventanaDiagnosticarEnfermedad = new DiagnosticarEnfermedad(null, true, sistema);
        ventanaDiagnosticarEnfermedad.setVisible(true);
    }//GEN-LAST:event_btnDiagnosticarMouseClicked

    private void btnDiagnosticarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiagnosticarMouseEntered
        this.mouseEntered(btnDiagnosticar);
    }//GEN-LAST:event_btnDiagnosticarMouseEntered

    private void btnDiagnosticarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiagnosticarMouseExited
        this.mouseExited(btnDiagnosticar);
    }//GEN-LAST:event_btnDiagnosticarMouseExited

    private void btnCurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCurarMouseClicked
        CurarEnfermedad ventanaCurarEnfermedad = new CurarEnfermedad(null, true, sistema);
        ventanaCurarEnfermedad.setVisible(true);
    }//GEN-LAST:event_btnCurarMouseClicked

    private void btnCurarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCurarMouseEntered
        this.mouseEntered(btnCurar);
    }//GEN-LAST:event_btnCurarMouseEntered

    private void btnCurarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCurarMouseExited
        this.mouseExited(btnCurar);
    }//GEN-LAST:event_btnCurarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAgregarPaciente;
    private javax.swing.JPanel btnCurar;
    private javax.swing.JPanel btnDiagnosticar;
    private javax.swing.JPanel btnMostrarPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel nombreHospital;
    // End of variables declaration//GEN-END:variables

    private void mouseEntered(JPanel panel) {
        panel.setBackground(new Color(200,255,255));
    }

    private void mouseExited(JPanel panel) {
        panel.setBackground(new Color(255,255,255));
    }
}
