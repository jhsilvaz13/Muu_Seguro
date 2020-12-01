/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

/**
 *
 * @author John Silva
 */
public class Ternera extends Vaca {
     //PARAMETROS
    /*
    *Super:Animal
    */
    
    //CONTRUCTOR
    /*
    *Crea un ternero
    */
    public Ternera(String nNumeroSerie,String nNombre,String nRaza,String nacimiento, int nEdad,float nPeso){
        super(nNumeroSerie, nNombre,nRaza,nacimiento,nEdad, nPeso, 0, 0,0);
    }
}
