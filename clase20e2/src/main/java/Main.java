import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        
        int index = 0;
        while (index != 5){
            System.out.println("Ingrese un número: ");
            nums[index]= input.nextInt();
            
            boolean encontrado = false;
            for(int j = 0; j < index; j++){
                if(nums[j] == nums[index]){
                    encontrado = true;
                }
            }
            if (!encontrado){
                index += 1;
            }
            else{
                System.out.println("El numero ya existe");
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
