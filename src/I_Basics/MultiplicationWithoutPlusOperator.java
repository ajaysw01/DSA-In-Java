package I_Basics;

public class MultiplicationWithoutPlusOperator {
    public static void main(String[] args) {
            multiplication(15,100);
    }

    static void multiplication(int a, int b){

        int sum = 0;

        for (int i = 0; i < Math.min(a, b); i++) {
            sum = sum + Math.max(a,b);
        }
        System.out.println(sum);
    }

}
