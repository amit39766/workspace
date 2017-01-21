import java.io.*;
import java.util.*;

public class SortedSubsegment {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int k=sc.nextInt();
        int el[]=new int[n];
        for(int i=0;i<n;i++) el[i]=sc.nextInt();
        for(int j=0;j<q;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            Arrays.sort(el, a, b+1);
        }
       // for(int b:el)System.out.print(" "+b);
        System.out.println(el[k]);
    }
}