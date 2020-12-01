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
public class Toro extends Animal {
    //PARAMETROS
    /*
    *Super:Animal
    */
    
    //CONTRUCTOR
    /*
    *Crea un toro
    */
    public Toro(String nNumeroSerie,String nNombre,String nRaza, String nacimiento, int nEdad,float nPeso,int nNumCrias,float nCantidadCarne){
        super( nNumeroSerie, nNombre,nRaza, nacimiento ,nEdad, nPeso, nNumCrias, nCantidadCarne);
    }
}