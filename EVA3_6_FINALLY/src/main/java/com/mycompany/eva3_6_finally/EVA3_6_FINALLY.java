/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_6_finally;

/**
 *
 * @author ProBook
 */
public class EVA3_6_FINALLY {

    public static void main(String[] args) {
        int x=5,y=1;
        try{
            int resu=x/y;
            
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("SIEMPRE  ME EJECUTO");
        }
            System.out.println("Fin del  programa");
    }
}
