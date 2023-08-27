//Print a following patterns
//----------------1---------------
//     1
//    A B
//   2 3 4
//  C D E F
//---------------2---------------
// *********
//  *******
//   *****
//    ***
//     *
//---------------3---------------
// *********
// **** ****
// ***   ***
// **     **
// *       *

import java.util.*;

public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for pattern 1,2 for pattern 2,3 for pattern 3");
        int i=sc.nextInt();
        System.out.println("enter number of levels:");
        int n=sc.nextInt();
        switch (i) {
            case 1:
                pattern1(n);
                break;
            case 2:
                pattern2(n);
                break;
            case 3:
                pattern3(n);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    public static void pattern1(int n){
        int x=1;
        char y='A';
        for (int i = 0; i <n; i++) {
            for (int j = n-1; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                if (i%2==0) {
                    System.out.print(" "+x);
                    x++;
                }
                else{
                    System.out.print(" "+y);
                    y++;
                }
            }
            System.out.println("");
        }
    }
    public static void pattern2(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = n-1; k >=i; k--) {
                    System.out.print(" *");
            }
            System.out.println("");
        }
    }
    public static void pattern3(int n){
        for (int i = 0; i <n-(n/2); i++) {
            int temp=n;
            for (int j = 0; j <n; j++) {
                temp=n/(i+1);
                if (i==0) {
                    System.out.print("*");
                }
                else{
                    if (j<temp||j>=n-temp) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

}
