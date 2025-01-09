import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("================================");
            
            for(int i = 0; i < 3; i++) {
                 
                String s1 = sc.next();
                int length = 15;
                int x = sc.nextInt();
                String numero = String.format("%03d", x);
                String nome = String.format("%-" + length + "s" + numero, s1);
                System.out.printf(nome + "\n");
                
            }
            sc.close();
            System.out.println("================================");
    }
}