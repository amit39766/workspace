import java.util.Scanner;

public class NumberOfaCertianPrimeNumbersinFactorialOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the factorial nubmer : ");
		
		int N=sc.nextInt();
		System.out.print("Enter the prime number : ");
		int p=sc.nextInt();
		long numberOfP=numberOfPinN(N,p);

		System.out.println(N+"! এর মধ্যে "+p+"এর  সংখ্যা হল : "+numberOfP+" টি " );
		

	}

	private static long numberOfPinN(int n,long p) {
		long z=0;
		for(int i=1;;i++){
			p=(long) Math.pow(p, i);
			if(Math.floor(n/p)==0){
				break;
			}else{
				z+=Math.floor(n/p);
			}
		}
		
		return z;
	}

}