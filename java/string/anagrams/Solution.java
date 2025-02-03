import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        char[] charArrayA = a.toLowerCase().toCharArray();
        char[] charArrayB = b.toLowerCase().toCharArray();
        
        java.util.Arrays.sort(charArrayA);
        java.util.Arrays.sort(charArrayB);
        
        return java.util.Arrays.equals(charArrayA, charArrayB);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}