/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author Sara Alejandra Cardenas
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------------------");
        Punto punto = new Punto(); //new Punto es un objeto
        punto.imprimirPunto();
        Punto punto2=new Punto(3,5);
        punto2.imprimirPunto();
        System.out.println(punto);//se obtiene una clase punto junto con la referencia
        System.out.println("----------------------------------------------------------------------------------------------");
        Perro perro=new Perro("max","chihuahua","negor",2);
        System.out.println(perro);
        Coche coche= new Coche("Mazda","rojo","2019","automatico","diesel");
        coche.girar("derecha");
        System.out.println(coche);
        System.out.println(coche.toString());//es lo mismo
        
        System.out.println("----------------------------------------------------------------------------------------------");
        Triangulo triangulo=new Triangulo(3,4,5,39,51);
        System.out.println(triangulo);
        System.out.println("----------------------------------------------------------------------------------------------");
        
    }
    //Hacer los demás diagramas de profesor, alumno y triángulo junto con los diagramas
}
