/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ProBook
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
        int x,y;
        try{
        Scanner input= new  Scanner(System.in);
        System.out.println("Introduce el valor de x(numero entero):");
        x=input.nextInt();
        System.out.println("Introduce el valor de y (numero entero)");
        y=input.nextInt();
        int resu=x/y;
        
        System.out.println("Resultadpn de"+x+"/"+y+":"+resu);
     
        }catch(InputMismatchException e){
                    System.out.println("captura en formato incorrecto, no se puede convrtir a un numero");

    }catch(ArithmeticException e){
            System.out.println("no se puede dividir entre cero ");
            
    }
        System.out.println("programa terminado exitosamente");
        
    }
}
