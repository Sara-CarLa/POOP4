/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que guarda los datos de un perro
 * @author Sara Alejandra Cárdenas
 */
public class Perro {
    String nombre,raza,color;
    int edad;

    /**
     * Constructor vacio
     */
    public Perro() {
    }

    /**
     * Constructor lleno de perro
     * @param nombre nombre del perro en String
     * @param raza raza del perro en String
     * @param color color del perro en String
     * @param edad edad que tiene el perro en dato primitivo int
     */
    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    
    /**
     * Metodo que sirve para indicar que el perro esta sentado
     */
    public void sentado(){
        System.out.println("Estoy sentado");
    }
    
    /**
     * Metodo que sirve para contar cuantas veces ladra el perro
     * @param veces 
     */
    public void ladra(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("Guau");
            
        }
    }
    
    /**
     * Metodo que sirve para saber la distancia recorrida de un perro corriendo
     * @param distancia 
     */
    public void corre(int distancia){
        System.out.println("Corri"+distancia+"metros");
    }
    
    /**
     * Metodo que sirve para saber cuantas horas duerme el perro
     * @param horas 
     */
    public void duerme(int horas){
        System.out.println("Dormí"+horas+"horas");
    }

    
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    //Convierte el objeto coche a una cadena igual que .toString
    }
    
    
}
