package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array length");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i =0; i<length; i++ ){
            arr[i] = sc.nextInt();
        }

        int search = sc.nextInt();
        searchElement(search,arr);
    }

    private static void searchElement(int search, int[] arr) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == search){
                System.out.println("find element " + search + " at" + i);
            }
        }
    }
}
