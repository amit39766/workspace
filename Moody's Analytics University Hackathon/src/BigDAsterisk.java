import java.math.BigInteger;
import java.util.Scanner;

public class BigDAsterisk {
	static BigInteger mod=new BigInteger("1000000007");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int t=0;t<T;t++){
			String str=sc.nextLine();
			//StringBuilder sb=new StringBuilder(str);
			String regex="^([0-9]+(\\*|\\*\\*))+[0-9]+$";
			if(str.matches(regex)){
				String num[]=str.split("(\\*)+");
				String nota[]=str.split("([0-9]+)");
				long mul[]=new long[100000];
				int j=0;
				for(int i=0,n=1;i<num.length;i++){
					long num1=Long.parseLong(num[i]);
					if(i==nota.length-1){
						mul[j++]=num1;			    
						break;
					}
					if(nota[i+1].equals("*")){
						mul[j++]=num1;
					}else{
						long num2=Long.parseLong(num[i+1]);
						num[i+1]=""+bigmod(new BigInteger(num[i]),new BigInteger(num[i+1]));
					}
				}

				long result=1l;
				int mod=1000000007;
				for(int k=0;k<j;k++){
					result=((result%mod)*(mul[k]%mod))%mod;
				}
				System.out.println(result);
			}else{
				System.out.println("Syntax Error");
			}
		}
		

	}

	private static BigInteger bigmod(BigInteger num1, BigInteger num2) {
		// TODO Auto-generated method stub
		BigInteger re=num1.modPow(num2, mod );
		return re;
		
		
	}

}
