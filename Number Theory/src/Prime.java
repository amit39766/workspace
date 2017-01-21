import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println((isPrime(n)==1?"Prime":"Not Prime"));

	}

	private static int isPrime(int n) {
		// TODO Auto-generated method stub
		if(n<=1)return 0;
		for(int i=2;i<n;i++)
			if(n%i==0)return 0;
		return 1;
	}

}
