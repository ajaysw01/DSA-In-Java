package III_ArrayPrograms;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12,2, 5, 6,7,8,10};
        System.out.println("Second Largest element is : " +secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        //second largest
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

}
