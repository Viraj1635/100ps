//12 WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
//   should be taken from user (Note that you are not allowed to use an array for this)

import java.util.*;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length:");
        int n=sc.nextInt();
        System.out.println("enter "+(1)+"st number:");
        int a =sc.nextInt();
        int max=a,min=a,sum=a;
        double avg=0;
        for (int i = 0; i < n-1; i++) {
            System.out.println("enter "+(i+2)+"th number:");
            a =sc.nextInt();
            sum=sum+a;
            if (a>max) {
                max=a;
            }
            if (a<min) {
                min=a;;
            }
        }
        avg=sum/n;
        System.out.println("Avg. of given no. is:"+avg);
        System.out.println("Max of given no. is"+max);
        System.out.println("Min of given no. is:"+min);
    }
}
