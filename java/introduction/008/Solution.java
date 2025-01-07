import java.util.*;

class Solution{
    
    public static void dataType(long valor) {
        System.out.println(valor + " can be fitted in:");
        if(valor >= Byte.MIN_VALUE && valor <= Byte.MAX_VALUE) System.out.println("* byte");
        if(valor >= Short.MIN_VALUE && valor <= Short.MAX_VALUE) System.out.println("* short");
        if(valor >= Integer.MIN_VALUE && valor <= Integer.MAX_VALUE) System.out.println("* int");
        if(valor >= Long.MIN_VALUE && valor <= Long.MAX_VALUE) System.out.println("* long");
    }
    
    public static void main(String []argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++) {

            try {
                long x = sc.nextLong();
                dataType(x);
            } catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}