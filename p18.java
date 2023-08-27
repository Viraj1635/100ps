//18 WAP to sort an Array using Selection sort.

import java.util.*;

public class p18 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=0;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
