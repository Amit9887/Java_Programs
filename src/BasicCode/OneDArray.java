package BasicCode;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n  = sc.nextInt();

        int arr[] = new int[n];

        int i = 0;
        while (i<n){
            arr[i] = sc.nextInt();
            i++;
        }

        for(i=0; i<n; i++){
            System.out.println(arr[i]);
        }
     }
}
