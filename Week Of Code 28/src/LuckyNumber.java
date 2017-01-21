import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cFastScanner sc=new cFastScanner();
		int n=sc.nextInt();
		String numbers=sc.nextToken();
		BigInteger m=new BigInteger("1000000007");
		BigInteger counter=BigInteger.ZERO;
		for (int i = 0; i <(1<<n); i++) {
			StringBuilder stB = new StringBuilder();
			for (int j = 0; j < n; j++) {
				
				if ((i&(1<<j))>0) {
					stB.append(numbers.charAt(j));
				}
				
			}
			if(stB.length()!=0){
				
				if(stB.length()<18){
					if((Long.numberOfTrailingZeros(Long.parseLong(stB.toString()))>=3)) counter=counter.add(new BigInteger("1"));
					
				}else{
					BigInteger big=new BigInteger(stB.toString());
					long bitLen=big.bitLength();
					if(bitLen-big.getLowestSetBit()>3)
					{
						counter=counter.add(new BigInteger("1"));
					}
				}
				
				
			}
			
		}
		System.out.println(counter.mod(m));

	}

}
class cFastScanner {
	BufferedReader br;
	StringTokenizer st;

	public cFastScanner(String s) {
		try {
			br = new BufferedReader(new FileReader(s));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public cFastScanner() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String nextToken() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
