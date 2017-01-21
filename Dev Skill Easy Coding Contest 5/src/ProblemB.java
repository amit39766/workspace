import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			int n=sc.nextInt();
			double expense=0;
			for(int j=0;j<n;j++){
				double p=sc.nextDouble();
				double q=sc.nextDouble();
				expense+=p*q;
			}
			double g=sc.nextDouble();
			int back=(int)(g-expense);
			
			System.out.println("Case "+t+": "+back);
		}

	}

}
