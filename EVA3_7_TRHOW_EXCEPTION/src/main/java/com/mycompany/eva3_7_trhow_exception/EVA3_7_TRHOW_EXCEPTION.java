/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_7_trhow_exception;

import java.util.Scanner;

/**
 *
 * @author ProBook
 */
public class EVA3_7_TRHOW_EXCEPTION {

    public static void main(String[] args) throws Exception {
        int valor;
        try{
     
        }catch(Exception ex){
        System.out.println(ex.getMessage());
        Scanner input= new  Scanner(System.in);
        System.out.println("Introdue un valorpositivo");
        valor=input.nextInt();
           prueba obj=new prueba();
           obj.setValor(1);
    }catch(Exception ex){//es la super clase de todas las excepciones por tanto,captura todas las excepciones complica detectar el tipo de excepcion
            System.out.println(ex.getMessage());
    }
    }
}
class prueba{
    private int valor;

    public int getValor() {
        return valor;
    }
//checked exceptions:se deben resolver en tiemoin de compilacion
   //unchecked exceptions:errores de logica,delprogramador,java no te obliga a resolverlas
    public void setValor(int valor) throws Exception {
        if(valor <0)
            throw new Exception("El valor "+ valor+"es invalido. Debe de ser mayor o igual a 0.");
        else
        this.valor = valor;
    }
}