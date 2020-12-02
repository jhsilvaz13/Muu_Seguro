package Interfaz;

import Mundo.Empleado;
import Mundo.Empresa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList ;
import javax.swing.JOptionPane;
//import Mundo.Empresa2;

/**
 *
 * @author MateoG404
 */

public class WorkerWindow extends javax.swing.JFrame {
   // Create Objects //
    Empresa empresa ;
    Empleado empleado;
    Tabla_Lotes panelMapa;
    
    // Constructor
    public WorkerWindow(Empresa empresa, String nombreUsuario){
        
        this.empresa = empresa ;
        empleado=empresa.darEmpleadoActual(nombreUsuario, empresa.darCodigo());
        panelMapa=new Tabla_Lotes(null,empresa,valoresTamañoFinca()[0],valoresTamañoFinca()[1],false, false);
        initComponents();
        // Properties to the texts areas 
        textSetA.setLineWrap(true);
        textSetA.setWrapStyleWord(true);
        textSetB.setLineWrap(true);
        textSetB.setWrapStyleWord(true);
        textSetC.setLineWrap(true);
        textSetC.setWrapStyleWord(true);
        this.setLocationRelativeTo(null);
        AddLotesCB();
    }
    //                                      Methods                           //
   
    
    //Add the Set to the ComboBox 
     public void AddLotesCB(){
        ArrayList<String> Lotes = empresa.darAdmin().getLotesArray() ;
        for (int i = 0; i < Lotes.size()  ; i++) {
            String temp = Lotes.get(i) ;
            CBSetA.addItem(temp);
            CBSetB.addItem(Lotes.get(i));
            CBSetC.addItem(Lotes.get(i));
        }
    }
    
    // Return a String with the properties of each Set
    public String  getProperties(String lote) throws IOException{
        String [] temp =empresa.darAdmin().getProperties(lote).toArray(new String[empresa.darAdmin().getProperties(lote).size()]);
         String properties = temp[0] + "\n";
        properties += "Calidad Pasto " + temp[1] + "\n" ;
        properties += "Punto de Agua " + temp[2] + "\n" ;
        properties += "Raza " + temp[3] ;
        
        return properties ;
    }
    
    // Return the name of the image
    public String getImage(String lote){         
        return empresa.darAdmin().getImage(lote).toLowerCase();
    }
    
    

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelImage1 = new javax.swing.JLabel();
        BProfile1 = new javax.swing.JButton();
        BSearch1 = new javax.swing.JButton();
        BOut1 = new javax.swing.JButton();
        fond = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CBSetA = new javax.swing.JComboBox<>();
        CBSetB = new javax.swing.JComboBox<>();
        CBSetC = new javax.swing.JComboBox<>();
        CowB = new javax.swing.JLabel();
        CowA = new javax.swing.JLabel();
        CowC = new javax.swing.JLabel();
        jLabelImageNorth= new javax.swing.JLabel();
        jLabelImageSouth= new javax.swing.JLabel();
        jLabelImageWest= new javax.swing.JLabel();
        jLabelImageEast= new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSetA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textSetB = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textSetC = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();
        contenedorMapa= new javax.swing.JPanel();
        jScrollPaneMap= new javax.swing.JScrollPane();
        mapa=panelMapa.getPanelPrincipal();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Muu Seguro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        setLocation(new java.awt.Point(150, 50));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(128, 95, 29));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("../Interfaz/DataImage/logoMuuTexto.png"))); // NOI18N
        jPanel1.add(LabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 190, 176));
        
        
        BProfile1.setIcon(new javax.swing.ImageIcon("..\\Muu-Seguro\\src\\Interfaz\\DataImage\\perfil.png")); // NOI18N
        BProfile1.setText("PERFIL");
        BProfile1.setFont(new java.awt.Font("SansSerif", 0, 12));
        BProfile1.setForeground(new java.awt.Color(255,255,255));
        BProfile1.setBorder(null);
        BProfile1.setBorderPainted(false);
        BProfile1.setBackground(new java.awt.Color(128,95,29));
        BProfile1.setContentAreaFilled(false);
        BProfile1.setOpaque(true);
        BProfile1.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt,BProfile1);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                buttonMouseExited(evt, BProfile1);
            }
        });
        BProfile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProfile1ActionPerformed(evt);
            }
        });
        jPanel1.add(BProfile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 32));

        BSearch1.setIcon(new javax.swing.ImageIcon("..\\Muu-Seguro\\src\\Interfaz\\DataImage\\buscar.png")); // NOI18N
        BSearch1.setText("BUSCAR");
        BSearch1.setFont(new java.awt.Font("SansSerif", 0, 12));
        BSearch1.setForeground(new java.awt.Color(255,255,255));
        BSearch1.setBorder(null);
        BSearch1.setBorderPainted(false);
        BSearch1.setBackground(new java.awt.Color(128,95,29));
        BSearch1.setContentAreaFilled(false);
        BSearch1.setOpaque(true);
        BSearch1.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt,BSearch1);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                buttonMouseExited(evt, BSearch1);
            }
        });
        BSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSearch1ActionPerformed(evt);
            }
        });
        jPanel1.add(BSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 190, 32));        

        BOut1.setIcon(new javax.swing.ImageIcon("..\\Muu-Seguro\\src\\Interfaz\\DataImage\\salir.png")); // NOI18N
        BOut1.setBorder(null);
        BOut1.setBorderPainted(false);
        BOut1.setBackground(new java.awt.Color(128,95,29));
        BOut1.setContentAreaFilled(false);
        BOut1.setOpaque(true);        
        BOut1.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt,BOut1);
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                buttonMouseExited(evt, BOut1);
            }
        });
        BOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOut1ActionPerformed(evt);
            }
        });
        jPanel1.add(BOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 565, 30, 30));
        
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 600));

        fond.setBackground(new java.awt.Color(255, 255, 255));
        fond.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../Interfaz/DataImage/obra.png"))); // NOI18N
        
        jLabelImageNorth.setIcon(new javax.swing.ImageIcon(getClass().getResource("../Interfaz/DataImage/north.png")));
        fond.add(jLabelImageNorth, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 78, -1,-1));
        
        jLabelImageSouth.setIcon(new javax.swing.ImageIcon(getClass().getResource("../Interfaz/DataImage/south.png")));
        fond.add(jLabelImageSouth, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1,-1));
        
        jLabelImageWest.setIcon(new javax.swing.ImageIcon(getClass().getResource("../Interfaz/DataImage/west.png")));
        fond.add(jLabelImageWest, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 295, -1,-1));
        
        jLabelImageEast.setIcon(new javax.swing.ImageIcon(getClass().getResource("../Interfaz/DataImage/east.png")));
        fond.add(jLabelImageEast, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 295, -1,-1));

        contenedorMapa.setBackground(new java.awt.Color(128,95,29));
        contenedorMapa.setLayout(new java.awt.BorderLayout());
        
        jScrollPaneMap.setViewportView(mapa);
        
        contenedorMapa.add(jScrollPaneMap);
        
        fond.add(contenedorMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 115, 400,400));
        
        
        
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("MAPA LOTES");
        fond.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 50, -1, -1));
        
        CBSetA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSetAActionPerformed(evt);
            }
        });
        fond.add(CBSetA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 26, 150, 30));

        CBSetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSetBActionPerformed(evt);
            }
        });
        fond.add(CBSetB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 194, 150, 30));

        CBSetC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSetCActionPerformed(evt);
            }
        });
        fond.add(CBSetC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 358, 150, 30));
        fond.add(CowB, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 215, 108, 108));
        fond.add(CowA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 108, 108));
        fond.add(CowC, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 379, 108, 108));

        textSetA.setColumns(20);
        textSetA.setRows(5);
        jScrollPane1.setViewportView(textSetA);

        fond.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 120));

        textSetB.setColumns(20);
        textSetB.setRows(5);
        jScrollPane2.setViewportView(textSetB);

        fond.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 226, 190, 120));

        textSetC.setColumns(20);
        textSetC.setRows(5);
        jScrollPane3.setViewportView(textSetC);

        fond.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, 130));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../Interfaz/DataImage/FondoDos.png"))); // NOI18N
        fond.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 790, 600));
        pack();
    }// </editor-fold>                        
    //colores botones
    private void buttonMouseEntered(java.awt.event.MouseEvent evt, javax.swing.JButton boton) {                                             
        // TODO add your handling code here:
        if(boton.getText().length()!=0){
            boton.setBackground(new java.awt.Color(252,222,154));
        }else{
            boton.setBackground(new java.awt.Color(255,0,0));
        }
    }
    private void buttonMouseExited(java.awt.event.MouseEvent evt, javax.swing.JButton boton) {                                             
        // TODO add your handling code here:
        boton.setBackground(new java.awt.Color(128,95,29));
    }
    
    private void BHouse1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }                                       

    private void BOut1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       System.out.println("Cerrar Sesión");
       InterfazPrincipal ventanaDeRegistro=new InterfazPrincipal();
       this.setVisible(false);
       ventanaDeRegistro.setVisible(true);
    }                                     

    private void BSearch1ActionPerformed(java.awt.event.ActionEvent evt) { 
        SearchWindow ventana= new SearchWindow(empresa,empleado.darNombre());
        this.setVisible(false);
        ventana.setVisible(true);
    }                                        

    private void CBSetCActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            textSetC.setText(null);
            String image = getImage(CBSetC.getSelectedItem().toString());
            String ubication = "..\\Muu-Seguro\\src\\Interfaz\\DataImage\\" ; 
            ubication= ubication+image+".png" ;
            System.out.println(ubication);
            CowC.setIcon(new javax.swing.ImageIcon(ubication));
            String temp = CBSetC.getSelectedItem().toString();
            
            textSetC.setText(getProperties(temp));
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void CBSetBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            textSetB.setText(null);
            String image = getImage(CBSetB.getSelectedItem().toString());
            String ubication = "..\\Muu-Seguro\\src\\Interfaz\\DataImage\\" ; 
            ubication= ubication+image+".png" ;
            System.out.println(ubication);
            CowB.setIcon(new javax.swing.ImageIcon(ubication));
            String temp = CBSetB.getSelectedItem().toString();
            
            textSetB.setText(getProperties(temp));
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void CBSetAActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            textSetA.setText(null);
            String image = getImage(CBSetA.getSelectedItem().toString());
            String ubication = "..\\Muu-Seguro\\src\\Interfaz\\DataImage\\" ; 
            ubication= ubication+image+".png" ;
            System.out.println(ubication);
            CowA.setIcon(new javax.swing.ImageIcon(ubication));
            String temp = CBSetA.getSelectedItem().toString();
            
            textSetA.setText(getProperties(temp));
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void BProfile1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.out.println("Perfil Del trabajador");
        PerfilTrabajador ventana=new PerfilTrabajador(empresa,empleado.darNombre());
        this.setVisible(false);
        ventana.setVisible(true);
    }                                         
   
     private int[] valoresTamañoFinca(){
        String pathLot="..\\Muu-Seguro\\src\\dataBase\\"+empresa.darAdmin().darCorreo()+"Lotes.csv";
        String [] valores=new String[2];
        int []valoresTamaño=new int[2];
        String linea;
        try{
            BufferedReader br =new BufferedReader(new FileReader(pathLot));
            while((linea=br.readLine())!=null){//primera linea del archivo csv
                if(linea.split(",").length==2){
                    valores = linea.split(",");//arreglo de las columnascada linea del archivo csv de cada linea
                }else{
                    break;
                }
            }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ups! Algo salió mal, inténtelo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.toString());     
        }
        if(valores[0]!=null){
            for(int i=0;i<valores.length;i++){
                valoresTamaño[i]=Integer.parseInt(valores[i]);
            }
        }else{
            for(int i=0;i<valores.length;i++){
                valoresTamaño[i]=0;
            }
        }
        return valoresTamaño;
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BOut1;
    private javax.swing.JButton BProfile1;
    private javax.swing.JButton BSearch1;
    private javax.swing.JComboBox<String> CBSetA;
    private javax.swing.JComboBox<String> CBSetB;
    private javax.swing.JComboBox<String> CBSetC;
    private javax.swing.JLabel CowA;
    private javax.swing.JLabel CowB;
    private javax.swing.JLabel CowC;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelImage1;
    private javax.swing.JLabel jLabelImageNorth;
    private javax.swing.JLabel jLabelImageSouth;
    private javax.swing.JLabel jLabelImageWest;
    private javax.swing.JLabel jLabelImageEast;
    private javax.swing.JPanel fond;
    private javax.swing.JPanel contenedorMapa; 
    private javax.swing.JPanel mapa;  
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneMap;
    private javax.swing.JTextArea textSetA;
    private javax.swing.JTextArea textSetB;
    private javax.swing.JTextArea textSetC;
    // End of variables declaration                   
}
