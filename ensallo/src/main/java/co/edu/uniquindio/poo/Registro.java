package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Registro {
 // creo el Arraylist 
    ArrayList<Mueble> listMuebles;
 // instacio mueble
    Mueble mueble = new Mueble((float)2000, "Gjdnsd", (byte)23, Madera.ALMENDRO, Tipo.ALCOBA); 
// agrego un muebke a la Arraylist
    public void agragarMueble (Mueble muebles){
        listMuebles.add(muebles);
    }
    //  remuevo un mueble de la lista si esta, si no no pasa nada
    public void retiara(Mueble mueble) {
     listMuebles.remove(mueble); 
    }
 // consulto que este el elemento
   public Boolean consulta(Mueble mueble){
    boolean existe =listMuebles.contains(mueble);
    return existe;
   }
}
