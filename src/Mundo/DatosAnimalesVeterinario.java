/*
Esta clase sirve para crear, leer y modificar el csv de enfermedades.
Además permite crear un historial de las enfermedades que antes han existido en la empresa y en cada animal
*/
package Mundo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MateoF404
 */
public class DatosAnimalesVeterinario {
    // Data Members
    public String PATH = "..\\Muu-Seguro\\src\\dataBase\\enfermedadesAnimales" ; 
    public String PATHANIMALES = "..\\Muu-Seguro\\src\\dataBase\\";
    public String PATHTEMPORAL = "..\\Muu-Seguro\\src\\dataBase\\enfermedadesAnimales" ;
    public ArrayList<String> animales = new ArrayList<String>();
    public ArrayList<String> enfermedades = new ArrayList<String>();
    private Empresa emp;
    public int CantidadVacasEnfermas = 0; 
    public int CantidadVacasSanas = 0; 
    public int CantidadTorosSanos = 0; 
    public int CantidadTorosEnfermos = 0; 
    public int CantidadAnimalesSanos = 0; 
    public int CantidadAnimalesEnfermos = 0; 
    
    
    // Constructor
    public DatosAnimalesVeterinario(String codigoEmpresa) throws IOException{
        // Se revisa si para la empresa existe el archivo de enfermedadesAnimales
        // Dicho archivo tiene el nombre "enfermedadesAnimales"+usuarioAdmin 
        this.emp  = new Empresa(codigoEmpresa);
        this.PATH += emp.darAdmin().darCorreo() + ".csv";
        this.PATHTEMPORAL += emp.darAdmin().darCorreo() + "temp" +".csv";
        this.PATHANIMALES += emp.darAdmin().darCorreo() + "Animales.csv" ;
        
        File temp = new File(PATH);
        if(!temp.exists())
           createCSV();
        
        Lectura();
        
    }

    // Método para crear un csv de enfermedaes
    private void createCSV() throws IOException{
        // El csv solo se crea una vez
        FileWriter archivo = new FileWriter(PATH,true);
        
        // Se agregan los animales al csv a través del método update
        UpdateAnimales();
        archivo.close();
    }
    
    // Método para leer el csv y arrojar los nombres en un array 
    public void Lectura() throws IOException{
        System.out.println("Lectura del archivo enfermedades");
        UpdateAnimales();
        
        
        BufferedReader archivoEnfermedades = new BufferedReader(new FileReader(PATH));
        String line = "" ;
        System.out.println("MIRE !!!!");
        while ( (line = archivoEnfermedades.readLine()) != null  ){
            String [] values = line.split(",");
            String temp = values[1] + " - " + values[0];
            this.animales.add(temp);
            this.enfermedades.add(temp);            
            this.enfermedades.add(values[6]);
            
        }
        archivoEnfermedades.close();
        
        System.out.println("Acabó");
        
    }
    
    // Retornar el ArrayList de los animales y su # de registro
    public ArrayList<String> LecturaAnimales(){
        return animales;
    }
    
    // Retornar el # registro, nombre y nombre de la enfermedad
    public ArrayList<String> LecturaEnfermedades(){
        
        for(String a :enfermedades ){
            System.out.println("-->  "+a);
        }

        return enfermedades;
    }
    
    // Método update para refrescar el archivo csv con el nombre de nuevos animales
    private void UpdateAnimales() throws FileNotFoundException, IOException{
        
        
        // Se lee el archivo animales, y se mira si existe el animal en el csv de enfermedadesAnimales
        
        // Para ello primero se crea un ArrayList con el número de registro que exsiten 
        ArrayList<String> tempRegistros = new ArrayList<String>();
        // Lectura del archivo enfermedadesAnimales
        
        BufferedReader temp = new BufferedReader(new FileReader(PATH));
        
        String temporalString = "";
        while( (temporalString = temp.readLine()) != null ){
            String [] values = temporalString.split(",");
            tempRegistros.add(values[0]);
        }
        
        temp.close();
                
        System.out.println("Registros --> "+ tempRegistros);
        // Ya que se tiene el arrayList con el número de registro de cada animal, ahora solo falta comparar los no existentes en el archivo y colocarlos
        
        BufferedReader archivoEnfermedades = new BufferedReader(new FileReader(PATHANIMALES));
        
        String line = "" ;
        
        ArrayList<String> animalesFaltantes = new ArrayList<String>();
        System.out.println("Animaless");

        while ( (line = archivoEnfermedades.readLine()) != null  ){
            String [] values = line.split(",");
            // Se comprueba si el número de registro esta en el archivo de enfermedadesAnimales
            // Si el animal no esta se guarda en un ArrayList para luego añadirlo al final del archivo
            if(tempRegistros.contains(values[1]) == false){
                String temporal = values[1] + "," + values[2] + "," + "Lote"+ "," + values[0] + ","+ values[4] + "," + values[3] + "," + "Enfermedad no registra" + "," + "Medicamento no registra" ;
                animalesFaltantes.add(temporal);
            }
            
        }
        archivoEnfermedades.close();
        System.out.println("la lista --> " + animalesFaltantes);
        
        // Ahora que se tienen los animales faltantes, se procese a realizar el guardado de estos en 
        FileWriter archivoEscritura = new FileWriter(PATH,true);
        for (int i = 0 ; i < (animalesFaltantes.size());i++){
            archivoEscritura.write(animalesFaltantes.get(i));
            archivoEscritura.write("\n");
        }
        archivoEscritura.flush();
        archivoEscritura.close();
    
    }
    
    // Se agrega la enfermedad o enfermedad
    public void agregar(String seleccion, String texto, boolean band) throws IOException{
        // Si la bandera es true --> enfermedades 
        if (band == true){
            System.out.println("Agregar Enfermedad !");
            // Se agrega de la siguiente manera --> # registro, nombre, lote, sexo, edad raza, Enfermedades,Medicamentos
            
            int indice = seleccion.indexOf('-');
            String numeroRegistro = seleccion.substring(indice+2);
            System.out.println("seleccion --> " + numeroRegistro);

            String [] datosAnimalViejo = busquedaAnimal(numeroRegistro);
            System.out.println("Línea animal --> " + Arrays.toString(datosAnimalViejo));
            System.out.println("texto --> " +texto);
            // Se crea un array con los mismos valores excepto por la enfermedad
            String [] datosAnimalNuevo =  new String[8];

            for (int i = 0 ; i<=7;i++){
                if (i != 6)
                    datosAnimalNuevo[i] = datosAnimalViejo[i];
                else
                    datosAnimalNuevo[i] = texto;
            }
            

            // Para hacer esto se crea un nuevo archivo en donde se cambia la linea vieja por la nueva. Para ello se usa el método modificar
            modificar(datosAnimalViejo,datosAnimalNuevo,datosAnimalNuevo[0]);
        }else{
            System.out.println("Agregar medicamento !");
        }
        

    }
            
    // Se elimina o agrega una enfermedad - medicamento
    public void eliminar(String seleccion, String texto, boolean band) throws IOException {   
        // Se busca el número de registro y se cambian la enfermedad por "No registra Enfermedad" y la enfermedad se resgista en el historial Enfermedades
        if (band){
            System.out.println("Enfermedades");
            // Se agrega de la siguiente manera --> # registro, nombre, lote, sexo, edad raza, Enfermedades,Medicamentos
            int indice = seleccion.indexOf('-');
            String numeroRegistro = seleccion.substring(indice+2);
            
            String [] datosAnimalViejo = busquedaAnimal(numeroRegistro);
            String textoFinal = seleccion + ">"+ texto;
            System.out.println("Línea animal --> " + Arrays.toString(datosAnimalViejo));
            System.out.println("texto --> " +textoFinal);
            
            // Se crea un array con los mismos valores excepto por la enfermedad
            String [] datosAnimalNuevo =  new String[8];

            for (int i = 0 ; i<=7;i++){
                if (i != 6)
                    datosAnimalNuevo[i] = datosAnimalViejo[i];
                else
                    datosAnimalNuevo[i] = textoFinal;
            }
            

            // Para hacer esto se crea un nuevo archivo en donde se cambia la linea vieja por la nueva. Para ello se usa el método modificar
            modificar(datosAnimalViejo,datosAnimalNuevo,datosAnimalNuevo[0]);
        }else{
            System.out.println("Medicamentos");
        }
        
    }
    
    // Se busca el animal en el archivo y se retorna toda la linea de este 
    private String [] busquedaAnimal(String seleccion) throws FileNotFoundException, IOException{
        // Se busca el animal y se retornan los datos de este en un arrayList
        
        // Se realiza la busqueda a través del registro
        BufferedReader temp = new BufferedReader(new FileReader(PATH));
        String lines = "";
        while ( (lines = temp.readLine()) != null   ){
            String [] values = lines.split(",");
            if (seleccion.equals(values[0])){
                return values;
            }
            
        }
        temp.close();
        String [] datosAnimal = new String[7];
        return datosAnimal;
    }
             
    // Método para modificar una línea 
    public void modificar(String [] lineaAntigua, String[] lineaNueva,String NumeroRegistro) throws FileNotFoundException, IOException{
       // Este método sirve para modificar la línea seleccionada en el archivo enfermedadesAnimales
       
       // Para ello lo primero que se hace es leer el archivo y guardar las líneas en un ArrayList
       // Mientras se leen se cambia la linea seleccionada en el ArrayList
       // Se sobre escribe el archivo para asi guardar los nuevos valores 
        
        
       // Lectura del archivo y guardado en el ArrayList
       
       ArrayList<String> arrayLineas = new ArrayList<String>();
       
       BufferedReader br1 = new BufferedReader(new FileReader(PATH));
       String line = "";
       while ( (line = br1.readLine()) != null  ){
           String [] values = line.split(",");
           // Se encuentra el Numero de Registro y se guarda en el ArrayList la nueva Línea
           if (values[0].equals(NumeroRegistro))
               arrayLineas.add(Arrays.toString(lineaNueva));
        else
               arrayLineas.add(Arrays.toString(values));
       }
        
        br1.close();
       // Se sobre escribe el archivo 
       FileWriter escritura = new FileWriter(PATH,false);
       for (int i = 0 ; i < arrayLineas.size(); i++){
           escritura.write(pasarString(arrayLineas.get(i)));
           escritura.write("\n");
       }

       escritura.close();
    }
    
    public String pasarString(String linea){
        String [] value = linea.split(",");
        
        
        String temp = value[0].substring(1);
        for(int i =  1 ; i < value.length - 1;i++){
            temp += value[i] + " , ";
        }
        String temp2 = value[value.length-1];
        
        temp += temp2.substring(0,temp2.length()-1);
        return temp;
    }
    
    // Método para contar la cantidad de enfermos y sanos 
    private void ContarSalubridad() throws FileNotFoundException, IOException{
        // Animales enfermos, Animales Sanos --> Sumatoria de Vacas y Toros 
        // Vacas y Toros sanos --> Tienen la palabra Enfermedad no registra 
        // Vacas y Toros Enfermos --> No tienen la palabra Enfermedad no registra
        
        // Lectura del archivo enfermedadAnimales
        BufferedReader br1 = new BufferedReader(new FileReader(PATH));
        String line = "" ; 
        
        while ( (line = br1.readLine()) != null){
            String [] values = line.split(",");
            
            
            if ((values[5].toString()).equals("  Enfermedad no registra ") && values[2].equals("  Vaca "))
                this.CantidadVacasSanas ++;
            else if ((values[5].toString()) != ("  Enfermedad no registra ") && values[2].equals("  Vaca "))
                this.CantidadVacasEnfermas ++ ;
            else if ((values[5].toString()).equals("  Enfermedad no registra ") && values[2].equals("  Toro "))
                this.CantidadTorosSanos ++;
            else if ((values[5].toString() != "  Enfermedad no registra " )&& values[2].equals("  Toro "))
                this.CantidadTorosEnfermos ++ ;   

        }
        br1.close();
        this.CantidadAnimalesEnfermos = this.CantidadTorosEnfermos + this.CantidadVacasEnfermas ;
        this.CantidadAnimalesSanos = this.CantidadTorosSanos + this.CantidadVacasSanas ;
    }
    
    // Método para obtener la cantidad de cada tipo Enfermo - Sano 
    public int getQuantityAnimals(String escogido) {
        int valor = 0;
        this.CantidadVacasEnfermas = 0; 
        this.CantidadVacasSanas = 0; 
        this.CantidadTorosSanos = 0; 
        this.CantidadTorosEnfermos = 0; 
        this.CantidadAnimalesSanos = 0; 
        this.CantidadAnimalesEnfermos = 0; 
        try {
            ContarSalubridad();
           
            System.out.println("Entroo");
            if (escogido.equals("Animales Sanos"))
                return CantidadAnimalesSanos;
            else if (escogido.equals("Animales Enfermos"))
                return CantidadAnimalesEnfermos;
            else if (escogido.equals("Vaca Sana")){
                System.out.println("heree");
                return CantidadVacasSanas;
            }
            else if (escogido.equals("Vaca Enferma"))
                return CantidadVacasEnfermas;
            else if (escogido.equals("Toro Sano"))
                return CantidadTorosSanos;
            else if (escogido.equals("Toro Enfermo"))
                return CantidadTorosEnfermos;
            else
                return valor ;
        } catch (IOException ex) {
            Logger.getLogger(DatosAnimalesVeterinario.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return valor ;
        
    } 
    
    public String getSexo(String seleccion) throws IOException, FileNotFoundException{
        int indice = seleccion.indexOf('-');
        String texto = seleccion.substring(indice+2);
        
        System.out.println("texto -->" +  texto);
        // Se lee el archivo de animales y se busca el número de registro de la vaca
        BufferedReader br1 = new BufferedReader(new FileReader(PATH));
        String line = ""; 
        while ( (line = br1.readLine()) != null ){
            String [] values = line.split(",");
            System.out.println("-->" + Arrays.toString(values));
            if (values[0].equals(texto))
                // Se retorna el sexo 
                return values[3];
        } 
        
        
        return "";
    }
}