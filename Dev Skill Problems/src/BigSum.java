import java.math.BigInteger;
import java.util.Scanner;

public class BigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			String numbers[]=sc.nextLine().split(",");
			StringBuffer num1=new StringBuffer(numbers[0]);
			StringBuffer num2=new StringBuffer(numbers[1]);
			String rnum1=num1.reverse().toString().trim();
			String rnum2=num2.reverse().toString().trim();
			
			BigInteger bn1=new BigInteger(rnum1);		
			BigInteger bn2=new BigInteger(rnum2);
			int maxStringLen=Math.max(rnum1.length(), rnum2.length());
			BigInteger sum=bn1.add(bn2);
			int sumSize=sum.toString().length();
			StringBuffer result=new StringBuffer(sum.toString());
			BigInteger reResult=new BigInteger(result.reverse().toString().trim());
			System.out.print(reResult);
			for(int i=0;i<maxStringLen-sumSize;i++){
				System.out.print("0");
			}
			System.out.println();
		}

	}

}