package co.edu.uniquindio.poo;


/** este es un programa de un mueble
 * @author Daniel Jurado
 *2023- 09-13
 *Lisencia aNU GPl V3
 */ 
public class Mueble {
    private float costo;
    private String codigo;
    private byte existencia;
    public Madera madera;
    public Tipo tipo;
    
    public Mueble(float costo, String codigo, byte existencia, Madera madera, Tipo tipo) {
        this.costo = costo;
        this.codigo = codigo;
        this.existencia = existencia;
        this.madera = madera;
        this.tipo = tipo;
    }
    public float getCosto() {
        return costo;
    }
    public String getCodigo() {
        return codigo;
    }
    public byte getExistencia() {
        return existencia;
    }
    public Madera getMadera() {
        return madera;
    }
    public Tipo getTipo() {
        return tipo;
    }
    

   
}
