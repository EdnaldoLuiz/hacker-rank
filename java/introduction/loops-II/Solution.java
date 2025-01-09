import java.util.*;

class Solution {
    
     static void calcular(int a,int b, int n) {
       int sum = a;
        for (int j = 0; j < n; j++) {
            sum += (int) (Math.pow(2,j)) * b;
            System.out.print(sum+ " ");
        }
        System.out.println(); 
    }
    
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calcular(a, b, n);
        }
        in.close();
    }
}
