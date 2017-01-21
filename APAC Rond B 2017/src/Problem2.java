import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String out="C:\\Users\\Amit Chandra Sarkar\\Desktop\\OutPut\\out.out";
		String in="C:\\Users\\Amit Chandra Sarkar\\Desktop\\OutPut\\input.in";
		PrintWriter output =new PrintWriter(out);
		
		Scanner sc=new Scanner(new File(in));
		BigInteger mod =new BigInteger("1000000007");
		int T=sc.nextInt();
		sc.nextLine();
		for(int t=1;t<=T;t++){
		int A=sc.nextInt();
		int B=sc.nextInt();
		long N=sc.nextLong();
		long K=sc.nextLong();

			BigInteger pairs=BigInteger.ZERO;
			for(long i=1;i<N;i++){
				for(long j=i+1;j<=N;j++){
					if((new BigInteger(""+i).pow(A)).add((new BigInteger(""+j).pow(B))).mod(new BigInteger(""+K))==BigInteger.ZERO){
						pairs=pairs.add(BigInteger.ONE);
					}
					if((new BigInteger(""+j).pow(A)).add((new BigInteger(""+i).pow(B))).mod(new BigInteger(""+K))==BigInteger.ZERO){
						pairs=pairs.add(BigInteger.ONE);
					}
				}
				
			}
			
			output.println("Case #"+t+": "+pairs.mod(mod));
			output.flush();
		}
		output.flush();
	

	}

}
