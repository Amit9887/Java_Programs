public class LargestElement {
    public static void main(String[] args) {
        int [] arr = {20,50,48,90,45,60};
        int largest = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}

