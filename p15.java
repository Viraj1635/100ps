// 15 WAP to convert a Decimal number to BCD. 

import java.util.*;

public class p15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextDouble();
        
        int a=0,c=0,d=0;
        double b=0;
        d=(int)(n/1);
        while (d>0) {
            a=d%2;
            b=(int)(b+(a*Math.pow(10,c)));
            d=d/2; 
            c++;
        }
        n=n-Math.floor(n);
        c= 1;       
        System.out.println(n);
        while (c==4) {
            a=(int) (n*2);
            n=n*2;
            b=b+(a/10); 
            c++;
        }
        System.out.println(b);
        System.out.println(n);
    }
}
