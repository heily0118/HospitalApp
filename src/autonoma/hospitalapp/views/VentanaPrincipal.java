/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.hospitalapp.views;

import autonoma.hospitalapp.models.SistemaCentral;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @author Maria Paz Puerta Acevedo <maria>
 * @since 20250414
 * @see autonoma.simuladorautomovil.models.Hospital
 * @version 1.0.0
 */
public class VentanaPrincipal extends javax.swing.JFrame {
   private SistemaCentral sistema;

    /**
     * Creates new form VentanaPrincipal
     * @param sistema
     */
    public VentanaPrincipal(SistemaCentral sistema) {
        initComponents();
        setSize(620, 700);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
         
         try{ 
        this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/HospitalApp/images/hospital.png")).getImage());
        
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

        titulo = new javax.swing.JPanel();
        nombreHospital = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        informacionHospital = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGestionarEmpleados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGestionarPacientes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGestionarFarmacia = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGestionarReportes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGenerarNomina = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setBackground(new java.awt.Color(153, 153, 255));

        nombreHospital.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        nombreHospital.setForeground(new java.awt.Color(255, 255, 255));
        nombreHospital.setText("SISTEMA DE CONTROL");

        javax.swing.GroupLayout tituloLayout = new javax.swing.GroupLayout(titulo);
        titulo.setLayout(tituloLayout);
        tituloLayout.setHorizontalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombreHospital)
                .addGap(81, 81, 81))
        );
        tituloLayout.setVerticalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(nombreHospital)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        informacionHospital.setBackground(new java.awt.Color(255, 255, 255));
        informacionHospital.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        informacionHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informacionHospitalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                informacionHospitalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                informacionHospitalMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/Informacion.png"))); // NOI18N

        jLabel12.setText("Informacion hospital");

        javax.swing.GroupLayout informacionHospitalLayout = new javax.swing.GroupLayout(informacionHospital);
        informacionHospital.setLayout(informacionHospitalLayout);
        informacionHospitalLayout.setHorizontalGroup(
            informacionHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionHospitalLayout.createSequentialGroup()
                .addGroup(informacionHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacionHospitalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(informacionHospitalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        informacionHospitalLayout.setVerticalGroup(
            informacionHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionHospitalLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(14, 14, 14))
        );

        btnGestionarEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGestionarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionarEmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarEmpleadosMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Gestionar empleados");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/Empleados.png"))); // NOI18N

        javax.swing.GroupLayout btnGestionarEmpleadosLayout = new javax.swing.GroupLayout(btnGestionarEmpleados);
        btnGestionarEmpleados.setLayout(btnGestionarEmpleadosLayout);
        btnGestionarEmpleadosLayout.setHorizontalGroup(
            btnGestionarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGestionarEmpleadosLayout.createSequentialGroup()
                .addGroup(btnGestionarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnGestionarEmpleadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(btnGestionarEmpleadosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnGestionarEmpleadosLayout.setVerticalGroup(
            btnGestionarEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGestionarEmpleadosLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12))
        );

        btnGestionarPacientes.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarPacientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGestionarPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionarPacientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarPacientesMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Gestionar Pacientes");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/Pacientes.png"))); // NOI18N

        javax.swing.GroupLayout btnGestionarPacientesLayout = new javax.swing.GroupLayout(btnGestionarPacientes);
        btnGestionarPacientes.setLayout(btnGestionarPacientesLayout);
        btnGestionarPacientesLayout.setHorizontalGroup(
            btnGestionarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGestionarPacientesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGestionarPacientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(30, 30, 30))
        );
        btnGestionarPacientesLayout.setVerticalGroup(
            btnGestionarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGestionarPacientesLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        btnGestionarFarmacia.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarFarmacia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGestionarFarmacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionarFarmaciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarFarmaciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarFarmaciaMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Gestionar Farmacia");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/Farmacia.png"))); // NOI18N

        javax.swing.GroupLayout btnGestionarFarmaciaLayout = new javax.swing.GroupLayout(btnGestionarFarmacia);
        btnGestionarFarmacia.setLayout(btnGestionarFarmaciaLayout);
        btnGestionarFarmaciaLayout.setHorizontalGroup(
            btnGestionarFarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGestionarFarmaciaLayout.createSequentialGroup()
                .addGroup(btnGestionarFarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnGestionarFarmaciaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8))
                    .addGroup(btnGestionarFarmaciaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnGestionarFarmaciaLayout.setVerticalGroup(
            btnGestionarFarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGestionarFarmaciaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(16, 16, 16))
        );

        btnGestionarReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionarReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGestionarReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionarReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionarReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionarReportesMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Gestionar reportes");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/Reportes.png"))); // NOI18N

        javax.swing.GroupLayout btnGestionarReportesLayout = new javax.swing.GroupLayout(btnGestionarReportes);
        btnGestionarReportes.setLayout(btnGestionarReportesLayout);
        btnGestionarReportesLayout.setHorizontalGroup(
            btnGestionarReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGestionarReportesLayout.createSequentialGroup()
                .addGroup(btnGestionarReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnGestionarReportesLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9))
                    .addGroup(btnGestionarReportesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnGestionarReportesLayout.setVerticalGroup(
            btnGestionarReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGestionarReportesLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(14, 14, 14))
        );

        btnGenerarNomina.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerarNomina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGenerarNomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarNominaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarNominaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarNominaMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Generar nomina");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/Salario.png"))); // NOI18N

        javax.swing.GroupLayout btnGenerarNominaLayout = new javax.swing.GroupLayout(btnGenerarNomina);
        btnGenerarNomina.setLayout(btnGenerarNominaLayout);
        btnGenerarNominaLayout.setHorizontalGroup(
            btnGenerarNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGenerarNominaLayout.createSequentialGroup()
                .addGroup(btnGenerarNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnGenerarNominaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(btnGenerarNominaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnGenerarNominaLayout.setVerticalGroup(
            btnGenerarNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGenerarNominaLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGestionarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionarFarmacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerarNomina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGestionarReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionarPacientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informacionHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGestionarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionarPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGestionarFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestionarReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerarNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informacionHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleadosMouseClicked
       GestionarEmpleados ventanaEmpleados = new GestionarEmpleados(this, true,sistema,this);
       ventanaEmpleados.setVisible(true);
    }//GEN-LAST:event_btnGestionarEmpleadosMouseClicked

    private void btnGestionarEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleadosMouseEntered
        this.mouseEntered(btnGestionarEmpleados);
    }//GEN-LAST:event_btnGestionarEmpleadosMouseEntered

    private void btnGestionarEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarEmpleadosMouseExited
        this.mouseExited(btnGestionarEmpleados);
    }//GEN-LAST:event_btnGestionarEmpleadosMouseExited

    private void btnGestionarPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarPacientesMouseClicked
       GestionarPacientes ventanaPacientes = new GestionarPacientes(this, true,sistema);
       ventanaPacientes.setVisible(true);
    }//GEN-LAST:event_btnGestionarPacientesMouseClicked

    private void btnGestionarPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarPacientesMouseEntered
      this.mouseEntered(btnGestionarPacientes);
    }//GEN-LAST:event_btnGestionarPacientesMouseEntered

    private void btnGestionarPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarPacientesMouseExited
       this.mouseExited(btnGestionarPacientes);
    }//GEN-LAST:event_btnGestionarPacientesMouseExited

    private void btnGestionarFarmaciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarFarmaciaMouseClicked
       GestionarFarmacia ventanaFarmacia = new GestionarFarmacia(this, true,sistema);
       ventanaFarmacia.setVisible(true);
    }//GEN-LAST:event_btnGestionarFarmaciaMouseClicked

    private void btnGestionarFarmaciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarFarmaciaMouseEntered
       this.mouseEntered(btnGestionarFarmacia);
    }//GEN-LAST:event_btnGestionarFarmaciaMouseEntered

    private void btnGestionarFarmaciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarFarmaciaMouseExited
       this.mouseExited(btnGestionarFarmacia);
    }//GEN-LAST:event_btnGestionarFarmaciaMouseExited

    private void btnGestionarReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarReportesMouseClicked
       GestionarReportes ventanaReportes = new GestionarReportes(this, true,sistema);
       ventanaReportes.setVisible(true);
    }//GEN-LAST:event_btnGestionarReportesMouseClicked

    private void btnGestionarReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarReportesMouseEntered
       this.mouseEntered(btnGestionarReportes);
    }//GEN-LAST:event_btnGestionarReportesMouseEntered

    private void btnGestionarReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarReportesMouseExited
       this.mouseExited(btnGestionarReportes);
    }//GEN-LAST:event_btnGestionarReportesMouseExited

    private void informacionHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacionHospitalMouseClicked
       InformacionHospital ventanaHospital= new InformacionHospital(this, true,sistema);
       ventanaHospital.setVisible(true);
    }//GEN-LAST:event_informacionHospitalMouseClicked

    private void informacionHospitalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacionHospitalMouseEntered
        this.mouseEntered(informacionHospital);
    }//GEN-LAST:event_informacionHospitalMouseEntered

    private void informacionHospitalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacionHospitalMouseExited
       this.mouseExited(informacionHospital);
    }//GEN-LAST:event_informacionHospitalMouseExited

    private void btnGenerarNominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarNominaMouseClicked
       GenerarNomina ventanaNomina= new GenerarNomina(this, true,sistema);
       ventanaNomina.setVisible(true);
    }//GEN-LAST:event_btnGenerarNominaMouseClicked

    private void btnGenerarNominaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarNominaMouseEntered
       this.mouseEntered(btnGenerarNomina);
    }//GEN-LAST:event_btnGenerarNominaMouseEntered

    private void btnGenerarNominaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarNominaMouseExited
         this.mouseExited(btnGenerarNomina);
    }//GEN-LAST:event_btnGenerarNominaMouseExited

    private void mouseEntered(JPanel panel){
        panel.setBackground(new Color(200,255,255));
        
    }
    private void mouseExited(JPanel panel){
        panel.setBackground(new Color(255,255,255));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGenerarNomina;
    private javax.swing.JPanel btnGestionarEmpleados;
    private javax.swing.JPanel btnGestionarFarmacia;
    private javax.swing.JPanel btnGestionarPacientes;
    private javax.swing.JPanel btnGestionarReportes;
    private javax.swing.JPanel informacionHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreHospital;
    private javax.swing.JPanel titulo;
    // End of variables declaration//GEN-END:variables
}
