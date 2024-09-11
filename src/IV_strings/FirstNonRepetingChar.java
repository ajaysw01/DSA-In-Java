package IV_strings;

public class FirstNonRepetingChar {
    public static void main(String[] args) {
        String s = "assjjjjssseee";
        System.out.println("First non-repeating character is: " + findFirstNonRepeatingChar(s));
    }

    private static String findFirstNonRepeatingChar(String s) {
        boolean isRepeating = false;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(i != j && s.charAt(i) == s.charAt(j)){
                    isRepeating  = true;
                    break;
                }
            }
        }

    }
}
