package amit.diu.string;

import java.util.Scanner;

public class StringIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println((A.length()+B.length()));
        if(A.compareTo(B)<=0) System.out.println("No");
        else System.out.println("Yes");
        String sA="";
        for(int i=0;i<A.length();i++){
            if(i==0)sA+=Character.toUpperCase(A.charAt(0));
            else sA+=A.charAt(i);
        }
        String sB="";
        for(int i=0;i<B.length();i++){
            if(i==0)sB+=Character.toUpperCase(B.charAt(0));
            else sB+=B.charAt(i);
        }
        System.out.println(sA+" "+sB);

	}

}
