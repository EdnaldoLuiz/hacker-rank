import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String IGNORE_PATTERN = "(\r\n|[\n\r\u2028\u2029\u0085])?";

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip(IGNORE_PATTERN);
        
        boolean isOdd = N % 2 != 0;
        boolean isEvenAndInRange6To20 = N >= 6 && N <= 20;
        boolean isEvenAndInRange2To5 = N >= 2 && N <= 5;
        boolean isEvenAndGreaterThan20 = N > 20;

        if (isOdd || isEvenAndInRange6To20) {
            System.out.println("Weird");
        } else if (isEvenAndInRange2To5 || isEvenAndGreaterThan20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}