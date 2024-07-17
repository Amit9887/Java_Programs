import java.util.Scanner;

public class SmalletNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans = smallestNumber(n);
        System.out.println(ans);
    }

    private static String smallestNumber(int n) {
        String result = "";
        for(int div = 9; div>=2; div--){
            while (n % div == 0){
                n = n/ div;
                result = div + result;
            }
        }
        if(n!=1){
            return "-1";
        }
        else{
            return result;
        }
    }
}
