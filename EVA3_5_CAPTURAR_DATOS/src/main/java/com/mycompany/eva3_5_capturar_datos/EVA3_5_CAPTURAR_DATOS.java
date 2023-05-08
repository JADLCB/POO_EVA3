/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ProBook
 */
public class EVA3_5_CAPTURAR_DATOS {

    public static void main(String[] args) {
       int valor;
       do{
           try{
       Scanner input= new  Scanner(System.in);
        System.out.println("Introduce el valor de x(numero entero):");
        valor=input.nextInt();
               System.out.println("por fin funciono :c");
        break;
           }catch(InputMismatchException e){
               System.out.println("el valor es erroneo, no se puede convertir a numero");
               
           }
       }while(true);    
        System.out.println("El valor capturado es:"+valor);
        
    }
}
