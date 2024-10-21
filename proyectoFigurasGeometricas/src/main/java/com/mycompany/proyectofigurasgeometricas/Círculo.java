
package com.mycompany.proyectofigurasgeometricas;
/**
 * Complejidad temporal: O(1) Tiempo constante.
 */
import static java.lang.Math.PI;

public class Circulo extends FiguraGeometrica {
    
    //atributos
    private double radio;


    public Circulo(double radio, String nombre, String color) {
        //super recibe los datos de esta clase, llama a la clase madre y asigna los valores
        super(nombre, color);
        this.radio = radio;
    }

    //metodos
    //obtenerArea
    public double obtenerArea(){
        return PI*radio*radio;
    }
    
    //obtenerPerimetro
    public double obtenerPerimetro(){
        return  2*PI*radio;
    }
    
}
