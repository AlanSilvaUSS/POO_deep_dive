
public class Main {
    public static void main(String args[]){
    int[][] matriz = {{5, 4, 3, 7}, {1, 2, 6, 9}, {9, 8, 7, 2}, {4, 8, 2, 1}};
    
    int min = 999999;
    int max = -999999;

    for (int i = 0; i < matriz.length; i++ ) {
        for (int j = 0; j < matriz[i].length; j++ ) {
            
            if(matriz[i][j] > max){
                max = matriz[i][j];
            }
            if(matriz[i][j] < min){
                min = matriz[i][j];
            }
        }
    }
    
    System.out.println(min);
    System.out.println(max);
    }
}
