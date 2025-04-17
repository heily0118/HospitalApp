/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospitalapp.views;

import autonoma.hospitalapp.exceptions.HospitalEnQuiebraException;
import autonoma.hospitalapp.models.Empleado;
import autonoma.hospitalapp.models.Nomina;
import autonoma.hospitalapp.models.SistemaCentral;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.simuladorautomovil.models.Hospital
 * @version 1.0.0
 */
public class GenerarNomina extends javax.swing.JDialog {
    private SistemaCentral sistema;

    /**
     * Creates new form GenerarNomina
     */
    public GenerarNomina(java.awt.Frame parent, boolean modal, SistemaCentral sistema) {
        super(parent, modal);
        initComponents();
        setSize(620, 700);
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        
        String estado = sistema.getHospital().visualizarEstado();  
        estadoHospital.setText(estado); 
         
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrarPatrocinio = new javax.swing.JButton();
        btnGenerarNomina = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaEmpleados = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        totalNomina = new javax.swing.JTextField();
        estadoHospital = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        presupuestoTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        presupuestoRestante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnRegistrarPatrocinio.setBackground(new java.awt.Color(255, 0, 51));
        btnRegistrarPatrocinio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarPatrocinio.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPatrocinio.setText("Registrar Patrocinio");
        btnRegistrarPatrocinio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPatrocinioActionPerformed(evt);
            }
        });

        btnGenerarNomina.setBackground(new java.awt.Color(0, 102, 51));
        btnGenerarNomina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerarNomina.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarNomina.setText("Generar Nomina");
        btnGenerarNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNominaActionPerformed(evt);
            }
        });

        Atras.setBackground(new java.awt.Color(204, 0, 51));
        Atras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Atras.setForeground(new java.awt.Color(255, 255, 255));
        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        ListaEmpleados.setEditable(false);
        ListaEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        ListaEmpleados.setColumns(20);
        ListaEmpleados.setRows(5);
        ListaEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(ListaEmpleados);

        jLabel2.setText("Total nomina");

        totalNomina.setEditable(false);
        totalNomina.setBackground(new java.awt.Color(255, 255, 255));
        totalNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalNominaActionPerformed(evt);
            }
        });

        estadoHospital.setEditable(false);
        estadoHospital.setBackground(new java.awt.Color(255, 255, 255));
        estadoHospital.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estadoHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoHospitalActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado hospial:");

        presupuestoTotal.setEditable(false);
        presupuestoTotal.setBackground(new java.awt.Color(255, 255, 255));
        presupuestoTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        presupuestoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presupuestoTotalActionPerformed(evt);
            }
        });

        jLabel4.setText("Presupuesto");

        presupuestoRestante.setEditable(false);
        presupuestoRestante.setBackground(new java.awt.Color(255, 255, 255));
        presupuestoRestante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        presupuestoRestante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presupuestoRestanteActionPerformed(evt);
            }
        });

        jLabel5.setText("Presupuetso restante:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(totalNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Atras)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(estadoHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(presupuestoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(presupuestoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarPatrocinio)
                            .addComponent(btnGenerarNomina))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadoHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(presupuestoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(presupuestoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totalNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnRegistrarPatrocinio)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarNomina)
                    .addComponent(Atras))
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(205, 205, 250));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Generar nomina");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void btnRegistrarPatrocinioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPatrocinioActionPerformed
       String input = JOptionPane.showInputDialog(this, "¿Cuánto deseas registrar como patrocinio?");
    
               if (input != null) {
                try {
                    double monto = Double.parseDouble(input);

                    if (monto <= 0) {
                        JOptionPane.showMessageDialog(this, "El monto debe ser mayor que 0.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    sistema.getHospital().registrarPatrocinio(monto);
                    JOptionPane.showMessageDialog(this, "Patrocinio registrado con éxito por $" + monto);
                    estadoHospital.setText(sistema.getHospital().visualizarEstado());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Por favor ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_btnRegistrarPatrocinioActionPerformed

    private void btnGenerarNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNominaActionPerformed
        try {
         sistema.generarNomina(); 
         JOptionPane.showMessageDialog(this, "¡Nómina generada exitosamente!");


         StringBuilder empleadosStr = new StringBuilder("Lista de empleados y sus salarios:\n\n");
         double total = 0;

         for (Empleado emp : sistema.getHospital().getEmpleados()) {
             double salario = emp.calcularSalario();
             empleadosStr.append(emp.getNombre())
                         .append(" - $")
                         .append(String.format("%.2f", salario))
                         .append("\n");
             total += salario;
         }

         ListaEmpleados.setText(empleadosStr.toString());
         totalNomina.setText(String.format("%.2f", total));



         double presupuesto = sistema.getHospital().getPresupuesto();
         double restante = presupuesto - total;
         presupuestoRestante.setText("$" + String.format("%.2f", restante));
         presupuestoTotal.setText("$" +String.format("%.2f", presupuesto));
         estadoHospital.setText(String.format(sistema.getHospital().visualizarEstado()));

     } catch (HospitalEnQuiebraException e) {
         JOptionPane.showMessageDialog(this, "El hospital está en quiebra. No se puede generar la nómina.", "Error", JOptionPane.ERROR_MESSAGE);
     } catch (Exception e) {
         JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_btnGenerarNominaActionPerformed

    private void estadoHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoHospitalActionPerformed
      String estado = sistema.getHospital().visualizarEstado();
       estadoHospital.setText(estado);
    }//GEN-LAST:event_estadoHospitalActionPerformed

    private void totalNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalNominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalNominaActionPerformed

    private void presupuestoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presupuestoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presupuestoTotalActionPerformed

    private void presupuestoRestanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presupuestoRestanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presupuestoRestanteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JTextArea ListaEmpleados;
    private javax.swing.JButton btnGenerarNomina;
    private javax.swing.JButton btnRegistrarPatrocinio;
    private javax.swing.JTextField estadoHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField presupuestoRestante;
    private javax.swing.JTextField presupuestoTotal;
    private javax.swing.JTextField totalNomina;
    // End of variables declaration//GEN-END:variables
}
