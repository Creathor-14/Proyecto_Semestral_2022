/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author HP Desktop
 */
public class ActualizarVendedor extends javax.swing.JPanel {

    /**
     * Creates new form ActualizarVendedor
     */
    public ActualizarVendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_actvendedor = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_rut = new javax.swing.JLabel();
        jTextField_rut = new javax.swing.JTextField();
        jSeparator_rut = new javax.swing.JSeparator();
        jLabel_correo = new javax.swing.JLabel();
        jTextField_Correo = new javax.swing.JTextField();
        jSeparator_Correo = new javax.swing.JSeparator();
        jLabel_Nombre = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jSeparator_nombre = new javax.swing.JSeparator();
        jLabel_Direccion = new javax.swing.JLabel();
        jTextField_Direccion = new javax.swing.JTextField();
        jSeparator_Direccion = new javax.swing.JSeparator();
        jLabel_Telefono = new javax.swing.JLabel();
        jTextField_Telefono = new javax.swing.JTextField();
        jSeparator_Telefono = new javax.swing.JSeparator();
        jLabel_clave = new javax.swing.JLabel();
        jTextField_clave = new javax.swing.JTextField();
        jSeparator_clave = new javax.swing.JSeparator();
        jPanel_buscar = new javax.swing.JPanel();
        jLabel_buscar = new javax.swing.JLabel();
        jPanel_actualizar = new javax.swing.JPanel();
        jLabel_actualizar = new javax.swing.JLabel();

        jPanel_actvendedor.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_actvendedor.setForeground(new java.awt.Color(51, 51, 51));
        jPanel_actvendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Actualizar vendedor");
        jPanel_actvendedor.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel_rut.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_rut.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_rut.setText("Rut:");
        jPanel_actvendedor.add(jLabel_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));

        jTextField_rut.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_rut.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_rut.setText("00.000.000-K");
        jTextField_rut.setBorder(null);
        jPanel_actvendedor.add(jTextField_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 270, -1));
        jPanel_actvendedor.add(jSeparator_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 270, 10));

        jLabel_correo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_correo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_correo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_correo.setText("Correo:");
        jPanel_actvendedor.add(jLabel_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 130, -1));

        jTextField_Correo.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_Correo.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_Correo.setBorder(null);
        jPanel_actvendedor.add(jTextField_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 270, -1));
        jPanel_actvendedor.add(jSeparator_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 270, 10));

        jLabel_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Nombre.setText("Nombre:");
        jPanel_actvendedor.add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 130, -1));

        jTextField_nombre.setEditable(false);
        jTextField_nombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_nombre.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_nombre.setBorder(null);
        jPanel_actvendedor.add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 270, -1));
        jPanel_actvendedor.add(jSeparator_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 270, 10));

        jLabel_Direccion.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Direccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Direccion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Direccion.setText("Direccion:");
        jPanel_actvendedor.add(jLabel_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 130, -1));

        jTextField_Direccion.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_Direccion.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_Direccion.setBorder(null);
        jPanel_actvendedor.add(jTextField_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 270, -1));
        jPanel_actvendedor.add(jSeparator_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 270, 10));

        jLabel_Telefono.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Telefono.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Telefono.setText("Telefono:");
        jPanel_actvendedor.add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 130, -1));

        jTextField_Telefono.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_Telefono.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_Telefono.setBorder(null);
        jPanel_actvendedor.add(jTextField_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 270, -1));
        jPanel_actvendedor.add(jSeparator_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 270, 10));

        jLabel_clave.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_clave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_clave.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_clave.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_clave.setText("Clave:");
        jPanel_actvendedor.add(jLabel_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 130, -1));

        jTextField_clave.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_clave.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_clave.setBorder(null);
        jTextField_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_claveActionPerformed(evt);
            }
        });
        jPanel_actvendedor.add(jTextField_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 270, -1));
        jPanel_actvendedor.add(jSeparator_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 270, 10));

        jPanel_buscar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_buscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_buscar.setText("Buscar");
        jLabel_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_buscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_buscarLayout = new javax.swing.GroupLayout(jPanel_buscar);
        jPanel_buscar.setLayout(jPanel_buscarLayout);
        jPanel_buscarLayout.setHorizontalGroup(
            jPanel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_buscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_buscarLayout.setVerticalGroup(
            jPanel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_buscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_actvendedor.add(jPanel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jPanel_actualizar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_actualizar.setText("Actualizar");
        jLabel_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_actualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_actualizarLayout = new javax.swing.GroupLayout(jPanel_actualizar);
        jPanel_actualizar.setLayout(jPanel_actualizarLayout);
        jPanel_actualizarLayout.setHorizontalGroup(
            jPanel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_actualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_actualizarLayout.setVerticalGroup(
            jPanel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_actualizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_actvendedor.add(jPanel_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel_actvendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel_actvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_buscarMouseClicked
        //Buscar al usuario segun el rut
        String [] datosVendedor = new String[5];
        String correo = datosVendedor[0];
        String nombre = datosVendedor[1];
        String comuna = datosVendedor[2];
        String direccion = datosVendedor[3];
        String telefono = datosVendedor[4];
        
        jTextField_nombre.setText(correo);
        jTextField_Correo.setText(nombre);
        jTextField_Direccion.setText(comuna);
        jTextField_Telefono.setText(direccion);
        jTextField_clave.setText(telefono);
        
    }//GEN-LAST:event_jLabel_buscarMouseClicked

    private void jLabel_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_actualizarMouseClicked
        // Guardar los datos nuevos
    }//GEN-LAST:event_jLabel_actualizarMouseClicked

    private void jTextField_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_claveActionPerformed
    public void verificarCamposEnBlanco(String campo,String nombre){
        if(campo.equals("")){
            JOptionPane.showMessageDialog(null,"El/La "+nombre+" no puede estar en blanco.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_actualizar;
    private javax.swing.JLabel jLabel_buscar;
    private javax.swing.JLabel jLabel_clave;
    private javax.swing.JLabel jLabel_correo;
    private javax.swing.JLabel jLabel_rut;
    private javax.swing.JPanel jPanel_actualizar;
    private javax.swing.JPanel jPanel_actvendedor;
    private javax.swing.JPanel jPanel_buscar;
    private javax.swing.JSeparator jSeparator_Correo;
    private javax.swing.JSeparator jSeparator_Direccion;
    private javax.swing.JSeparator jSeparator_Telefono;
    private javax.swing.JSeparator jSeparator_clave;
    private javax.swing.JSeparator jSeparator_nombre;
    private javax.swing.JSeparator jSeparator_rut;
    private javax.swing.JTextField jTextField_Correo;
    private javax.swing.JTextField jTextField_Direccion;
    private javax.swing.JTextField jTextField_Telefono;
    private javax.swing.JTextField jTextField_clave;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_rut;
    // End of variables declaration//GEN-END:variables
}
