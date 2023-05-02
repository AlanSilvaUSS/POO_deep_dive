import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList <>();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese tamaño de lista:\n");
        int listsize = input.nextInt();
        
        System.out.println("Ingrese 10 números:\n");
        for(int i = 0; i < listsize; i++){
            int j = input.nextInt();
            nums.add(j);
        }
 
        for (int j= nums.size()-1; j>0; j--){
            if(nums.get(j) % 2 == 0){
                nums.remove(j);
            }
    }
        System.out.println("Lista sin numeros pare:\n");
        for (int e : nums) {
            System.out.println(e);
        }
    }
}
