/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author thoma
 */
public class IngresarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form IngresarUsuario
     */
    public IngresarUsuario() {
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

        ingresarUsuario = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_rut = new javax.swing.JLabel();
        jTextField_rut = new javax.swing.JTextField();
        jSeparator_rut = new javax.swing.JSeparator();
        jLabel_nombre = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jSeparator_nombre = new javax.swing.JSeparator();
        jLabel_correo = new javax.swing.JLabel();
        jTextField_correo = new javax.swing.JTextField();
        jSeparator_correo = new javax.swing.JSeparator();
        jLabel_comuna = new javax.swing.JLabel();
        jTextField_comuna = new javax.swing.JTextField();
        jSeparator_comuna = new javax.swing.JSeparator();
        jLabel_direccion = new javax.swing.JLabel();
        jTextField_direccion = new javax.swing.JTextField();
        jSeparator_direccion = new javax.swing.JSeparator();
        jLabel_telefono = new javax.swing.JLabel();
        jTextField_telefono = new javax.swing.JTextField();
        jSeparator_telefono = new javax.swing.JSeparator();
        jLabel_fNac = new javax.swing.JLabel();
        jTextField_fNac = new javax.swing.JTextField();
        jSeparator_fNac = new javax.swing.JSeparator();
        jPanel_menu = new javax.swing.JPanel();
        jLabel_menu = new javax.swing.JLabel();
        jPanel_registrar = new javax.swing.JPanel();
        jLabel_registrar = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(138, 25));
        setMinimumSize(new java.awt.Dimension(138, 25));
        setPreferredSize(new java.awt.Dimension(610, 460));

        ingresarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        ingresarUsuario.setMinimumSize(new java.awt.Dimension(0, 0));
        ingresarUsuario.setPreferredSize(new java.awt.Dimension(610, 460));
        ingresarUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ingresarUsuarioMouseDragged(evt);
            }
        });

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Ingresar Usuario");

        jLabel_rut.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_rut.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_rut.setText("Rut:");

        jTextField_rut.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_rut.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_rut.setText("00.000.000-K");
        jTextField_rut.setBorder(null);
        jTextField_rut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_rutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_rutMouseEntered(evt);
            }
        });
        jTextField_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_rutActionPerformed(evt);
            }
        });
        jTextField_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_rutKeyPressed(evt);
            }
        });

        jLabel_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_nombre.setText("Nombre:");

        jTextField_nombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_nombre.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_nombre.setText("Juan Navarro");
        jTextField_nombre.setBorder(null);
        jTextField_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_nombreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_nombreMouseEntered(evt);
            }
        });
        jTextField_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nombreKeyPressed(evt);
            }
        });

        jLabel_correo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_correo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_correo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_correo.setText("Correo:");

        jTextField_correo.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_correo.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_correo.setText("correoFalso@dominioFalso.cl");
        jTextField_correo.setBorder(null);
        jTextField_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_correoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_correoMouseEntered(evt);
            }
        });
        jTextField_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_correoKeyPressed(evt);
            }
        });

        jLabel_comuna.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_comuna.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_comuna.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_comuna.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_comuna.setText("Comuna:");

        jTextField_comuna.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_comuna.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_comuna.setText("San Joaquin");
        jTextField_comuna.setBorder(null);
        jTextField_comuna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_comunaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_comunaMouseEntered(evt);
            }
        });
        jTextField_comuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_comunaKeyPressed(evt);
            }
        });

        jLabel_direccion.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_direccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_direccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_direccion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_direccion.setText("Direccion:");

        jTextField_direccion.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_direccion.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_direccion.setText("Industrias 111");
        jTextField_direccion.setBorder(null);
        jTextField_direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_direccionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_direccionMouseEntered(evt);
            }
        });
        jTextField_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_direccionKeyPressed(evt);
            }
        });

        jLabel_telefono.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_telefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_telefono.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_telefono.setText("Telefono:");

        jTextField_telefono.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_telefono.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_telefono.setText("+56 9 0000 0000");
        jTextField_telefono.setBorder(null);
        jTextField_telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_telefonoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_telefonoMouseEntered(evt);
            }
        });
        jTextField_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_telefonoKeyPressed(evt);
            }
        });

        jLabel_fNac.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_fNac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_fNac.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fNac.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_fNac.setText("Fecha nacimiento:");

        jTextField_fNac.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_fNac.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_fNac.setText("DD/MM/YYYY");
        jTextField_fNac.setBorder(null);
        jTextField_fNac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_fNacMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_fNacMouseEntered(evt);
            }
        });
        jTextField_fNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_fNacKeyPressed(evt);
            }
        });

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

        javax.swing.GroupLayout ingresarUsuarioLayout = new javax.swing.GroupLayout(ingresarUsuario);
        ingresarUsuario.setLayout(ingresarUsuarioLayout);
        ingresarUsuarioLayout.setHorizontalGroup(
            ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel_Titulo))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jSeparator_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jSeparator_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jSeparator_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jSeparator_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jSeparator_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jSeparator_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel_fNac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextField_fNac, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jSeparator_fNac, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jPanel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ingresarUsuarioLayout.setVerticalGroup(
            ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarUsuarioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel_Titulo)
                .addGap(25, 25, 25)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_rut)
                    .addComponent(jTextField_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_correo)
                    .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_comuna)
                    .addComponent(jTextField_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_direccion)
                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_telefono)
                    .addComponent(jTextField_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_fNac)
                    .addComponent(jTextField_fNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator_fNac, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(ingresarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_rutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_rutMouseClicked

    }//GEN-LAST:event_jTextField_rutMouseClicked

    private void jTextField_rutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_rutMouseEntered
        //BORRAR
    }//GEN-LAST:event_jTextField_rutMouseEntered

    private void jTextField_rutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_rutKeyPressed
        //hacer que con el tab desaparesca ************
        //sino borrar
    }//GEN-LAST:event_jTextField_rutKeyPressed

    private void jTextField_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_nombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreMouseClicked

    private void jTextField_nombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_nombreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreMouseEntered

    private void jTextField_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreKeyPressed

    private void jTextField_correoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_correoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_correoMouseClicked

    private void jTextField_correoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_correoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_correoMouseEntered

    private void jTextField_correoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_correoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_correoKeyPressed

    private void jTextField_comunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_comunaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_comunaMouseClicked

    private void jTextField_comunaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_comunaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_comunaMouseEntered

    private void jTextField_comunaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_comunaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_comunaKeyPressed

    private void jTextField_direccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_direccionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_direccionMouseClicked

    private void jTextField_direccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_direccionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_direccionMouseEntered

    private void jTextField_direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_direccionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_direccionKeyPressed

    private void jTextField_telefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_telefonoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telefonoMouseClicked

    private void jTextField_telefonoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_telefonoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telefonoMouseEntered

    private void jTextField_telefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_telefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telefonoKeyPressed

    private void jTextField_fNacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_fNacMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fNacMouseClicked

    private void jTextField_fNacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_fNacMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fNacMouseEntered

    private void jTextField_fNacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_fNacKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fNacKeyPressed

    private void jLabel_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuMouseClicked
        Menu menu = new Menu();
        menu.setSize(660, 460);
        menu.setLocation(0,0);

        ingresarUsuario.removeAll();
        ingresarUsuario.add(menu,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        ingresarUsuario.revalidate();
        ingresarUsuario.repaint();
    }//GEN-LAST:event_jLabel_menuMouseClicked

    private void jLabel_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_registrarMouseClicked

    }//GEN-LAST:event_jLabel_registrarMouseClicked

    private void ingresarUsuarioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarUsuarioMouseDragged
        //BORRAR
    }//GEN-LAST:event_ingresarUsuarioMouseDragged

    private void jTextField_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_rutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ingresarUsuario;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_comuna;
    private javax.swing.JLabel jLabel_correo;
    private javax.swing.JLabel jLabel_direccion;
    private javax.swing.JLabel jLabel_fNac;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_registrar;
    private javax.swing.JLabel jLabel_rut;
    private javax.swing.JLabel jLabel_telefono;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JPanel jPanel_registrar;
    private javax.swing.JSeparator jSeparator_comuna;
    private javax.swing.JSeparator jSeparator_correo;
    private javax.swing.JSeparator jSeparator_direccion;
    private javax.swing.JSeparator jSeparator_fNac;
    private javax.swing.JSeparator jSeparator_nombre;
    private javax.swing.JSeparator jSeparator_rut;
    private javax.swing.JSeparator jSeparator_telefono;
    private javax.swing.JTextField jTextField_comuna;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_fNac;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_rut;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
