//20 WAP to find a power a^b (without using power and multiplication operation).

import java.util.*; 

public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base: ");
        int a=sc.nextInt();
        System.out.print("enter power: ");
        int b=sc.nextInt();
        int ans=0;
        int count=0;
        ans=a;
        for (int i = 0; i < b-1; i++) {
            count=0;
            for (int j = 0; j < a; j++) {
                count=count+ans;
            }
            ans=count;
        }
        System.out.print("ans: "+ans);
    }
}
