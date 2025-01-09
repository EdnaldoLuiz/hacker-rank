import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        int multiples = 10;
        String lineSeparator = "\n";
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i <= multiples; i++) {
            System.out.printf("%s x %s = %s", N, i, N * i + lineSeparator);
        }

        bufferedReader.close();
    }
}