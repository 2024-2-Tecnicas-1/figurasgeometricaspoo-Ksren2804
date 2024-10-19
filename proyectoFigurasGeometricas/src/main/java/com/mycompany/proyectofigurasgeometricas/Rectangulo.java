
package com.mycompany.proyectofigurasgeometricas;
/**
 * Complejidad temporal: O(1) Tiempo constante.
 */
public class Rectangulo extends FiguraGeometrica{
   
   //atributos
    private int lado1;
    private int lado2;

    public Rectangulo(String nombre, String color, int lado1, int lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

  
    public double obtenerPerimetro() {
        return (lado1+lado1+lado2+lado2);
    }

    public double obtenerArea() {
        return lado1*lado2; 
    }
}
