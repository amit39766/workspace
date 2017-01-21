import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> seqList=new ArrayList<>(n);
        int q=sc.nextInt();
        int lastSeq=0;
        for(int i=0;i<q;i++){
            int qt=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(qt==1){
                seqList.get((x^lastSeq)%n).add(y);
            }else{
                int size=seqList.get((x^lastSeq)%n).size();
                lastSeq=seqList.get((x^lastSeq)%n).get(y%size);
                System.out.println(lastSeq);
            }
        }
    }
}