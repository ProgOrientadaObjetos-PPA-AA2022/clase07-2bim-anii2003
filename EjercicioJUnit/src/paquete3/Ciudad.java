/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {

    private String nombres;
    private int poblacion;

    public void establecerNombres(String n) {
        nombres = n;
    }

    public String obtenerNombre() {
        return nombres;
    }

    public void establecerPoblacion(int p) {
        poblacion = p;
    }

    public int obtenerPoblacion() {
        return poblacion;
    }

    public String toString() {
        String cadena = String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n",
                obtenerNombre(),
                obtenerPoblacion());
        return cadena;
    }
}
