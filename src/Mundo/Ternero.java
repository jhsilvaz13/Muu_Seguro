package Mundo;

/**
 *
 * @author John Silva
 */
public class Ternero extends Toro{
    //PARAMETROS
    /*
    *Super:Animal
    */
    
    //CONTRUCTOR
    /*
    *Crea un ternero
    */
    public Ternero(String nNumeroSerie,String nNombre,String nRaza, String nacimiento, int nEdad,float nPeso){
        super( nNumeroSerie, nNombre,nRaza,nacimiento,nEdad, nPeso, 0, 0);
    }
    
}
