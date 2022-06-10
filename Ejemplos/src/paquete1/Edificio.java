
package paquete1;


public class Edificio {
    private String nombre;
    private double costo;
    
    public Edificio(String m){
        nombre = m;
    }
    
    public void establecerNombre(String m){
        nombre = m;
    }

    public void establecerCostos(double m){
        costo = m;
    }
    
    public String obtenerNombre(){
        return nombre;
    }    
   
    public double obtenerCosto(){
        return costo;
    }
    public String toString(){
    String cadena = String.format("Edificio de nombre: %s\n\t"
            + "El costo del edificio es: %.2f", nombre, costo);
    return cadena;
    }
}
