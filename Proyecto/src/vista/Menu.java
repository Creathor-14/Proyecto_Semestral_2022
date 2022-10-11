/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;

public class Menu extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel_interaccion = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel_header = new javax.swing.JPanel();
        jPanel_salir = new javax.swing.JPanel();
        jLabel_salir = new javax.swing.JLabel();
        jPanel_ingresar = new javax.swing.JPanel();
        jLabel_Acceder = new javax.swing.JLabel();
        jPanel_actualizar = new javax.swing.JPanel();
        jLabel_Acceder1 = new javax.swing.JLabel();
        jPanel_eliminar = new javax.swing.JPanel();
        jLabel_Acceder2 = new javax.swing.JLabel();
        jPanel_cerrar_sesion = new javax.swing.JPanel();
        jLabel_Acceder3 = new javax.swing.JLabel();
        jPanel_diseño = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        nombre_empresa = new javax.swing.JLabel();
        wallpaper1 = new javax.swing.JLabel();
        wallpaper2 = new javax.swing.JLabel();
        wallpaper3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel_interaccion.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_interaccion.setForeground(new java.awt.Color(51, 51, 51));
        jPanel_interaccion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_interaccionMouseDragged(evt);
            }
        });
        jPanel_interaccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Menu");
        jPanel_interaccion.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 200, -1));

        jPanel_header.setBackground(new java.awt.Color(0, 0, 0));
        jPanel_header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel_header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_headerMouseDragged(evt);
            }
        });
        jPanel_header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_headerMouseEntered(evt);
            }
        });

        jPanel_salir.setBackground(new java.awt.Color(0, 0, 0));

        jLabel_salir.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_salir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_salir.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_salir.setText("X");
        jLabel_salir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jLabel_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_salirLayout = new javax.swing.GroupLayout(jPanel_salir);
        jPanel_salir.setLayout(jPanel_salirLayout);
        jPanel_salirLayout.setHorizontalGroup(
            jPanel_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );
        jPanel_salirLayout.setVerticalGroup(
            jPanel_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_salirLayout.createSequentialGroup()
                .addComponent(jLabel_salir)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_headerLayout = new javax.swing.GroupLayout(jPanel_header);
        jPanel_header.setLayout(jPanel_headerLayout);
        jPanel_headerLayout.setHorizontalGroup(
            jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_headerLayout.setVerticalGroup(
            jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_headerLayout.createSequentialGroup()
                .addComponent(jPanel_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel_interaccion.add(jPanel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 510));

        jPanel_ingresar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_Acceder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Acceder.setText("Ingresar usuario");
        jLabel_Acceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AccederMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ingresarLayout = new javax.swing.GroupLayout(jPanel_ingresar);
        jPanel_ingresar.setLayout(jPanel_ingresarLayout);
        jPanel_ingresarLayout.setHorizontalGroup(
            jPanel_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_ingresarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_ingresarLayout.setVerticalGroup(
            jPanel_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_ingresarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel_interaccion.add(jPanel_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jPanel_actualizar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_Acceder1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Acceder1.setText("Actualizar datos");
        jLabel_Acceder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Acceder1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_actualizarLayout = new javax.swing.GroupLayout(jPanel_actualizar);
        jPanel_actualizar.setLayout(jPanel_actualizarLayout);
        jPanel_actualizarLayout.setHorizontalGroup(
            jPanel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_actualizarLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_actualizarLayout.setVerticalGroup(
            jPanel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_actualizarLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel_interaccion.add(jPanel_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jPanel_eliminar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_Acceder2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Acceder2.setText("Eliminar usuario");
        jLabel_Acceder2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Acceder2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_eliminarLayout = new javax.swing.GroupLayout(jPanel_eliminar);
        jPanel_eliminar.setLayout(jPanel_eliminarLayout);
        jPanel_eliminarLayout.setHorizontalGroup(
            jPanel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_eliminarLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_eliminarLayout.setVerticalGroup(
            jPanel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_eliminarLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel_interaccion.add(jPanel_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jPanel_cerrar_sesion.setBackground(new java.awt.Color(204, 0, 0));

        jLabel_Acceder3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder3.setText("Cerrar Sesión");
        jLabel_Acceder3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Acceder3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_cerrar_sesionLayout = new javax.swing.GroupLayout(jPanel_cerrar_sesion);
        jPanel_cerrar_sesion.setLayout(jPanel_cerrar_sesionLayout);
        jPanel_cerrar_sesionLayout.setHorizontalGroup(
            jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_cerrar_sesionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Acceder3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_cerrar_sesionLayout.setVerticalGroup(
            jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_cerrar_sesionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Acceder3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel_interaccion.add(jPanel_cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jPanel_diseño.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel_diseño.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        nombre_empresa.setFont(new java.awt.Font("Algerian", 0, 30)); // NOI18N
        nombre_empresa.setForeground(new java.awt.Color(51, 239, 248));
        nombre_empresa.setText("NEXTWIIUBOX");
        jPanel_diseño.add(nombre_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        wallpaper1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper.png"))); // NOI18N
        jPanel_diseño.add(wallpaper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        wallpaper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper.png"))); // NOI18N
        jPanel_diseño.add(wallpaper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        wallpaper3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper.png"))); // NOI18N
        jPanel_diseño.add(wallpaper3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_interaccion, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_diseño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_diseño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_interaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_interaccionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_interaccionMouseDragged
        //BORRAR
    }//GEN-LAST:event_jPanel_interaccionMouseDragged

    private void jPanel_headerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_headerMouseEntered
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel_headerMouseEntered

    private void jPanel_headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel_headerMouseDragged

    private void jLabel_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_salirMouseExited
        jPanel_salir.setBackground(Color.black);
    }//GEN-LAST:event_jLabel_salirMouseExited

    private void jLabel_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_salirMouseEntered
        jPanel_salir.setBackground(Color.red);
    }//GEN-LAST:event_jLabel_salirMouseEntered

    private void jLabel_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_salirMouseClicked

    private void jLabel_AccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AccederMouseClicked
        new Ingresar().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel_AccederMouseClicked

    private void jLabel_Acceder1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Acceder1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Acceder1MouseClicked

    private void jLabel_Acceder2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Acceder2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Acceder2MouseClicked

    private void jLabel_Acceder3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Acceder3MouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel_Acceder3MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Acceder;
    private javax.swing.JLabel jLabel_Acceder1;
    private javax.swing.JLabel jLabel_Acceder2;
    private javax.swing.JLabel jLabel_Acceder3;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_salir;
    private javax.swing.JPanel jPanel_actualizar;
    private javax.swing.JPanel jPanel_cerrar_sesion;
    private javax.swing.JPanel jPanel_diseño;
    private javax.swing.JPanel jPanel_eliminar;
    private javax.swing.JPanel jPanel_header;
    private javax.swing.JPanel jPanel_ingresar;
    private javax.swing.JPanel jPanel_interaccion;
    private javax.swing.JPanel jPanel_salir;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombre_empresa;
    private javax.swing.JLabel wallpaper1;
    private javax.swing.JLabel wallpaper2;
    private javax.swing.JLabel wallpaper3;
    // End of variables declaration//GEN-END:variables
}