
public class Main {
    public static void main(String args[]){
    int[][] matriz = {{5, 4, 3}, {1, 2, 6}, {9, 8, 7}};
    
    for (int i = 0; i < matriz.length; i++ ) {
        for (int j = 0; j < matriz[i].length; j++ ) {
            int sum = (matriz[0][0]+matriz[1][1]+matriz[2][2]);
            System.out.println(sum);
        }
    }
    }
}
