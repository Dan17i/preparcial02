package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Registro {

    ArrayList<Mueble> listMuebles;

    Mueble mueble = new Mueble((float)2000, "Gjdnsd", (byte)23, Madera.ALMENDRO, Tipo.ALCOBA); 

    
    public void agragarMueble (Mueble muebles){
        listMuebles.add(muebles);
    }
    


    public void retiara(Mueble mueble) {
     listMuebles.remove(mueble); 
    }

   public Boolean consulta(Mueble mueble){
    boolean existe =listMuebles.contains(mueble);
    return existe;
   }
}
