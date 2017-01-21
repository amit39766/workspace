import java.util.Scanner;

public class Cryptography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int n=165000;
		int prime[]=new int[15100];
		boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int factor = 2; factor*factor <= n; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }
        for (int i = 2,j=1; i <= n; i++) {
            if (isPrime[i]) prime[j++]=i;
        }
        for(int i=0;i<b;i++){
        	int or=sc.nextInt();
        	System.out.println(prime[or]);
        }
    }
}


