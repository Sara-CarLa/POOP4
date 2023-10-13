/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que muestra datos de un triangulo rectangulo
 * @author Alejandra
 */
public class Triangulo {
    int medidaLado1,medidaLado2,medidaLado3;
    float angulo1,angulo2;

    /**
     * Constructor vacio
     */
    public Triangulo() {
    }
    
    /**
     * Constructor lleno de Triangulo
     * @param medidaLado1 medida del primer lado del triangulo en tipo de dato int
     * @param medidaLado2 medida del segundo lado del triangulo en tipo de dato int
     * @param medidaLado3 medida del tercer lado del triangulo en tipo de dato int
     * @param angulo1 medida del primer angulo del triangulo en tipo de dato float
     * @param angulo2 medida del segundo angulo del triangulo en tipo de dato float
     */
    public Triangulo(int medidaLado1, int medidaLado2, int medidaLado3, 
            float angulo1, float angulo2) {
        this.medidaLado1 = medidaLado1;
        this.medidaLado2 = medidaLado2;
        this.medidaLado3 = medidaLado3;
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
    }
    
    /**
     * Metodo que muestra la suma de los tres lados del triangulo
     * @param medidaLado1
     * @param medidaLado2
     * @param medidaLado3 
     */
    public void perimetro(int medidaLado1, int medidaLado2,int medidaLado3){
       System.out.println("El perímetro del triangulo rectangulo es:"
               + medidaLado1+ "m "+ medidaLado2+ "m " + medidaLado3 + "m");      
        
    }
    
    /**
     * Metodo que muestra los lados internos de un triangulo junto con su lado recto
     * @param angulo1
     * @param angulo2 
     */
    public void angulos(float angulo1, float angulo2){
        System.out.println("Los angulos internos en grados del triangulo son:"
                + angulo1+" ,"+ angulo2+" y 90");
    }

    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "TrianguloRectangulo{" + "medidaLado1=" + medidaLado1 +
                ", medidaLado2=" + medidaLado2 + ", medidaLado3=" + medidaLado3 
                + ", angulo1=" + angulo1 + ", angulo2=" + angulo2 + '}';
    }
    
}
