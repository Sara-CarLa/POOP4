/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que muestra las coordenadas de un punto
 * @author Sara Alejandra Cardenas
 */
public class Punto {
    int x,y;

    /**
     * Constructor vacio
     */
    public Punto() {
    }
    
    /**
     * Constructor lleno de Punto
     * @param x coordenada x de un punto en dato primitivo int 
     * @param y coordenada y de un punto en dato primitivo int
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    /**
     * Metodo que sirve para mostrar los valores en x y y
     */ 
    public void imprimirPunto(){
       System.out.println("x="+x+" ,y="+y);
    }

    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
}
