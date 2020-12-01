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
public class Vaca extends Animal{
    //PARAMETROS
    /*
    *Super: animal
    */
    private float cantidadLeche;

    //CONSTRUCTOR
    /*
    *Crea una vaca
    */
    public Vaca(String nNumeroSerie,String nNombre,String nRaza,String nacimiento, int nEdad,float nPeso,int nNumCrias,float nCantidadCarne, float nCantidadLeche){
        super( nNumeroSerie, nNombre,nRaza,nacimiento, nEdad, nPeso, nNumCrias, nCantidadCarne);
        cantidadLeche=nCantidadLeche;
    }
    public float darCantidadLeche(){
        return cantidadLeche;
    }
}

