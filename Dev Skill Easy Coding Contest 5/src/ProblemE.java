import java.util.Scanner;

public class ProblemE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			long n=sc.nextLong();
			double ns=Math.sqrt(n)+1d;
			long nss=(long)ns;
			long small=1;
			long big=1;
			
			for(long i=nss;i>=0;i--){
				if(n%i==0){
					small=n/i;
					big=i;
					break;
				}
			}
			System.out.println(Math.abs(big-small));
		}

	}

}