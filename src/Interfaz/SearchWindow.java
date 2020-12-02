/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author John Silva
 */
import Mundo.Empresa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList ;

public class SearchWindow extends javax.swing.JFrame {
    //Data Members 
    Empresa empresa; 
    String nombre;
    public SearchWindow(Empresa emp, String nombreUsua) {
        empresa=emp;
        nombre=nombreUsua;
        initComponents();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {   
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanelTablas = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAnimal= new javax.swing.JLabel();
        jLabelUsuario= new javax.swing.JLabel();
        jLabelLotes= new javax.swing.JLabel();
        jLabelPregunta= new javax.swing.JLabel();
        RegresarButton = new javax.swing.JButton();
        jScrollPaneAnimales = new javax.swing.JScrollPane();
        jScrollPaneUsuarios = new javax.swing.JScrollPane();
        jScrollPaneLotes = new javax.swing.JScrollPane();
        jTableAnimales=new javax.swing.JTable();
        jTableUsuarios=new javax.swing.JTable();
        jTableLotes=new javax.swing.JTable();
        jTextFieldBuscarAnimal=new javax.swing.JTextField();
        jTextFieldBuscarUsuario=new javax.swing.JTextField();
        jTextFieldBuscarLote=new javax.swing.JTextField();
        buttonGroupSelecciónBusqueda= new javax.swing.ButtonGroup();
        jRadioButtonAnimales= new javax.swing.JRadioButton();
        jRadioButtonUsuarios= new javax.swing.JRadioButton ();
        jRadioButtonLotes= new javax.swing.JRadioButton();
        jTableAnimales.setEnabled(false);
        jTableUsuarios.setEnabled(false);
        jTableLotes.setEnabled(false);
        fondo= new javax.swing.JLabel();
      
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Muu Seguro");
        setBackground(new java.awt.Color(172, 225, 141));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        setLocation(150, 50);
        
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
       
        jPanel2.setBackground(new java.awt.Color(104,191,52));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        jPanelTablas.setBackground(new java.awt.Color(245,245,245));
        jPanelTablas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
       
        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Datos de la empresa");
        jPanel2.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 5, -1, -1));

        RegresarButton.setBackground(new java.awt.Color(255, 255, 255));
        RegresarButton.setText("Regresar");
        RegresarButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        RegresarButton.setForeground(new java.awt.Color(97, 97, 97));
        RegresarButton.setBorder(null);
        RegresarButton.setBorderPainted(false);
        RegresarButton.setFocusPainted(false);
        RegresarButton.setMargin(new java.awt.Insets(100, 2, 100, 14));
        RegresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 555, 100, 32));
        
        
        
        //Jradio
        
        jRadioButtonAnimales.setBackground(new java.awt.Color(97, 97, 97));
        buttonGroupSelecciónBusqueda.add(jRadioButtonAnimales);
        jRadioButtonAnimales.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jRadioButtonAnimales.setText("Animales");
        jRadioButtonAnimales.setContentAreaFilled(false);
        jRadioButtonAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAnimalesActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));
        
        
        jRadioButtonUsuarios.setBackground(new java.awt.Color(97, 97, 97));
        buttonGroupSelecciónBusqueda.add(jRadioButtonUsuarios);
        jRadioButtonUsuarios.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jRadioButtonUsuarios.setText("Usuarios");
        jRadioButtonUsuarios.setContentAreaFilled(false);
        if(nombre.equals("")){
           jRadioButtonUsuarios.setEnabled(true);
        }else{
           jRadioButtonUsuarios.setEnabled(false);
        }
        jRadioButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUsuariosActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));
        
        jRadioButtonLotes.setBackground(new java.awt.Color(97, 97, 97));
        buttonGroupSelecciónBusqueda.add(jRadioButtonLotes);
        jRadioButtonLotes.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jRadioButtonLotes.setText("Lotes");
        jRadioButtonLotes.setContentAreaFilled(false);
        jRadioButtonLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLotesActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));
        




        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 120));
        //Cargar tablas
        datosAnimal();
        datosUsuarios();
        datosLotes();
        
        jLabelPregunta.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPregunta.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPregunta.setText("¿Qué desea buscar?");
        jPanel2.add(jLabelPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 48, 150, 30));
        
        //ANIMALES
        jLabelAnimal.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAnimal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelAnimal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAnimal.setText("Número de registro: ");
        jLabelAnimal.setVisible(false);
        jPanel2.add(jLabelAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 85, 150, 30));
        
        jTextFieldBuscarAnimal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldBuscarAnimal.setAutoscrolls(false);
        jTextFieldBuscarAnimal.setVisible(false);
        jTextFieldBuscarAnimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(jTextFieldBuscarAnimal.getText().equals("")){
                    datosAnimal();
                }else{
                    ArrayList<String[]>filasTemp=new ArrayList<>();
                    String[] fila;
                    for(int i=0; i<empresa.darAdmin().darArregloToros().size();i++){
                        if(empresa.darAdmin().darArregloToros().get(i).darNumeroSerie().equals(jTextFieldBuscarAnimal.getText())){ 
                            fila=new String[10];
                            fila[0]=("Toro");
                            fila[1]=(empresa.darAdmin().darArregloToros().get(i).darNumeroSerie());
                            fila[2]=(empresa.darAdmin().darArregloToros().get(i).darNombre());
                            fila[3]=(empresa.darAdmin().darArregloToros().get(i).darRaza());
                            fila[4]=(empresa.darAdmin().darArregloToros().get(i).darNacimiento());
                            fila[5]=(empresa.darAdmin().darArregloToros().get(i).darEdad()+"");
                            fila[6]=(empresa.darAdmin().darArregloToros().get(i).darpeso()+"");                
                            fila[7]=(empresa.darAdmin().darArregloToros().get(i).darNumeroCrias()+"");
                            fila[8]=(empresa.darAdmin().darArregloToros().get(i).darCantidadCarne()+"");
                            fila[9]=("NULL");
                            filasTemp.add(fila);
                        }
                    }
                    for(int i=0; i<empresa.darAdmin().darArregloVacas().size();i++){
                         if(empresa.darAdmin().darArregloVacas().get(i).darNumeroSerie().equals(jTextFieldBuscarAnimal.getText())){     
                            fila=new String[10];
                            fila[0]=("Vaca");
                            fila[1]=(empresa.darAdmin().darArregloVacas().get(i).darNumeroSerie());
                            fila[2]=(empresa.darAdmin().darArregloVacas().get(i).darNombre());
                            fila[3]=(empresa.darAdmin().darArregloVacas().get(i).darRaza());
                            fila[4]=(empresa.darAdmin().darArregloVacas().get(i).darNacimiento());
                            fila[5]=(empresa.darAdmin().darArregloVacas().get(i).darEdad()+"");
                            fila[6]=(empresa.darAdmin().darArregloVacas().get(i).darpeso()+"");                
                            fila[7]=(empresa.darAdmin().darArregloVacas().get(i).darNumeroCrias()+"");
                            fila[8]=(empresa.darAdmin().darArregloVacas().get(i).darCantidadCarne()+"");
                            fila[9]=(empresa.darAdmin().darArregloVacas().get(i).darCantidadLeche()+"");
                            filasTemp.add(fila);
                         }    
                    }
                    
                    for(int i=0; i<empresa.darAdmin().darArregloTernera().size();i++){
                         if(empresa.darAdmin().darArregloTernera().get(i).darNumeroSerie().equals(jTextFieldBuscarAnimal.getText())){     
                            fila=new String[10];
                            fila[0]=("Ternera");
                            fila[1]=(empresa.darAdmin().darArregloTernera().get(i).darNumeroSerie());
                            fila[2]=(empresa.darAdmin().darArregloTernera().get(i).darNombre());
                            fila[3]=(empresa.darAdmin().darArregloTernera().get(i).darRaza());
                            fila[4]=(empresa.darAdmin().darArregloTernera().get(i).darNacimiento());
                            fila[5]=(empresa.darAdmin().darArregloTernera().get(i).darEdad()+"");
                            fila[6]=(empresa.darAdmin().darArregloTernera().get(i).darpeso()+"");                
                            fila[7]="NULL";
                            fila[8]="NULL";
                            fila[9]="NULL";
                            filasTemp.add(fila);
                         }    
                    }
                    
                    for(int i=0; i<empresa.darAdmin().darArregloTernero().size();i++){
                         if(empresa.darAdmin().darArregloTernero().get(i).darNumeroSerie().equals(jTextFieldBuscarAnimal.getText())){     
                            fila=new String[10];
                            fila[0]=("Ternero");
                            fila[1]=(empresa.darAdmin().darArregloTernero().get(i).darNumeroSerie());
                            fila[2]=(empresa.darAdmin().darArregloTernero().get(i).darNombre());
                            fila[3]=(empresa.darAdmin().darArregloTernero().get(i).darRaza());
                            fila[4]=(empresa.darAdmin().darArregloTernero().get(i).darNacimiento());
                            fila[5]=(empresa.darAdmin().darArregloTernero().get(i).darEdad()+"");
                            fila[6]=(empresa.darAdmin().darArregloTernero().get(i).darpeso()+"");                
                            fila[7]="NULL";
                            fila[8]="NULL";
                            fila[9]="NULL";
                            filasTemp.add(fila);
                         }    
                    }

                    String[][] filas=new String[filasTemp.size()][10];
                    for(int i=0; i<filasTemp.size();i++){
                        for(int j=0; j<filasTemp.get(0).length;j++){
                            filas[i][j]=filasTemp.get(i)[j];
                        }
                    }
                    jTableAnimales.setModel(new javax.swing.table.DefaultTableModel(
                    filas,
                    new String [] {
                        "Sexo", "Número", "Nombre", "Raza", "Edad", "Peso(kg)", "Crías", "kgs.Carne", "Lts.Leche"
                        }
                    ));
                    jScrollPaneAnimales.setViewportView(jTableAnimales);
                }
            }
        });  
        jPanel2.add(jTextFieldBuscarAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, 745, 30));
        jScrollPaneAnimales.setBorder(javax.swing.BorderFactory.createTitledBorder ("ANIMALES"));
       
        
        
        //USUARIOS
        jLabelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuario.setText("Nombre de usuario: ");
        jLabelUsuario.setVisible(false);
        jPanel2.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 85, 150, 30));
        
        jTextFieldBuscarUsuario.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldBuscarUsuario.setAutoscrolls(false);
        jTextFieldBuscarUsuario.setVisible(false);
        jTextFieldBuscarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(jTextFieldBuscarUsuario.getText().equals("")){
                    datosUsuarios();
                }else{
                   ArrayList<String[]>filasTemp=new ArrayList<>();
                    String[] fila;
                    for(int i=0; i<empresa.darAdmin().darArregloEmpleados().size();i++){
                        if(empresa.darAdmin().darArregloEmpleados().get(i).darNombre().equals(jTextFieldBuscarUsuario.getText())){
                            fila=new String[4];
                            fila[0]="Empleado";
                            fila[1]=empresa.darAdmin().darArregloEmpleados().get(i).darNombre();
                            fila[2]=empresa.darAdmin().darArregloEmpleados().get(i).darSalario()+"";
                            fila[3]=empresa.darAdmin().darArregloEmpleados().get(i).darFechaInicioLaboral();
                            filasTemp.add(fila);
                        }
                    }
                    for(int i=0; i<empresa.darAdmin().darArregloVeterinarios().size();i++){
                        if(empresa.darAdmin().darArregloVeterinarios().get(i).darNombre().equals(jTextFieldBuscarUsuario.getText())){    
                            fila=new String[4];
                            fila[0]="Veterinario";
                            fila[1]=empresa.darAdmin().darArregloVeterinarios().get(i).darNombre();
                            fila[2]=empresa.darAdmin().darArregloVeterinarios().get(i).darSalario()+"";
                            fila[3]=empresa.darAdmin().darArregloVeterinarios().get(i).darFechaInicioLaboral();
                            filasTemp.add(fila);
                        }    
                    }

                    String[][] filasU=new String[filasTemp.size()][4];
                    for(int i=0; i<filasTemp.size();i++){
                        for(int j=0; j<filasTemp.get(0).length;j++){
                            filasU[i][j]=filasTemp.get(i)[j];
                        }
                    }
                    jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
                    filasU,
                    new String [] {
                        "Tipo", "Nombre", "Salario", "Fecha de inicio laboral"
                        }
                    ));
                    jScrollPaneUsuarios.setViewportView(jTableUsuarios);
                }
            }
        });  
        jPanel2.add(jTextFieldBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, 745, 30));
            
        jScrollPaneUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder ("USUARIOS"));
        
        
        //Lotes
        jLabelLotes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLotes.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelLotes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLotes.setText("Número de lote: ");
        jLabelLotes.setVisible(false);
        jPanel2.add(jLabelLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 85, 150, 30));
        
        jTextFieldBuscarLote.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldBuscarLote.setAutoscrolls(false);
        jTextFieldBuscarLote.setVisible(false);
        jTextFieldBuscarLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(jTextFieldBuscarLote.getText().equals("")){
                    datosLotes();
                }else{
                    ArrayList<String[]>filasTemp=new ArrayList<>();
                    String[] fila;
                    for(int i=0; i<empresa.darAdmin().darArregloLote().size();i++){
                        if((""+empresa.darAdmin().darArregloLote().get(i).darNumero()).equals(jTextFieldBuscarLote.getText())){
                            fila=new String[4];
                            fila[0]=empresa.darAdmin().darArregloLote().get(i).darNumero()+"";
                            fila[1]=empresa.darAdmin().darArregloLote().get(i).darRazaLote();  
                            fila[2]=empresa.darAdmin().darArregloLote().get(i).darCalidad()+"";
                            fila[3]=empresa.darAdmin().darArregloLote().get(i).darAgua();
                            filasTemp.add(fila);
                        }
                    }

                    String[][] filasL=new String[filasTemp.size()][4];
                    for(int i=0; i<filasTemp.size();i++){
                        for(int j=0; j<filasTemp.get(0).length;j++){
                            filasL[i][j]=filasTemp.get(i)[j];
                        }
                    }
                    jTableLotes.setModel(new javax.swing.table.DefaultTableModel(
                    filasL,
                    new String [] {
                        "Número", "Raza","Calidad","Punto agua"
                        }
                    ));
                    jScrollPaneLotes.setViewportView(jTableLotes);
                }
            }
        });  
        jPanel2.add(jTextFieldBuscarLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, 745, 30));
        
        jScrollPaneLotes.setBorder(javax.swing.BorderFactory.createTitledBorder ("LOTES"));            
        
        getContentPane().add(jPanelTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 900, 400));
        
        
        
        this.setResizable(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));
        
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/DataImage/fondoData.png")));
        jPanel1.add(fondo,  new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));
        
        pack();
        
    }// </editor-fold>                        

    private void RegresarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        if(nombre.length()==0){
            Ventana vent=new Ventana(empresa);
            this.setVisible(false);
            vent.setVisible(true);
        }else{
            WorkerWindow vent=new WorkerWindow(empresa, nombre);
            this.setVisible(false);
            vent.setVisible(true);
        }
    }                                              
                                      

                                            
    
    private void datosAnimal(){
        ArrayList<String[]>filasTemp=new ArrayList<>();
            String[] fila;
            for(int i=0; i<empresa.darAdmin().darArregloToros().size();i++){
                fila=new String[10];
                fila[0]=("Toro");
                fila[1]=(empresa.darAdmin().darArregloToros().get(i).darNumeroSerie());
                fila[2]=(empresa.darAdmin().darArregloToros().get(i).darNombre());
                fila[3]=(empresa.darAdmin().darArregloToros().get(i).darRaza());
                fila[4]=(empresa.darAdmin().darArregloToros().get(i).darNacimiento());
                fila[5]=(empresa.darAdmin().darArregloToros().get(i).darEdad()+"");
                fila[6]=(empresa.darAdmin().darArregloToros().get(i).darpeso()+"");                
                fila[7]=(empresa.darAdmin().darArregloToros().get(i).darNumeroCrias()+"");
                fila[8]=(empresa.darAdmin().darArregloToros().get(i).darCantidadCarne()+"");
                fila[9]=("NULL");
                filasTemp.add(fila);
            }
            for(int i=0; i<empresa.darAdmin().darArregloVacas().size();i++){
                fila=new String[10];
                fila[0]=("Vaca");
                fila[1]=(empresa.darAdmin().darArregloVacas().get(i).darNumeroSerie());
                fila[2]=(empresa.darAdmin().darArregloVacas().get(i).darNombre());
                fila[3]=(empresa.darAdmin().darArregloVacas().get(i).darRaza());
                fila[4]=(empresa.darAdmin().darArregloVacas().get(i).darNacimiento());
                fila[5]=(empresa.darAdmin().darArregloVacas().get(i).darEdad()+"");
                fila[6]=(empresa.darAdmin().darArregloVacas().get(i).darpeso()+"");                
                fila[7]=(empresa.darAdmin().darArregloVacas().get(i).darNumeroCrias()+"");
                fila[8]=(empresa.darAdmin().darArregloVacas().get(i).darCantidadCarne()+"");
                fila[9]=(empresa.darAdmin().darArregloVacas().get(i).darCantidadLeche()+"");
                filasTemp.add(fila);
            }
            
            for(int i=0; i<empresa.darAdmin().darArregloTernera().size();i++){
                fila=new String[10];
                fila[0]=("Ternera");
                fila[1]=(empresa.darAdmin().darArregloTernera().get(i).darNumeroSerie());
                fila[2]=(empresa.darAdmin().darArregloTernera().get(i).darNombre());
                fila[3]=(empresa.darAdmin().darArregloTernera().get(i).darRaza());
                fila[4]=(empresa.darAdmin().darArregloTernera().get(i).darNacimiento());
                fila[5]=(empresa.darAdmin().darArregloTernera().get(i).darEdad()+"");
                fila[6]=(empresa.darAdmin().darArregloTernera().get(i).darpeso()+"");                
                fila[7]="NULL";
                fila[8]="NULL";
                fila[9]="NULL";
                filasTemp.add(fila);             
            } 
            
            for(int i=0; i<empresa.darAdmin().darArregloTernero().size();i++){
                fila=new String[10];
                fila[0]=("Ternero");
                fila[1]=(empresa.darAdmin().darArregloTernero().get(i).darNumeroSerie());
                fila[2]=(empresa.darAdmin().darArregloTernero().get(i).darNombre());
                fila[3]=(empresa.darAdmin().darArregloTernero().get(i).darRaza());
                fila[4]=(empresa.darAdmin().darArregloTernero().get(i).darNacimiento());
                fila[5]=(empresa.darAdmin().darArregloTernero().get(i).darEdad()+"");
                fila[6]=(empresa.darAdmin().darArregloTernero().get(i).darpeso()+"");                
                fila[7]="NULL";
                fila[8]="NULL";
                fila[9]="NULL";
                filasTemp.add(fila);             
            }    
            
            String[][] filas=new String[filasTemp.size()][10];
            for(int i=0; i<filasTemp.size();i++){
                for(int j=0; j<filasTemp.get(0).length;j++){
                    filas[i][j]=filasTemp.get(i)[j];
                }
            }
            jTableAnimales.setModel(new javax.swing.table.DefaultTableModel(
            filas,
            new String [] {
                "Sexo", "Número", "Nombre", "Raza", "Fecha nacimiento","Edad en años", "Peso(kg)", "Crías", "kgs.Carne", "Lts.Leche"
                }
            ));
            jScrollPaneAnimales.setViewportView(jTableAnimales);
    }
    
    private void datosUsuarios(){
        ArrayList<String[]>filasTemp=new ArrayList<>();
            String[] fila;
            for(int i=0; i<empresa.darAdmin().darArregloEmpleados().size();i++){
                fila=new String[4];
                fila[0]="Empleado";
                fila[1]=empresa.darAdmin().darArregloEmpleados().get(i).darNombre();
                fila[2]=empresa.darAdmin().darArregloEmpleados().get(i).darSalario()+"";
                fila[3]=empresa.darAdmin().darArregloEmpleados().get(i).darFechaInicioLaboral();
                filasTemp.add(fila);
            }
            for(int i=0; i<empresa.darAdmin().darArregloVeterinarios().size();i++){
                fila=new String[4];
                fila[0]="Veterinario";
                fila[1]=empresa.darAdmin().darArregloVeterinarios().get(i).darNombre();
                fila[2]=empresa.darAdmin().darArregloVeterinarios().get(i).darSalario()+"";
                fila[3]=empresa.darAdmin().darArregloVeterinarios().get(i).darFechaInicioLaboral();
                filasTemp.add(fila);
            }
            
            String[][] filasU=new String[filasTemp.size()][4];
            for(int i=0; i<filasTemp.size();i++){
                for(int j=0; j<filasTemp.get(0).length;j++){
                    filasU[i][j]=filasTemp.get(i)[j];
                }
            }
            jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            filasU,
            new String [] {
                "Tipo", "Nombre", "Salario", "Fecha de inicio laboral"
                }
            ));
            jScrollPaneUsuarios.setViewportView(jTableUsuarios);
    }
    
    private void datosLotes(){
        ArrayList<String[]>filasTemp=new ArrayList<>();
            String[] fila;
            for(int i=0; i<empresa.darAdmin().darArregloLote().size();i++){
                fila=new String[4];
                fila[0]=empresa.darAdmin().darArregloLote().get(i).darNumero()+"";
                fila[1]=empresa.darAdmin().darArregloLote().get(i).darRazaLote();  
                fila[2]=empresa.darAdmin().darArregloLote().get(i).darCalidad()+"";
                fila[3]=empresa.darAdmin().darArregloLote().get(i).darAgua();
                filasTemp.add(fila);
            }
            
            String[][] filasL=new String[filasTemp.size()][4];
            for(int i=0; i<filasTemp.size();i++){
                for(int j=0; j<filasTemp.get(0).length;j++){
                    filasL[i][j]=filasTemp.get(i)[j];
                }
            }
            jTableLotes.setModel(new javax.swing.table.DefaultTableModel(
            filasL,
            new String [] {
                "Número", "Raza","Calidad","Punto agua"
                }
            ));
            jScrollPaneLotes.setViewportView(jTableLotes);
    }
    
    private void jRadioButtonAnimalesActionPerformed(java.awt.event.ActionEvent evt){
        jTextFieldBuscarAnimal.setVisible(true); 
        jTextFieldBuscarUsuario.setVisible(false);
        jTextFieldBuscarLote.setVisible(false);
        jLabelAnimal.setVisible(true);
        jLabelUsuario.setVisible(false);
        jLabelLotes.setVisible(false);
        jPanelTablas.removeAll();
        jPanelTablas.repaint();
        jPanelTablas.add(jScrollPaneAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 395));
    }
    
    private void jRadioButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt){  
            jTextFieldBuscarAnimal.setVisible(false); 
            jTextFieldBuscarUsuario.setVisible(true);
            jTextFieldBuscarLote.setVisible(false);
            jLabelAnimal.setVisible(false);
            jLabelUsuario.setVisible(true);
            jLabelLotes.setVisible(false);
            jPanelTablas.removeAll();
            jPanelTablas.repaint();
            jPanelTablas.add(jScrollPaneUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 395));   
    }
    
    private void jRadioButtonLotesActionPerformed(java.awt.event.ActionEvent evt){
        jTextFieldBuscarAnimal.setVisible(false); 
        jTextFieldBuscarUsuario.setVisible(false);
        jTextFieldBuscarLote.setVisible(true);
        jLabelAnimal.setVisible(false);
        jLabelUsuario.setVisible(false);
        jLabelLotes.setVisible(true);
        jPanelTablas.removeAll();
        jPanelTablas.repaint();
        jPanelTablas.add(jScrollPaneLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 395));
    }
 

    // Variables declaration - do not modify                     
    private javax.swing.JButton RegresarButton;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelAnimal;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelLotes;
    private javax.swing.JLabel jLabelPregunta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTablas;
    private javax.swing.JScrollPane jScrollPaneAnimales;
    private javax.swing.JScrollPane jScrollPaneUsuarios;
    private javax.swing.JScrollPane jScrollPaneLotes;
    private javax.swing.JTable jTableAnimales;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTable jTableLotes;
    private javax.swing.JTextField jTextFieldBuscarAnimal;
    private javax.swing.JTextField jTextFieldBuscarUsuario;
    private javax.swing.JTextField jTextFieldBuscarLote;
    private javax.swing.ButtonGroup buttonGroupSelecciónBusqueda;
    private javax.swing.JRadioButton jRadioButtonAnimales;
    private javax.swing.JRadioButton jRadioButtonUsuarios;
    private javax.swing.JRadioButton jRadioButtonLotes;
    
    

    // End of variables declaration                   
}
