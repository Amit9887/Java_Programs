import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int[] firstArr = {10,20,30,50,69};
        int[] secArr = new int[firstArr.length];
        for(int i =0; i<firstArr.length;i++){
            secArr[i] = firstArr[i];
            System.out.println(secArr[i]);
        }
    }
}
