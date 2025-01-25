import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        isPalindrome(A);
        sc.close();
    }
    
    public static void isPalindrome(String text) {
        String palindrome = new StringBuilder(text).reverse().toString();
        if(palindrome.equals(text)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}