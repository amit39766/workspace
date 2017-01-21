import java.io.*;
import java.util.*;

public class bitWiseAnd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=Integer.parseInt(sc.nextLine());
        for(int t=0;t<T;t++){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int max=0;
            for(int c=1;c<N;c++){
                for(int m=c+1;m<=N;m++){
                    int bitAnd=c&m;
                    if((bitAnd>max)&&(bitAnd<K))
                        max=c&m;
                }
            }
            System.out.println(max);
        }
    }
}