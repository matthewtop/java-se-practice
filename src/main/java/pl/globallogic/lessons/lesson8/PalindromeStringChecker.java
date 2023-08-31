package pl.globallogic.lessons.lesson8;


public class PalindromeStringChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("dsahf"));
        System.out.println(isPalindrome("abddba"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome("aba"));
    }
    private  static boolean isPalindrome(String target) {
        int i = 0;
        int j = target.length() - 1;
        boolean result = false;
        while(i < j) {
            result = target.charAt(i) == target.charAt(j);
            i++;
            j--;
        }
        return result;
    }
}

