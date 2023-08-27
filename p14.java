//14. WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user)

import java.util.*;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter hour:");
            int h=sc.nextInt();
            System.out.println("enter minutes:");
            double m=sc.nextDouble();
            double ha,ma,ta;
            ha=h*30+((m/12)*6);
            ma=(m/5)*30;
            ta=Math.abs(ha-ma);
            if (ta>180) {
                ta=360-ta;
            }
            System.out.println(ta);
    }
}
