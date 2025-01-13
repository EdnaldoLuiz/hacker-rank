import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        int sum = A.length() + B.length();
        System.out.println(sum);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(firstLetterUppercase(A) + " " + firstLetterUppercase(B));
    }
    
    public static String firstLetterUppercase(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}