import java.util.Scanner;

public class NumberOfZerosOfFactorialOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the nubmer :");
		int n=sc.nextInt();
		int zeros=0;
		for(int i=5;i<=n;i=i+5){
			zeros+=findZirosFor(i);
		}
		System.out.println(n+"! পিছনের জিরোর সংখ্যা হল : "+zeros+" টি " );
		

	}

	private static int findZirosFor(int i) {
		int z=0;
		while(i%5==0){
			i=i/5;
			z++;
		}
		return z;
	}

}
