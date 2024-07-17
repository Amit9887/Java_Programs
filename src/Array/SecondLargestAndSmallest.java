package Array;

import java.util.Scanner;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the ");
        int length = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int s_largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int s_smallest = Integer.MAX_VALUE;
        int[] arr = new int[length];
        System.out.println("Initialize your array with value");
        for (int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Second largest element is " + findSecondLargest(largest, s_largest, arr));
        System.out.println("Second smallest element is " + findSecondSmallest(smallest, s_smallest, arr));
    }

    private static int findSecondSmallest(int smallest, int sSmallest, int[] arr) {
        for (int i = 0; i<arr.length; i++){
            if (arr[i] < smallest ){
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < sSmallest && arr[i] != smallest) {
                sSmallest = arr[i];
            }
        }
        return  sSmallest;
    }

    private static int findSecondLargest(int largest, int sLargest, int[] arr) {
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > largest ){
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }
        }
        return  sLargest;
    }
}
