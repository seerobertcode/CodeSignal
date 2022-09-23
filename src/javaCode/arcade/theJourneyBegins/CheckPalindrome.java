package javaCode.arcade.theJourneyBegins;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("abcd"));
    }

    public static boolean checkPalindrome(String inputString) {
        String reversedString = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.substring(i, i + 1);
        }
        return inputString.equals(reversedString);
    }
}
