package BasicCode;

import java.util.Scanner;

public class RoundNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the double number ");
        double n = sc.nextDouble();

        System.out.println(Math.round(n));
        System.out.println(Math.floor(n));
        System.out.println(Math.ceil(n));
    }
}
