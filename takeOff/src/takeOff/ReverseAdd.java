package takeOff;

import java.util.Scanner;
//uva 10018
public class ReverseAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int t=0;t<T;t++){
			
			StringBuilder str=new StringBuilder(sc.nextLine());
			reverseAndAdd(str);
						
		}
		

	}
	public static void reverseAndAdd(StringBuilder num){
		long original=Integer.parseInt(num.toString());
		num.reverse();
		long rev=Integer.parseInt(num.toString());
		int step=0;
		do{
			long added=rev+original;
			num.delete(0,num.length());
			num.append(added);
			original=added;
			num.reverse();
			rev=Long.parseLong(num.toString());
			step++;
		}while(original!=rev);
		System.out.println(step+" "+original);
	}

}
