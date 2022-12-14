/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.BorderLayout;

/**
 *
 * @author thoma
 */
public class Menu_administrador extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu_administrador() {
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

        menu = new javax.swing.JPanel();
        jPanel_usuario = new javax.swing.JPanel();
        jLabel_usuario = new javax.swing.JLabel();
        jPanel_vendedor = new javax.swing.JPanel();
        jLabel_vendedor = new javax.swing.JLabel();
        jPanel_videojuego = new javax.swing.JPanel();
        jLabel_videojuego = new javax.swing.JLabel();
        jPanel_cerrar_sesion = new javax.swing.JPanel();
        jLabel_Acceder3 = new javax.swing.JLabel();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel1_desarrollador = new javax.swing.JPanel();
        jLabel_desarrollador = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(138, 25));
        setMinimumSize(new java.awt.Dimension(138, 25));

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_usuario.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_usuario.setText("USUARIO");
        jLabel_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_usuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_usuarioLayout = new javax.swing.GroupLayout(jPanel_usuario);
        jPanel_usuario.setLayout(jPanel_usuarioLayout);
        jPanel_usuarioLayout.setHorizontalGroup(
            jPanel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_usuarioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_usuarioLayout.setVerticalGroup(
            jPanel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_usuarioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menu.add(jPanel_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 122, -1, -1));

        jPanel_vendedor.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_vendedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_vendedor.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_vendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_vendedor.setText("VENDEDOR");
        jLabel_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_vendedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_vendedorLayout = new javax.swing.GroupLayout(jPanel_vendedor);
        jPanel_vendedor.setLayout(jPanel_vendedorLayout);
        jPanel_vendedorLayout.setHorizontalGroup(
            jPanel_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_vendedorLayout.createSequentialGroup()
                .addComponent(jLabel_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel_vendedorLayout.setVerticalGroup(
            jPanel_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_vendedorLayout.createSequentialGroup()
                .addComponent(jLabel_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(jPanel_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jPanel_videojuego.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_videojuego.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_videojuego.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_videojuego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_videojuego.setText("VIDEOJUEGO");
        jLabel_videojuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_videojuegoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_videojuegoLayout = new javax.swing.GroupLayout(jPanel_videojuego);
        jPanel_videojuego.setLayout(jPanel_videojuegoLayout);
        jPanel_videojuegoLayout.setHorizontalGroup(
            jPanel_videojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_videojuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_videojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_videojuegoLayout.setVerticalGroup(
            jPanel_videojuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_videojuegoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_videojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(jPanel_videojuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, -1));

        jPanel_cerrar_sesion.setBackground(new java.awt.Color(204, 0, 0));

        jLabel_Acceder3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Acceder3.setText("Cerrar Sesi??n");
        jLabel_Acceder3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Acceder3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_cerrar_sesionLayout = new javax.swing.GroupLayout(jPanel_cerrar_sesion);
        jPanel_cerrar_sesion.setLayout(jPanel_cerrar_sesionLayout);
        jPanel_cerrar_sesionLayout.setHorizontalGroup(
            jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cerrar_sesionLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel_cerrar_sesionLayout.setVerticalGroup(
            jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Acceder3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menu.add(jPanel_cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 392, 200, -1));

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Menu Administrador");
        menu.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 200, -1));

        jLabel_desarrollador.setText("DESARROLLADOR");

        javax.swing.GroupLayout jPanel1_desarrolladorLayout = new javax.swing.GroupLayout(jPanel1_desarrollador);
        jPanel1_desarrollador.setLayout(jPanel1_desarrolladorLayout);
        jPanel1_desarrolladorLayout.setHorizontalGroup(
            jPanel1_desarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1_desarrolladorLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel_desarrollador)
                .addGap(40, 40, 40))
        );
        jPanel1_desarrolladorLayout.setVerticalGroup(
            jPanel1_desarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_desarrolladorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_desarrollador)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        menu.add(jPanel1_desarrollador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_Acceder3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Acceder3MouseClicked
        Login login = new Login();
        login.setSize(660, 460);
        login.setLocation(0,0);

        menu.removeAll();
        menu.add(login,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
    }//GEN-LAST:event_jLabel_Acceder3MouseClicked

    private void jLabel_videojuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_videojuegoMouseClicked
        EliminarUsuario eliminarUsuario = new EliminarUsuario();
        eliminarUsuario.setSize(660, 460);
        eliminarUsuario.setLocation(0,0);

        menu.removeAll();
        menu.add(eliminarUsuario,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
    }//GEN-LAST:event_jLabel_videojuegoMouseClicked

    private void jLabel_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_vendedorMouseClicked
        ActualizarUsuario actualizarUsuario = new ActualizarUsuario();
        actualizarUsuario.setSize(660, 460);
        actualizarUsuario.setLocation(0,0);

        menu.removeAll();
        menu.add(actualizarUsuario,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
    }//GEN-LAST:event_jLabel_vendedorMouseClicked

    private void jLabel_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_usuarioMouseClicked
        IngresarUsuario ingresarUsuario = new IngresarUsuario();
        ingresarUsuario.setSize(660, 460);
        ingresarUsuario.setLocation(0,0);

        menu.removeAll();
        menu.add(ingresarUsuario,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
    }//GEN-LAST:event_jLabel_usuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Acceder3;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_desarrollador;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JLabel jLabel_vendedor;
    private javax.swing.JLabel jLabel_videojuego;
    private javax.swing.JPanel jPanel1_desarrollador;
    private javax.swing.JPanel jPanel_cerrar_sesion;
    private javax.swing.JPanel jPanel_usuario;
    private javax.swing.JPanel jPanel_vendedor;
    private javax.swing.JPanel jPanel_videojuego;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
