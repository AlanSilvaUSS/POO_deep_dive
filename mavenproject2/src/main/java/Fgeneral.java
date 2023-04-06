import java.util.Scanner;

public class Fgeneral {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa a:");
        float a = input.nextFloat();
        
        System.out.println("Ingresa b:");
        float b = input.nextFloat();
        
        System.out.println("Ingresa b:");
        float c = input.nextFloat();
        
        float discriminante = b*b - 4*a*c;
      
        if (discriminante > 0){
            float raiz1 = (float) ((-b + Math.sqrt(discriminante)) / (2*a));
            float raiz2 = (float) ((-b - Math.sqrt(discriminante)) / (2*a));
            System.out.println("tus soluciones son: " + raiz1 + ", " + raiz2); 
        }
        else if(discriminante == 0){
            float raiz = -b / (2*a);
            System.out.println("tu solucion es: " + raiz);
        }
        else{
            System.out.println("no hay soluciones reales");
        }
    }
}
