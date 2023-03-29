/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extra;

import java.util.Scanner;

/**
 *
 * @author basualdo
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        /*Realizar un programa que llene una matriz de tamaño NxM con valores 
aleatorios y muestre la suma de sus elementos.*/
Scanner leer =new Scanner(System.in);
int[][]matriz=new int[5][7];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=(int)(Math.random()*10+1);
                
            }
        }
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                suma+=matriz[i][j];
            }
            
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("( "+ matriz[i][j]+ " )");
            }
             System.out.println("");            
        }
       System.out.println("la suma de los elementos es, "+ suma);
    
    }
}
