import java.util.*;

class Solution {
    
    public static String dataType(long valor) {
        System.out.println(valor + " can be fitted in:");
        if(valor >= Byte.MIN_VALUE && valor <= Byte.MAX_VALUE) {
            return "* byte";
        } else if(valor >= Short.MIN_VALUE && valor <= Byte.MAX_VALUE) {
            return "* short";
        } else if(valor >= Integer.MIN_VALUE && valor <= Integer.MAX_VALUE) {
            return "* int";
        } else if(valor >= Long.MIN_VALUE && valor <= Long.MAX_VALUE) {
            return "* long";
        } else {
            return "can't be fitted anywhere.";
        }
    }
    
    public static void main(String []argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(dataType(x));
            } catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}