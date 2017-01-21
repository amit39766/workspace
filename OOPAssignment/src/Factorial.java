import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("n!=  ?");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the the value of n: ");
		long n=in.nextLong();
		System.out.println("The Factorial of "+n+" is : "+factorial(n));
		

	}
	public static long factorial(long n){
		if(n==1)return 1;
		else 
			return n*(factorial(n-1));
		
	}

}
