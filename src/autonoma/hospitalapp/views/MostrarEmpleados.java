/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospitalapp.views;

import autonoma.hospitalapp.models.Empleado;
import autonoma.hospitalapp.models.Hospital;
import autonoma.hospitalapp.models.SistemaCentral;
import java.awt.Color;
import java.awt.Dialog;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250414
 * @see autonoma.simuladorautomovil.models.Hospital
 * @version 1.0.0
 */

public class MostrarEmpleados extends javax.swing.JDialog {
    private Hospital hospital;
    private SistemaCentral sistema;
    private Empleado empleado;

    /**
     * Creates new form MostrarEmpleados
     */
    public MostrarEmpleados(javax.swing.JDialog parent, boolean modal,SistemaCentral sistema) {
        super((Dialog) parent, modal);
        initComponents();
        setSize(620, 700);
        setResizable(false);
        this.setLocationRelativeTo(null);
        
         this.sistema = sistema;
         this.hospital = sistema.getHospital();
         
       
           
        try{ 
        this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/HospitalApp/images/hospital.png")).getImage());
        
        }catch(NullPointerException e){
            System.out.println("Imagen no encontrada");
            
        }
        EmpleadoBuscar.setText("Ingresa el nombre del empleado a buscar");
        EmpleadoBuscar.setForeground(Color.GRAY);
        
        ListaEmpleados.setSelectionBackground(new Color(198, 244, 214));
        
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
        ListEmpleados = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaEmpleados = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        btnMostrarEmpleados = new javax.swing.JButton();
        btnInformacionEmpleado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        EmpleadoBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ListEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        ListEmpleados.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ListaEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Documento", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ListaEmpleados.setGridColor(new java.awt.Color(255, 255, 255));
        ListaEmpleados.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(ListaEmpleados);
        if (ListaEmpleados.getColumnModel().getColumnCount() > 0) {
            ListaEmpleados.getColumnModel().getColumn(0).setResizable(false);
            ListaEmpleados.getColumnModel().getColumn(1).setResizable(false);
            ListaEmpleados.getColumnModel().getColumn(2).setResizable(false);
        }

        ListEmpleados.setViewportView(jScrollPane2);

        btnActualizar.setBackground(new java.awt.Color(0, 51, 153));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        btnMostrarEmpleados.setBackground(new java.awt.Color(0, 153, 51));
        btnMostrarEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMostrarEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarEmpleados.setText("Mostrar Empleados");
        btnMostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEmpleadosActionPerformed(evt);
            }
        });

        btnInformacionEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btnInformacionEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInformacionEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInformacionEmpleadoMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/mostrarInformacionEmpleado.png"))); // NOI18N

        javax.swing.GroupLayout btnInformacionEmpleadoLayout = new javax.swing.GroupLayout(btnInformacionEmpleado);
        btnInformacionEmpleado.setLayout(btnInformacionEmpleadoLayout);
        btnInformacionEmpleadoLayout.setHorizontalGroup(
            btnInformacionEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInformacionEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(114, 114, 114))
        );
        btnInformacionEmpleadoLayout.setVerticalGroup(
            btnInformacionEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInformacionEmpleadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(Atras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ListEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMostrarEmpleados)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEliminar)
                                            .addComponent(btnActualizar)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnInformacionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnInformacionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnMostrarEmpleados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(ListEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(Atras)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        EmpleadoBuscar.setText("Ingresa el nombre del empleado");
        EmpleadoBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpleadoBuscarMouseClicked(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(204, 204, 255));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/hospitalapp/images/buscar.png"))); // NOI18N

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmpleadoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmpleadoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
    DefaultTableModel modelo = (DefaultTableModel) ListaEmpleados.getModel();
    modelo.setRowCount(0); 

    String textoNombre = EmpleadoBuscar.getText().trim();
    if (textoNombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un nombre válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Empleado empleado = hospital.buscarEmpleado(textoNombre);
    if (empleado == null) {
        JOptionPane.showMessageDialog(this, "El empleado con nombre \"" + textoNombre + "\" no se encuentra en el hospital.", "Error", JOptionPane.ERROR_MESSAGE);
        EmpleadoBuscar.setText(""); 
        return;
    }

    modelo.addRow(new Object[]{
        empleado.getNombre(),
        empleado.getDocumento(),
        empleado.getEdad()
    });

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void EmpleadoBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpleadoBuscarMouseClicked
      if (EmpleadoBuscar.getText().equals("Ingresa el nombre del empleado a buscar")) {
        EmpleadoBuscar.setText("");
        EmpleadoBuscar.setForeground(Color.BLACK);
      }
       
    }//GEN-LAST:event_EmpleadoBuscarMouseClicked

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
       this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void btnInformacionEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformacionEmpleadoMouseClicked
        int filaSeleccionada = ListaEmpleados.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un empleado en la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombreEmpleado = ListaEmpleados.getValueAt(filaSeleccionada, 0).toString();
        
        Empleado empleado = sistema.buscarEmpleado(nombreEmpleado);

        if (empleado == null) {
            JOptionPane.showMessageDialog(this, "El empleado seleccionado no existe.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        MostrarInformacionEmpleados mostrarInfo = new MostrarInformacionEmpleados (this,true,sistema,empleado);
        mostrarInfo.setVisible(true);
    }//GEN-LAST:event_btnInformacionEmpleadoMouseClicked

    private void btnMostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEmpleadosActionPerformed
      
       DefaultTableModel modelo = (DefaultTableModel) ListaEmpleados.getModel();
       modelo.setRowCount(0);

     
       ArrayList<Empleado> empleados = sistema.obtenerEmpleados();

      
       for (Empleado emp : empleados) {
           Object[] fila = {
               emp.getNombre(),
               emp.getDocumento(),
               emp.getEdad(),
              
           };
           modelo.addRow(fila);
       }
    }//GEN-LAST:event_btnMostrarEmpleadosActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       int filaSeleccionada = ListaEmpleados.getSelectedRow();
    
        if (filaSeleccionada == -1) { 
            JOptionPane.showMessageDialog(this, "Debes seleccionar un empleado de la tabla.", 
                                          "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        String nombreEmpleado = (String) ListaEmpleados.getValueAt(filaSeleccionada, 0); 

    
        String tipoEmpleado = JOptionPane.showInputDialog(this, "Ingrese el tipo de empleado ('operativo' o 'salud'):");

        if (tipoEmpleado == null || tipoEmpleado.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tipo de empleado no válido. Debes ingresar 'operativo' o 'salud'.", 
                                          "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        tipoEmpleado = tipoEmpleado.trim().toLowerCase(); 

       
        Empleado empleado = sistema.buscarEmpleado(nombreEmpleado.trim());

        if (empleado == null) {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

       
        if (tipoEmpleado.equals("operativo")) {
            
            InformacionEmpleadoOperativo ventanaEmpleadoOperativo = 
                new InformacionEmpleadoOperativo(this, true, sistema);
            ventanaEmpleadoOperativo.setEmpleado(empleado);  
            ventanaEmpleadoOperativo.setVisible(true);
            actualizarTablaEmpleados();

        } else if (tipoEmpleado.equals("salud")) {
            
            InformacionEmpleadoSalud ventanaEmpleadoSalud = 
                new InformacionEmpleadoSalud(this, true, sistema);
            ventanaEmpleadoSalud.setEmpleado(empleado); 
            ventanaEmpleadoSalud.setVisible(true);
            actualizarTablaEmpleados();

        } else {
            JOptionPane.showMessageDialog(this, "Tipo de empleado no válido. Usa 'operativo' o 'salud'.", 
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = ListaEmpleados.getSelectedRow();  
    
        
        if (filaSeleccionada != -1) {
        
            String nombreEmpleado = (String) ListaEmpleados.getValueAt(filaSeleccionada, 0);  // Ajusta el índice si el nombre no está en la primera columna

          
            int confirmacion = JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de que desea eliminar al empleado " + nombreEmpleado + "?", 
                "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
               
                if (sistema.eliminarEmpleado(nombreEmpleado)) {
                    JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente.");
                     
                    actualizarTablaEmpleados(); 
                    
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el empleado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un empleado para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
  
   
    private void actualizarTablaEmpleados() {
        DefaultTableModel modelo = (DefaultTableModel) ListaEmpleados.getModel();
        modelo.setRowCount(0);  

        for (Empleado emp : hospital.getEmpleados()) {
            Object[] fila = {
               
                emp.getNombre(),
                emp.getDocumento(),
                emp.getEdad()
            };
            modelo.addRow(fila);  
        }
    }
    
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JTextField EmpleadoBuscar;
    private javax.swing.JScrollPane ListEmpleados;
    private javax.swing.JTable ListaEmpleados;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel btnInformacionEmpleado;
    private javax.swing.JButton btnMostrarEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
