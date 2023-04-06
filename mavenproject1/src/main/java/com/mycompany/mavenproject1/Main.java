/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
        
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa primer numero:");
        float primer_numero = input.nextFloat();
        
        System.out.println("Ingresa segundo numero:");
        float segundo_numero = input.nextFloat();
        
        System.out.println("Ingresa operacion numero (suma, resta, multiplicacion, division):");
        String operacion = input.next();
        
        if (operacion.equalsIgnoreCase("suma")){
            float sum = primer_numero + segundo_numero;
            System.out.println("La suma es:" + sum);
        }
            else if(operacion.equalsIgnoreCase("resta")){
                    float res = primer_numero - segundo_numero;
                    System.out.println("La resta es:" + res);
                    }
            
            else if(operacion.equalsIgnoreCase("multiplicacion")){
                    float mul = primer_numero * segundo_numero;
                    System.out.println("La multiplicacion es:" + mul);
                    }
            
            else if(operacion.equalsIgnoreCase("division")){
                    if(segundo_numero == 0){
                        System.out.println("ERROR: Division por cero");
                    }
                    
                    else{
                    float div = primer_numero / segundo_numero;
                    System.out.println("La division es:" + div);
                    }
            }
          
    }
}

