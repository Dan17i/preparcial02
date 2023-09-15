/**
 * Clase para probar el funcionamiento del código
 * @author Daniel jurado
 * @since 2023-09-12
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class MueblesTest {
    private static final Logger LOG = Logger.getLogger(MueblesTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test ");
        
        // instancio el mueble 
        Mueble mueble= new Mueble((float) 32000, "AFH-385", (byte)10,Madera.ALMENDRO,Tipo.ALCOBA);
        
        // realizo las asserciones 
        assertEquals((float)32000, mueble.getCosto());
        assertEquals( "AFH-385",mueble.getCodigo());
        assertEquals( (byte)10, mueble.getExistencia());
        assertEquals(Madera.ALMENDRO,mueble.madera);
        assertEquals(Tipo.ALCOBA, mueble.tipo);

        // creo el Arraylist
        ArrayList<Mueble> listMuebles=new ArrayList<>();

        // adiciono el mueble ya que ya comprove los datos
        listMuebles.add(mueble);

        LOG.info("Finalizando test ");
    }
}
