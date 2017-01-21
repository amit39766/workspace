import java.util.Scanner;

public class AsteriskExpression {
	static long mod=1000000007;
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
					long num1=Long.parseLong(num[i])%mod;
					if(i==nota.length-1){
						mul[j++]=num1;			    
						break;
					}
					if(nota[i+1].equals("*")){
						mul[j++]=num1;
					}else{
						long num2=Long.parseLong(num[i+1])%mod;
						num[i+1]=""+bigmod(num1,num2);
					}
				}

				long result=1l;
				for(int k=0;k<j;k++){
					result=(((result%mod))*((mul[k])%mod)%mod);
				}
				System.out.println(result);
			}else{
				System.out.println("Syntax Error");
			}
		}
		

	}

	private static long bigmod(long num1, long num2) {
		// TODO Auto-generated method stub
		if(num2==0)return 1%mod;
		long x=bigmod(num1,num2/2);
		x=(x*x)%mod;
		if(num2%2==1)x=(x*num1)%mod;
		return x;
		
	}

}
