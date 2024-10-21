/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectofigurasgeometricas;

import java.util.Scanner;

/**
 * Complejidad temporal: O(1) Tiempo constante.
 */
public class ProyectoFigurasGeometricas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura");
        String figura = scan.next();

        System.out.println("Ingrese el color de la figura");
        String color = scan.next();

        System.out.println("Ingrese el tipo de figura");
        System.out.println("1: Circulo, 2: Rectángulo, 3:Triángulo");
        int tipoFigura = scan.nextInt();
        switch (tipoFigura) {

            case 1:

                System.out.println("Ingrese el radio del circulo");
                double radio = scan.nextDouble();

                Círculo circulo = new Círculo(radio, figura, color);
                System.out.println("El área del circulo es: " + circulo.obtenerArea());
                System.out.println("El perímetro del circulo es: " + circulo.obtenerPerimetro());
                break;

            case 2:

                System.out.println("Ingrese el valor del lado 1 del rectángulo");
                int lado1 = scan.nextInt();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                int lado2 = scan.nextInt();

                Rectángulo rectangulo = new Rectángulo (figura, color, lado1, lado2);
                System.out.println("El area del rectángulo es: " + rectangulo.obtenerArea());
                System.out.println("El perímetro del rectángulo es: " + rectangulo.obtenerPerimetro());
                break;

            case 3:

                System.out.println("Ingrese el valor de la base de triángulo");
                int base = scan.nextInt();
                System.out.println("Ingrese el valor de la altura del triángulo");
                int altura = scan.nextInt();
                
                Triángulo triangulo = new Triángulo(base,altura, figura, color);
                System.out.println("El area del triángulo es: " + triangulo.obtenerArea());
                System.out.println("El perimetro del triángulo es: " + triangulo.obtenerPerimetro());
                break;
        }

    }
}
