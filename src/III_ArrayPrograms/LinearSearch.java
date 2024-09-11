package III_ArrayPrograms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6,7,8,10};
        int key = 7;
        System.out.println(" element is found at : " +linearSearch(arr, key));
    }

    private static int linearSearch(int[] arr, int key) {
        for(int i =0; i< arr.length ; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

}
