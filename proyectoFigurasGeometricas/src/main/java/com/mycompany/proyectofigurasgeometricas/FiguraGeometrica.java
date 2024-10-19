
package com.mycompany.proyectofigurasgeometricas;

public class FiguraGeometrica {

    //atributos
    private String nombre;
    private String color;

    //Constructor
   public FiguraGeometrica(String nombre,String color){
    this.nombre = nombre;
    this.color = color;
   }
   
    //Get acceder al atributo
        public String getNombre() {
        return nombre;
    }
        
    //Setter cambiar el valor del atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
   
    //Metodos
    
        //obtenerArea
    public double obtenerArea(){
        return 0;
    }
            //obtenerPerimetro
    public double obtenerPerimetro(){
        return 0;
    }

}
