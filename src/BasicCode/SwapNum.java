package BasicCode;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers for Swapping ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Numbers before swapping " + n1 + " " + n2);
        int temp = 0;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("Numbers After Swapping " +  n1 + " " + n2);



    }
}
