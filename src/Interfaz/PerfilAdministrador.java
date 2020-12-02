package Interfaz;

import Mundo.Administrador;
import Mundo.Empresa;
import javax.swing.JOptionPane;

/**
 *
 * @author John Silva
 */
public class PerfilAdministrador extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
    private Empresa empresa;
    private Administrador admin;
    private int counter = 0;
    private boolean modificable = false;
    
    /**
     * Creates new form PerfilAdministrador
     */
    public PerfilAdministrador(Empresa var) {
        empresa = var;
        admin = empresa.darAdmin();
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

        jPanelPrincipalPerfil = new javax.swing.JPanel();
        jPanelContenerdorNombres = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelAbreviacionUsuario = new javax.swing.JLabel();
        jLabelCirculoPerfil = new javax.swing.JLabel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jLabelCorreoOpcional = new javax.swing.JLabel();
        jLabelFondoSup = new javax.swing.JLabel();
        jButtonVerContraseña = new javax.swing.JButton();
        jLabelNombreDeUsuario = new javax.swing.JLabel();
        jTextFieldNombreDeUsuario = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelCodigoEmpresa2 = new javax.swing.JLabel();
        jLabelCodigoEmpresa = new javax.swing.JLabel();
        jLabelTipoEmpresa = new javax.swing.JLabel();
        jLabelMisDatos = new javax.swing.JLabel();
        jTextFieldCodigoEmpresa = new javax.swing.JTextField();
        jLabelLinea = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jTextFieldAuxiliar = new javax.swing.JTextField();
        jToggleButtonModificar = new javax.swing.JToggleButton();
        jComboBoxTipoEmpresa = new javax.swing.JComboBox<>();
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Muu Seguro");
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipalPerfil.setBackground(new java.awt.Color(51, 51, 51));
        jPanelPrincipalPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jPanelPrincipalPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelContenerdorNombres.setBackground(new java.awt.Color(102, 102, 102));
        jPanelContenerdorNombres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAbreviacionUsuario.setBackground(new java.awt.Color(239, 69, 200));
        jLabelAbreviacionUsuario.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabelAbreviacionUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAbreviacionUsuario.setText(admin.darNombreUsuario().charAt(0)+"");
        jLabelAbreviacionUsuario.setToolTipText("");
        jPanel1.add(jLabelAbreviacionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 12, 35, 65));

        jLabelCirculoPerfil.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCirculoPerfil.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelCirculoPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCirculoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirculoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/DataImage/circuloPerfil.png"))); // NOI18N
        jPanel1.add(jLabelCirculoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 65, 65));

        jLabelNombreUsuario.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreUsuario.setText(admin.darNombreUsuario());
        jPanel1.add(jLabelNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 25, 140, -1));

        jLabelCorreoOpcional.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelCorreoOpcional.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorreoOpcional.setText(admin.darCorreo());
        jPanel1.add(jLabelCorreoOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 45, 200, -1));

        jPanelContenerdorNombres.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 30, 250, 90));

        jLabelFondoSup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/DataImage/fondoMuu.png"))); // NOI18N
        jLabelFondoSup.setText("jLabel1");
        jPanelContenerdorNombres.add(jLabelFondoSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 150));

        jPanelPrincipalPerfil.add(jPanelContenerdorNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 150));

        jButtonVerContraseña.setForeground(new java.awt.Color(51, 51, 51));
        jButtonVerContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/DataImage/verContraseñaUsuario.png"))); // NOI18N
        jButtonVerContraseña.setContentAreaFilled(false);
        jButtonVerContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerContraseñaActionPerformed(evt);
            }
        });
        jPanelPrincipalPerfil.add(jButtonVerContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 330, 35, 30));

        jLabelNombreDeUsuario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelNombreDeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreDeUsuario.setText("Nombre de usuario");
        jLabelNombreDeUsuario.setToolTipText("");
        jPanelPrincipalPerfil.add(jLabelNombreDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 235, 200, -1));
        jLabelNombreDeUsuario.getAccessibleContext().setAccessibleName("");

        jTextFieldNombreDeUsuario.setEditable(false);
        jTextFieldNombreDeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombreDeUsuario.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldNombreDeUsuario.setForeground(new java.awt.Color(97, 97, 97));
        jTextFieldNombreDeUsuario.setText(admin.darNombreUsuario());
        jTextFieldNombreDeUsuario.setAutoscrolls(false);
        jTextFieldNombreDeUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPrincipalPerfil.add(jTextFieldNombreDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 255, 200, 30));

        jLabelContraseña.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraseña.setText("Contraseña");
        jLabelContraseña.setToolTipText("");
        jPanelPrincipalPerfil.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 200, -1));

        jLabelCodigoEmpresa2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelCodigoEmpresa2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigoEmpresa2.setText("¿Deseas modificar tus datos?");
        jLabelCodigoEmpresa2.setToolTipText("");
        jPanelPrincipalPerfil.add(jLabelCodigoEmpresa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 400, 170, -1));

        jLabelCodigoEmpresa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelCodigoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigoEmpresa.setText("Código de la empresa");
        jLabelCodigoEmpresa.setToolTipText("");
        jPanelPrincipalPerfil.add(jLabelCodigoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, 200, -1));

        jLabelTipoEmpresa.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTipoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoEmpresa.setText("Tipo de empresa");
        jLabelTipoEmpresa.setToolTipText("");
        jPanelPrincipalPerfil.add(jLabelTipoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 235, 200, -1));

        jLabelMisDatos.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelMisDatos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMisDatos.setText("Mis Datos");
        jLabelMisDatos.setToolTipText("");
        jPanelPrincipalPerfil.add(jLabelMisDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, -1));

        jTextFieldCodigoEmpresa.setEditable(false);
        jTextFieldCodigoEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigoEmpresa.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldCodigoEmpresa.setForeground(new java.awt.Color(97, 97, 97));
        jTextFieldCodigoEmpresa.setText(empresa.darCodigo());
        jTextFieldCodigoEmpresa.setAutoscrolls(false);
        jTextFieldCodigoEmpresa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldCodigoEmpresa.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jPanelPrincipalPerfil.add(jTextFieldCodigoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 200, 30));

        jLabelLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/DataImage/lineaLarga.png"))); // NOI18N
        jPanelPrincipalPerfil.add(jLabelLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 740, 20));

        jPasswordFieldContraseña.setEditable(false);
        jPasswordFieldContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldContraseña.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jPasswordFieldContraseña.setText(admin.darContraseña());
        jPanelPrincipalPerfil.add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 30));

        jTextFieldAuxiliar.setEditable(false);
        jTextFieldAuxiliar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldAuxiliar.setForeground(new java.awt.Color(97, 97, 97));
        jTextFieldAuxiliar.setAutoscrolls(false);
        jTextFieldAuxiliar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPrincipalPerfil.add(jTextFieldAuxiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 30));

        jToggleButtonModificar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jToggleButtonModificar.setForeground(new java.awt.Color(104, 191, 52));
        jToggleButtonModificar.setText("MODIFICAR DATOS");
        jToggleButtonModificar.setBorder(null);
        jToggleButtonModificar.setBorderPainted(false);
        jToggleButtonModificar.setContentAreaFilled(false);
        jToggleButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonModificar.setFocusPainted(false);
        jToggleButtonModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButtonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonModificarActionPerformed(evt);
            }
        });
        jPanelPrincipalPerfil.add(jToggleButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 400, -1, -1));

        jComboBoxTipoEmpresa.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBoxTipoEmpresa.setForeground(new java.awt.Color(97, 97, 97));
        String [] tiposEmpresa=new String[3];
        if(empresa.mdarTipoEmp().equals("Carne")){
            tiposEmpresa[0]="Carne";
            tiposEmpresa[1]="Leche";
            tiposEmpresa[2]="Doble";
        }else if(empresa.mdarTipoEmp().equals("Leche")){
            tiposEmpresa[0]="Leche";
            tiposEmpresa[1]="Carne";
            tiposEmpresa[2]="Doble";
        }else{
            tiposEmpresa[0]="Doble";
            tiposEmpresa[1]="Carne";
            tiposEmpresa[2]="Leche";
        }
        jComboBoxTipoEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(tiposEmpresa));
        jComboBoxTipoEmpresa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBoxTipoEmpresa.setEnabled(false);
        jComboBoxTipoEmpresa.setFocusable(false);
        jPanelPrincipalPerfil.add(jComboBoxTipoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 255, 200, 30));

        jButtonRegresar.setBackground(new java.awt.Color(104, 191, 52));
        jButtonRegresar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.setBorder(null);
        jButtonRegresar.setBorderPainted(false);
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.setOpaque(true);
        jButtonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseExited(evt);
            }
        });
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanelPrincipalPerfil.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 140, 30));

        getContentPane().add(jPanelPrincipalPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    *Ver contraseñas evento
     */
    private void jButtonVerContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerContraseñaActionPerformed
        // TODO add your handling code here:
        counter += 1;
        verContraseña();
    }//GEN-LAST:event_jButtonVerContraseñaActionPerformed
    /*
    *Habilitar edicion de datos
     */
    private void jToggleButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonModificarActionPerformed
        // TODO add your handling code here:
        modificable = true;
        if (jToggleButtonModificar.isSelected()) {
            jTextFieldCodigoEmpresa.setEditable(true);
            jTextFieldCodigoEmpresa.setBackground(new java.awt.Color(210, 245, 189));
            jTextFieldNombreDeUsuario.setEditable(true);
            jTextFieldNombreDeUsuario.setBackground(new java.awt.Color(210, 245, 189));
            jPasswordFieldContraseña.setEditable(true);
            jPasswordFieldContraseña.setBackground(new java.awt.Color(210, 245, 189));
            jComboBoxTipoEmpresa.setEnabled(true);
        } else {
            jTextFieldCodigoEmpresa.setEditable(false);
            jTextFieldCodigoEmpresa.setBackground(new java.awt.Color(255, 255, 255));
            jTextFieldNombreDeUsuario.setEditable(false);
            jTextFieldNombreDeUsuario.setBackground(new java.awt.Color(255, 255, 255));
            jPasswordFieldContraseña.setEditable(false);
            jPasswordFieldContraseña.setBackground(new java.awt.Color(255, 255, 255));
            jComboBoxTipoEmpresa.setEnabled(false);
        }
    }//GEN-LAST:event_jToggleButtonModificarActionPerformed
    /*
    *Regresar y guardar cambios
     */
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        if (modificable) {
            int respuesta = JOptionPane.showOptionDialog(this, "Desea guardar los cambios realizados", "Atención", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No", "Cancelar"}, "Si");
            if (respuesta != -1 && respuesta != 2) {
                if (respuesta == 0) {
                    empresa.modificarEmpresaAdmin(admin.darCorreo(), jTextFieldCodigoEmpresa.getText(), (String) jComboBoxTipoEmpresa.getSelectedItem(), jTextFieldNombreDeUsuario.getText(), jPasswordFieldContraseña.getText());
                    this.setVisible(false);
                    empresa = new Empresa(jTextFieldCodigoEmpresa.getText());
                    Ventana ventana = new Ventana(empresa);
                    ventana.setVisible(true);
                } else if (respuesta == 1) {
                    this.setVisible(false);
                    Ventana ventana = new Ventana(empresa);
                    ventana.setVisible(true);
                }
            }
        } else {
            this.setVisible(false);
            Ventana ventana = new Ventana(empresa);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_jButtonRegresarActionPerformed
    /*
    *Cambiar colores botones
    */
    private void jButtonRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseEntered
        // TODO add your handling code here:
        jButtonRegresar.setBackground(new java.awt.Color(177, 244, 137));
    }//GEN-LAST:event_jButtonRegresarMouseEntered

    private void jButtonRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseExited
        // TODO add your handling code here:
        jButtonRegresar.setBackground(new java.awt.Color(104, 191, 52));
    }//GEN-LAST:event_jButtonRegresarMouseExited
    
    

    private void verContraseña() {
        if (counter % 2 != 0) {
            jPasswordFieldContraseña.setVisible(false);
            jTextFieldAuxiliar.setVisible(true);
            jTextFieldAuxiliar.setText(jPasswordFieldContraseña.getText());
        } else {
            jPasswordFieldContraseña.setVisible(true);
            jTextFieldAuxiliar.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonVerContraseña;
    private javax.swing.JComboBox<String> jComboBoxTipoEmpresa;
    private javax.swing.JLabel jLabelAbreviacionUsuario;
    private javax.swing.JLabel jLabelCirculoPerfil;
    private javax.swing.JLabel jLabelCodigoEmpresa;
    private javax.swing.JLabel jLabelCodigoEmpresa2;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCorreoOpcional;
    private javax.swing.JLabel jLabelFondoSup;
    private javax.swing.JLabel jLabelLinea;
    private javax.swing.JLabel jLabelMisDatos;
    private javax.swing.JLabel jLabelNombreDeUsuario;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelTipoEmpresa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContenerdorNombres;
    private javax.swing.JPanel jPanelPrincipalPerfil;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldAuxiliar;
    private javax.swing.JTextField jTextFieldCodigoEmpresa;
    private javax.swing.JTextField jTextFieldNombreDeUsuario;
    private javax.swing.JToggleButton jToggleButtonModificar;
    // End of variables declaration//GEN-END:variables

}
