package BasicCode;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        System.out.println("enter m value");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        //initializing 2D-array

        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //printing the value

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
