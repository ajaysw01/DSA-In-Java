package III_ArrayPrograms;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {12,2, 5, 6,7,8,10};
        System.out.println("Largest element is : " +largestElement(arr));
        System.out.println("Smallest element is : " +smallestElement(arr));
    }

    private static int smallestElement(int[] arr) {
        int smallest =  arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] >smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    private static int largestElement(int[] arr) {
        int largest = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]< largest){
                largest = arr[i];
            }
        }
        return largest;
    }

}
