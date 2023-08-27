//13.  WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user) 

import java.util.*;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter row of matrix a:");
            int p=sc.nextInt();
            System.out.println("enter column of matrix a:");
            int q=sc.nextInt();
            System.out.println("enter row of matrix b:");
            int r=sc.nextInt();
            System.out.println("enter column of matrix b:");
            int s=sc.nextInt();
            if (q!=r) {
                System.out.println("matrices can't multiplied.");
                return;
            }
            int a[][]=new int [p][q];
            int b[][]=new int [r][s];
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r;i++){
                for(int j=0;j<s;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            int c[][]=new int [p][s];
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < s; j++) {
                    for (int n = 0; n < q; n++) {
                        c[i][j]+=a[i][n]*b[n][j];
                    }
                }
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < s; j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        
    }
}
