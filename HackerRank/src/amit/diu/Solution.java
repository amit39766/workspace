package amit.diu;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int num=0;
        for(int aa=0; aa < n; aa++){
            for(int b=aa+1; b < n; b++){
                if((a[aa]+a[b])%k==0){
                	num++;
                }
            }
        }
        System.out.println(num);
    }
}