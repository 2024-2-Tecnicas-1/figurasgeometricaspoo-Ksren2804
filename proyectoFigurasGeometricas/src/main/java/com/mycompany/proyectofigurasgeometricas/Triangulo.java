
package com.mycompany.proyectofigurasgeometricas;
/**
 * Complejidad temporal: O(1) Tiempo constante.
 */
public class Triangulo extends FiguraGeometrica{
    
    //atributos
    int base;
    int altura;
    
    //constructor

    public Triangulo(int base, int altura, String nombre, String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    //metodos

    public double obtenerPerimetro() {
        int hipotenusa= (int) Math.sqrt(Math.pow(altura,2)+Math.pow(base,2));
        return altura+base+hipotenusa;
    }

    public double obtenerArea() {
        return (altura*base)/2;
    }
    
    
}
