public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {76,90,54,89,32};
        int smallest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]< smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
