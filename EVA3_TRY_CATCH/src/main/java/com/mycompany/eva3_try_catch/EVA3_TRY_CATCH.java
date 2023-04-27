/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_try_catch;

/**
 *
 * @author ProBook
 */
public class EVA3_TRY_CATCH {

    public static void main(String[] args) {
        int x=5,y=1;
        try{
           //seccion de codigo que potencialmente genera una excepcion
        int resu=x/y;
        System.out.println("resultado ="+resu);
        }catch(ArithmeticException e){
            //se genera un objeto excepcion llamado e de ArtipórithmeticException /e
            System.out.println("se producjo un error:"+e.getMessage());
           
            
        }
        System.out.println("programa terminado");
        
    }
}
