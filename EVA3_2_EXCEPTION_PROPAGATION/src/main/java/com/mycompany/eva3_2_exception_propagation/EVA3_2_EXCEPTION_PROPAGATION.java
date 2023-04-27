/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_2_exception_propagation;

/**
 *
 * @author ProBook
 */
public class EVA3_2_EXCEPTION_PROPAGATION {

    public static void main(String[] args) {
        System.out.println("INICIA MAIN!");
        A();
        System.out.println("TERMINA MAIN");
    }
    public static void A(){
        System.out.println("inicia a");
        b();
        System.out.println("termina a");
    }
    public static void b(){
        System.out.println("inicia b");
        c();
        System.out.println("termina b");
    }
    public static void c(){
        System.out.println("inicia c");
        int x=5, y=0;
        int resu=x/y;
        System.out.println("termina c");
    }
}
