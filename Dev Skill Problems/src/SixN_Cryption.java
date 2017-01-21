import java.util.Arrays;
import java.util.Scanner;

public class SixN_Cryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		while(sc.hasNext()){
			if(flag)sc.nextLine();
			else flag=true;
			int en=sc.nextInt();
			int n=sc.nextInt();
			sc.nextLine();
			long num[]=new long[n];
			for(int k=0;k<n;k++){
				num[k]=Long.parseLong(sc.nextLine());
				
			}
			//Arrays.sort(num);
			
			long bigPrime= primeFactors(num[0]);
			long sum=0;
			for(int i=0;i<n;i++){
				sum+=num[i]/bigPrime;
			}
			System.out.println("Output: "+(en-sum));
			long end=System.currentTimeMillis();
			System.out.println("Time elapsed : "+(end-start));
		}


	}
	public static long primeFactors(long num) {
		
        long pFactor = 1L;

        for(long i = 3L; i <= num / i; ) 
        {
            if( num % i == 0 ) {
                pFactor = i;
                num = num / i;
            }
            else {
                i += 2;
            }
        }
        if( pFactor < num ) { pFactor = num; }

        return pFactor;
    }


	

}