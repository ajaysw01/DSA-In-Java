package III_ArrayPrograms;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 6,7,3,2,8,10};
        System.out.println(" Second smallest element is  : " +secondSmallest(arr));
    }

    private static int secondSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int secSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < secSmallest && arr[i] != smallest) {
                secSmallest = arr[i];
            }
        }
        return secSmallest;
    }
}
