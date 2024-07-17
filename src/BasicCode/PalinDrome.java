package BasicCode;

import java.util.Scanner;

public class PalinDrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number ");
        int num = sc.nextInt();
        int result = checkPalindrome(num);
        if(num == result){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }

    private static int checkPalindrome(int num) {
        int temp = 0;
        int reverse = 0;
        while (num > 0){
            temp = num % 10;
            reverse = reverse * 10 + temp;
            num = num / 10;
        }
        return reverse;
    }
}
