/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que muestra los datos de un coche
 * @author Sara Alejandra Cardenas
 */
public class Coche {
    String marca,modelo,color,motor,combustible;

    /**
     * Constructor vacio
     */
    public Coche() {
    }

    /**
     * Constructor lleno de Coche
     * @param marca marca del coche en String
     * @param modelo modelo del coche en String
     * @param color color del coche en String
     * @param motor motor que ocupa el coche en String
     * @param combustible combustible que ocupa el coche en String
     */
    public Coche(String marca, String modelo, String color, String motor, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.combustible = combustible;
    }
    
    /**
     * Metodo que nos indica que el coche esta avanzando
     */
    public void avanzar(){
        System.out.println("El coche avanzó");
    }
     
    /**
     * Metodo que nos indica cuando el coche retrocede
     */
    public void retrocede(){
        System.out.println("El coche retrocedió");
    
    }
    
    /**
     * Metodo que nos dice si esta prendido el coche
     */
    public void prender(){
        System.out.println("Prendido");
    }
    
    /**
     * Metodo que nos indica si esta apagado el coche
     */
    public void apagar(){
        System.out.println("Apagado");
    }
    
    /**
     * Metodo que nos dice si gira a la izquierda o derecha
     * @param lado al que va a girar el coche
     */
    public void girar(String lado){
        System.out.println("El coche gira a la"+lado);
    }

    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", combustible=" + combustible + '}';
    //
    }
    
    
}
