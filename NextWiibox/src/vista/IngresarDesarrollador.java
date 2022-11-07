/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author reeso
 */
public class IngresarDesarrollador extends javax.swing.JPanel {

    /**
     * Creates new form IngresarDesarrollador
     */
    public IngresarDesarrollador() {
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

        ingresarDesarrollador = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_rut = new javax.swing.JLabel();
        jTextField_rut = new javax.swing.JTextField();
        jSeparator_rut = new javax.swing.JSeparator();
        jLabel_nombre = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jSeparator_nombre = new javax.swing.JSeparator();
        jLabel_direccion = new javax.swing.JLabel();
        jTextField_direccion = new javax.swing.JTextField();
        jSeparator_direccion = new javax.swing.JSeparator();
        jLabel_comuna = new javax.swing.JLabel();
        jTextField_comuna = new javax.swing.JTextField();
        jSeparator_comuna = new javax.swing.JSeparator();
        jLabel_fono = new javax.swing.JLabel();
        jTextField_fono = new javax.swing.JTextField();
        jSeparator_fono = new javax.swing.JSeparator();
        jPanel_menu = new javax.swing.JPanel();
        jLabel_menu = new javax.swing.JLabel();
        jPanel_registrar = new javax.swing.JPanel();
        jLabel_registrar = new javax.swing.JLabel();

        ingresarDesarrollador.setBackground(new java.awt.Color(51, 51, 51));
        ingresarDesarrollador.setPreferredSize(new java.awt.Dimension(610, 460));
        ingresarDesarrollador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ingresarDesarrolladorMouseDragged(evt);
            }
        });

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Ingresar Desarrollador");

        jLabel_rut.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_rut.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_rut.setText("Rut:");

        jTextField_rut.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_rut.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_rut.setText("11.111.111-1");
        jTextField_rut.setBorder(null);

        jLabel_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_nombre.setText("Nombre:");

        jTextField_nombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_nombre.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_nombre.setText("Juan Navarro");
        jTextField_nombre.setBorder(null);

        jLabel_direccion.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_direccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_direccion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_direccion.setText("Direccion:");

        jTextField_direccion.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_direccion.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_direccion.setText("correoFalso1@dominioFalso.cl");
        jTextField_direccion.setBorder(null);

        jLabel_comuna.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_comuna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_comuna.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_comuna.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_comuna.setText("Comuna:");

        jTextField_comuna.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_comuna.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_comuna.setText("San Joaquin");
        jTextField_comuna.setBorder(null);

        jLabel_fono.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_fono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_fono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fono.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_fono.setText("Fono:");

        jTextField_fono.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_fono.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_fono.setText("Industrias 111");
        jTextField_fono.setBorder(null);

        jPanel_menu.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_menu.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_menu.setText("Menu");
        jLabel_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_menuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_menuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel_registrar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_registrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_registrar.setText("Registrar");
        jLabel_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_registrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_registrarLayout = new javax.swing.GroupLayout(jPanel_registrar);
        jPanel_registrar.setLayout(jPanel_registrarLayout);
        jPanel_registrarLayout.setHorizontalGroup(
            jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_registrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_registrarLayout.setVerticalGroup(
            jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_registrarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ingresarDesarrolladorLayout = new javax.swing.GroupLayout(ingresarDesarrollador);
        ingresarDesarrollador.setLayout(ingresarDesarrolladorLayout);
        ingresarDesarrolladorLayout.setHorizontalGroup(
            ingresarDesarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                .addGroup(ingresarDesarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel_Titulo))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel_fono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_fono, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jSeparator_fono, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jPanel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        ingresarDesarrolladorLayout.setVerticalGroup(
            ingresarDesarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarDesarrolladorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel_Titulo)
                .addGap(25, 25, 25)
                .addGroup(ingresarDesarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_rut)
                    .addComponent(jTextField_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarDesarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarDesarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_direccion)
                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarDesarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_comuna)
                    .addComponent(jTextField_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarDesarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_fono)
                    .addComponent(jTextField_fono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_fono, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(ingresarDesarrolladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresarDesarrollador, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ingresarDesarrollador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuMouseClicked
        Menu_administrador menu = new Menu_administrador();
        menu.setSize(660, 460);
        menu.setLocation(0,0);

        ingresarDesarrollador.removeAll();
        ingresarDesarrollador.add(menu,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        ingresarDesarrollador.revalidate();
        ingresarDesarrollador.repaint();
    }//GEN-LAST:event_jLabel_menuMouseClicked

    private void jLabel_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_registrarMouseClicked
        
        String rut = jTextField_rut.getText();
        verificarCamposEnBlanco(rut, "rut");
        
        String nombre = jTextField_nombre.getText();
        verificarCamposEnBlanco(nombre, "nombre");
        
        String direccion = jTextField_direccion.getText();
        verificarCamposEnBlanco(direccion, "direccion");
 
        String comuna = jTextField_comuna.getText();
        verificarCamposEnBlanco(comuna, "comuna");

        String fono = jTextField_fono.getText();
        verificarCamposEnBlanco(fono, "fono");
        
        
        
        try{
            Visualizador.sistema.ingresarDesarrollador(rut, nombre, direccion, comuna, fono);
            JOptionPane.showMessageDialog(null,"Desarrollador ingresado.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
    }//GEN-LAST:event_jLabel_registrarMouseClicked
    
    public void verificarCamposEnBlanco(String campo,String nombre){
        if(campo.equals("")){
            JOptionPane.showMessageDialog(null,"El/La "+nombre+" no puede estar en blanco.");
        }
    }
    
    private void ingresarDesarrolladorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarDesarrolladorMouseDragged
        //BORRAR
    }//GEN-LAST:event_ingresarDesarrolladorMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ingresarDesarrollador;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_comuna;
    private javax.swing.JLabel jLabel_direccion;
    private javax.swing.JLabel jLabel_fono;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_registrar;
    private javax.swing.JLabel jLabel_rut;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JPanel jPanel_registrar;
    private javax.swing.JSeparator jSeparator_comuna;
    private javax.swing.JSeparator jSeparator_direccion;
    private javax.swing.JSeparator jSeparator_fono;
    private javax.swing.JSeparator jSeparator_nombre;
    private javax.swing.JSeparator jSeparator_rut;
    private javax.swing.JTextField jTextField_comuna;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_fono;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_rut;
    // End of variables declaration//GEN-END:variables
}
