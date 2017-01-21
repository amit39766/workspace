import java.math.BigInteger;
import java.util.Scanner;

public class AntiprimeUsingPrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int a_i=sc.nextInt();
			long max=0;
			int antiprime=0;
			long divisors=0;
			for(int j=a_i-5;j<10000000;j++){
				divisors=divisors(j);
				if(j>=a_i&&divisors>max){
					antiprime=j;
					break;
				}
				if(max<divisors) max=divisors;
				divisors=0;
				
			}
			System.out.println(antiprime);
		}

	}
	public static long divisors(int num){
		BigInteger number=new BigInteger(Integer.toString(num));
		BigInteger x = new BigInteger("2");
		long totalFactors = 1;
		while (x.multiply(x).compareTo(number) <= 0) {
		    int power = 0;
		    while (number.mod(x).equals(BigInteger.ZERO)) {
		        power++;
		        number = number.divide(x);
		    }
		    totalFactors *= (power + 1);
		    x = x.add(BigInteger.ONE);
		}
		if (!number.equals(BigInteger.ONE)) {
		    totalFactors *= 2;
		}
		return totalFactors;
	}


}
