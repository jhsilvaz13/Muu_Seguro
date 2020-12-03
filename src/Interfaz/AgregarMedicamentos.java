package Interfaz;

import Mundo.DatosAnimalesVeterinario;
import Mundo.Empresa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MateoG404
 */

public class AgregarMedicamentos extends javax.swing.JFrame {
    // DataMembers 
    
    Empresa empresa;
    String nombreUsuario;
    DatosAnimalesVeterinario datos ;
    String sexo ; 
    
    public AgregarMedicamentos(Empresa empresa, String nombreUsuario) throws IOException{
        
        this.empresa = empresa ;
        this.nombreUsuario = nombreUsuario;
        // Creación de objeto de la clase DatosAnimalesVeterinario 
        this.datos = new DatosAnimalesVeterinario(empresa.darCodigo());
        
        // Se añaden los nombre de los animales al ComBox
        initComponents();
        addComBox() ;
        System.out.println("Herre");
        
        
    }

    public void addComBox() throws IOException{
        ArrayList<String> listaAnimales = datos.LecturaAnimales();
        
        for (int i = 0 ; i < (listaAnimales.size()); i++){
            ComBoxAnimales.addItem(listaAnimales.get(i));
        }
    }
    
    public String getEnfermedad(String seleccion){
        // Se pone en el comBoxEnfermedad el nombre de las enfermedades
        
        ArrayList<String> enfermedades = datos.LecturaEnfermedades();
        System.out.println("Seleccion --->" + seleccion);
        String enfermedad = "";
        
        for (int i = 0 ; i < (enfermedades.size()) ;i+=2 ){
            if(seleccion.equals(enfermedades.get(i) ) )
                enfermedad = enfermedades.get(i+1);
        }
        return enfermedad;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioButtonEliminar = new javax.swing.JRadioButton();
        RadioButtonAgregar = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        CheckMedicamentos = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComBoxAnimales = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        DescripcionMedicamentos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        LabelPaso2 = new javax.swing.JLabel();
        NombreMedicamentos = new javax.swing.JTextField();
        NombreMedicamentos.setVisible(false);
        jButton2 = new javax.swing.JButton();
        RB7 = new javax.swing.JRadioButton();
        RB2 = new javax.swing.JRadioButton();
        RB3 = new javax.swing.JRadioButton();
        RB1 = new javax.swing.JRadioButton();
        RB8 = new javax.swing.JRadioButton();
        RB4 = new javax.swing.JRadioButton();
        RB5 = new javax.swing.JRadioButton();
        RB6 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RadioButtonEliminar.setFont(new java.awt.Font("Bebas Neue", 0, 26)); // NOI18N
        RadioButtonEliminar.setForeground(new java.awt.Color(0, 204, 204));
        RadioButtonEliminar.setText("Eliminar");
        RadioButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(RadioButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        RadioButtonAgregar.setFont(new java.awt.Font("Bebas Neue", 0, 26)); // NOI18N
        RadioButtonAgregar.setForeground(new java.awt.Color(0, 204, 204));
        RadioButtonAgregar.setText("Agregar");
        RadioButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(RadioButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Medicamentos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        CheckMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMedicamentosActionPerformed(evt);
            }
        });
        getContentPane().add(CheckMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bebas Neue", 0, 43)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("¿Desea Agregar o Eliminar?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("vitaminas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        ComBoxAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComBoxAnimalesActionPerformed(evt);
            }
        });
        getContentPane().add(ComBoxAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 190, -1));

        jLabel6.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("1.Seleccione el animal ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        DescripcionMedicamentos.setText("Describa los medicamentos aquí");
        DescripcionMedicamentos.enable(false);
        DescripcionMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionMedicamentosActionPerformed(evt);
            }
        });
        getContentPane().add(DescripcionMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 420, 120));

        jButton1.setFont(new java.awt.Font("Bebas Neue", 0, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 100, 30));

        LabelPaso2.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        LabelPaso2.setForeground(new java.awt.Color(255, 255, 255));
        LabelPaso2.setText(" ");
        getContentPane().add(LabelPaso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 360, -1));

        NombreMedicamentos.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        NombreMedicamentos.setText("Nombre");
        NombreMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreMedicamentosActionPerformed(evt);
            }
        });
        getContentPane().add(NombreMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 210, -1));

        jButton2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        RB7.setText("jRadioButton1");
        RB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB7ActionPerformed(evt);
            }
        });
        getContentPane().add(RB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        RB2.setText("jRadioButton1");
        getContentPane().add(RB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        RB3.setText("jRadioButton1");
        getContentPane().add(RB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, -1));

        RB1.setText("jRadioButton1");
        RB1.setVisible(true);
        getContentPane().add(RB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        RB8.setText("jRadioButton1");
        getContentPane().add(RB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        RB4.setText("jRadioButton1");
        getContentPane().add(RB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        RB5.setText("jRadioButton1");
        getContentPane().add(RB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, -1));

        RB6.setText("jRadioButton1");
        getContentPane().add(RB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/DataImage/fondomedicamentos.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonAgregarActionPerformed
        // Si se oprime el boton de agregar, la ventana muestra el textField de descripción.
        // Y el label donde dice los pasos para agregar
       RadioButtonEliminar.setSelected(false);

       LabelPaso2.setText("2. Seleccione la opción que desea agregar");
        
        
    }//GEN-LAST:event_RadioButtonAgregarActionPerformed

    private void CheckMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMedicamentosActionPerformed
        
            
        if(CheckMedicamentos.isSelected()){
            DescripcionMedicamentos.enable(true);
            NombreMedicamentos.setVisible(true);
        }
        else{
            NombreMedicamentos.setVisible(false);
            DescripcionMedicamentos.setText("Describa el medicamento aquí");
            DescripcionMedicamentos.enable(false);
        }
        
    }//GEN-LAST:event_CheckMedicamentosActionPerformed

    private void DescripcionMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionMedicamentosActionPerformed
    
    }//GEN-LAST:event_DescripcionMedicamentosActionPerformed

    private void RadioButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEliminarActionPerformed
        // Si se selecciona esto se deben cambiar algunos labels 
        RadioButtonAgregar.setSelected(false);

        LabelPaso2.setText("2. Seleccione la opción que desea eliminar");
        
    }//GEN-LAST:event_RadioButtonEliminarActionPerformed

    private void ComBoxAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComBoxAnimalesActionPerformed
        
        if(RadioButtonAgregar.isSelected() == false && RadioButtonEliminar.isSelected() == false)
            JOptionPane.showMessageDialog(null, "Primero debe seleccionar si desea agregar o eliminar");
        
        // Si es vaca se muestran 8 radiobotones
        // Si es toro se muestran 3 radiobotones
        // Si es ternero se muestran 3 radiobotones
       
        // En la clase DatosAnimalesVeterinarios se busca el sexo del animal seleccionado 
        
        try {
            
            sexo = datos.getSexo(ComBoxAnimales.getSelectedItem().toString());
            System.out.println("Entrooooooooo");
            System.out.println("Sexo -->" + sexo );
            System.out.println("-->" + (sexo.equals("Vaca")));
            
            if (sexo.equals("Vaca") == true ){
                // Se muestran los 8 radioBotones
                
                RB1.setVisible(true); RB1.setText("Vitamina A");
                RB2.setVisible(true); RB2.setText("Vitamina D");
                RB3.setVisible(true); RB3.setText("Vitamina E");
                RB4.setVisible(true); RB4.setText("Calcio");
                RB5.setVisible(true); RB5.setText("Cobre");
                RB6.setVisible(true); RB6.setText("Complejo B");
                RB7.setVisible(true); RB7.setText("Magnesio");
                RB8.setVisible(true); RB8.setText("Yodo");

            }
            else if (sexo.equals("Toro") == true ){
                // Se muestran los 3 radioBotones 
                RB1.setVisible(true); RB1.setText("Vitamina E");
                RB2.setVisible(true); RB2.setText("Calcio");
                RB3.setVisible(true); RB3.setText("Selenio");
                RB4.setVisible(false);
                RB5.setVisible(false);
                RB6.setVisible(false);
                RB7.setVisible(false);
                RB8.setVisible(false);

            }else if (sexo.equals("Ternera" )|| sexo.equals("Ternero") == true){
                // Se muestran los 7 radioBotones 
                RB1.setVisible(true); RB1.setText("Vitamina D");
                RB2.setVisible(true); RB2.setText("Vitamina E");
                RB3.setVisible(true); RB3.setText("Vitamina B12");
                RB4.setVisible(true); RB4.setText("Calcio");
                RB5.setVisible(true); RB5.setText("Cobre");
                RB6.setVisible(true); RB6.setText("Fosforo");
                RB7.setVisible(true); RB7.setText("Yodo");
                RB8.setVisible(false);

            }
        } catch (IOException ex) {
            Logger.getLogger(AgregarMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
            
    }//GEN-LAST:event_ComBoxAnimalesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* Se guardan los datos que se ingresaron 
            Si es vaca --> 8
            Si es Ternero --> 3
            Si es Toro --> 7
        
        
        if (sexo.equals("Vaca")){
            
        }else if (sexo.equals("Toro")){
            
        }else{
            
        }*/
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NombreMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreMedicamentosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Se regresa a la ventana principal del administrador
        VeterinarioInterfaz veterinarioVentana;
        try {
            veterinarioVentana = new VeterinarioInterfaz(empresa,nombreUsuario);
            veterinarioVentana.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AgregarMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CheckMedicamentos;
    private javax.swing.JComboBox<String> ComBoxAnimales;
    private javax.swing.JTextField DescripcionMedicamentos;
    private javax.swing.JLabel LabelPaso2;
    private javax.swing.JTextField NombreMedicamentos;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JRadioButton RB4;
    private javax.swing.JRadioButton RB5;
    private javax.swing.JRadioButton RB6;
    private javax.swing.JRadioButton RB7;
    private javax.swing.JRadioButton RB8;
    private javax.swing.JRadioButton RadioButtonAgregar;
    private javax.swing.JRadioButton RadioButtonEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
