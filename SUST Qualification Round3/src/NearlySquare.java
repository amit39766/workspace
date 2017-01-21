import java.util.Scanner;

public class NearlySquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			int m=sc.nextInt();
			int k=0;
			double sq=Math.sqrt(m);
			int n=(int)sq;
			if(Math.abs(n*n-m)>=Math.abs((n+1)*(n+1)-m)){
				k=(n+1)*(n+1)-m;
				n=n+1;
			}else{
				k=n*n-m;
			}
			System.out.println("Case "+t+": "+n+" "+k);
		}

	}

}
