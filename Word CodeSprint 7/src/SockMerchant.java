import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Set<Integer> cS=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int pairs=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        	int color=sc.nextInt();
        	if(!cS.isEmpty()){
        		if(cS.contains(color)){
        			cS.remove(color);
        			pairs+=1;
        		}else{
        			cS.add(color);
        		}
        	}else{
        		cS.add(color);
        	}
        }
        System.out.println(pairs);
    }
}
