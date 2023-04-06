
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arquitectura
 */
public class orden {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa primer numero:");
        float numero1 = input.nextFloat();
        float temporal_1;
                
        System.out.println("Ingresa segundo numero:");
        float numero2 = input.nextFloat();
        float temporal_2;
        
        System.out.println("Ingresa tercer numero:");
        float numero3 = input.nextFloat();
        float temporal_3;
            
        if (numero1 > numero2){
            temporal_1 = numero1;
            numero1 = numero2;
            numero2 = temporal_1;
        }     
        if(numero1 > numero3){
            temporal_1 = numero1;
            numero1 = numero3;
            numero3 = temporal_1;
        }
        if(numero2 > numero3){
            temporal_2 = numero2;
            numero2 = numero3;
            numero3 = temporal_2;
        }
        
        System.out.println(numero1 + ", " + numero2 + ", " + numero3);
    }
}
