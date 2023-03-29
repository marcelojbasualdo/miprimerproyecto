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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Los profesores del curso de programación de Egg necesitan llevar 
un registro de las notas adquiridas por sus 10 alumnos para luego obtener una 
cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno 
obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
        Al final del programa los profesores necesitan obtener por pantalla la 
        cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban 
        los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 TODO code application logic here*/
        
        Scanner leer = new Scanner(System.in);
        String[] alumnos = new String[11]; 
        System.out.println("ingrese elnombre de los 10 alumnos");
         alumnos[0]= "alumnos/notas";
         alumnos[1]= leer.nextLine();
         alumnos[2]= leer.nextLine();
         alumnos[3]= leer.nextLine();
         alumnos[4]= leer.nextLine();
         alumnos[5]= leer.nextLine();
         alumnos[6]= leer.nextLine();
         alumnos[7]= leer.nextLine();
         alumnos[8]= leer.nextLine();
         alumnos[9]= leer.nextLine(); 
         alumnos[10]= leer.nextLine();
                 for (int i=0;i<alumnos.length;i++){
                   
        //System.out.print("(" + alumnos[i]+ " )");
        //System.out.println("");
    }
                 System.out.println("");
   double [][] notas = new double[11][5];
   notas[0][0]=0.10;
   notas [0][1]=0.15;
    notas [0][2]=0.25;
    notas [0][3]=0.50;
    notas [0][4]= 0;
     
    for (int i = 0; i < notas.length; i++) {
        System.out.print("(" + alumnos[i]+ " )");  
            for (int j = 0; j < 5; j++) {
                
            
            System.out.print("( "+ notas[i][j]+" )");
        }
        System.out.println("");
           }System.out.println("==============================");
        for (int i = 1; i < notas.length; i++) {
            for (int j = 0; j < 4; j++) {
                         
            notas[i][j]= (int)(Math.random()*10+1);
            }
            }
             for (int i = 1; i < notas.length; i++) {
                 System.out.print("(" + alumnos[i]+ " )");
            for (int j = 0; j < 5; j++) {
                System.out.print("( "+ notas[i][j]+" )");
            }
                 System.out.println("");
    }
             for (int i=1 ;i <11; i++){
                 for (int j = 1; j < 4; j++) {
                    // notas[1][4]=(int) ((notas[1][j]*0.1)+(notas[1][1]*0.15)+(notas[1][2]*0.25)+(notas[1][3]*0.5));
                  notas[i][4]+= notas[i][j]*notas[0][j];   
                 }
                  System.out.println("");
             }System.out.println("==============================");
              for (int i=1 ;i <notas.length; i++){
                  System.out.print("(" + alumnos[i]+ " )");
              
                 for (int j = 0; j < 5; j++) {
                 System.out.print("( "+ notas[i][j]+" )");
                 }
                 System.out.println("");
}
    }
}