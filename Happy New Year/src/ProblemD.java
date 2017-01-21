import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProblemD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int t=1;t<=T;t++){
			StringBuffer str=new StringBuffer(sc.nextLine());
			int len=str.length();
			String smallest=str.toString();
			for(int i=1;i<=len;i++){
				str.append(str.charAt(0));
				str.deleteCharAt(0);
				if(smallest.compareTo(str.toString())>0){
					smallest=str.toString();
				}
			}
			
			
			System.out.println("Case "+t+": "+smallest);
			
		}

	}

}

