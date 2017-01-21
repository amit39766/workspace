import java.util.Scanner;

public class LearningFromThePast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int maxProfit=0;
		int x,y,z;
		for(int i=0;i<n;i++){
			x=sc.nextInt();
			y=sc.nextInt();
			z=sc.nextInt();
			int sum=x+y+z;
			int min=Math.min(x, Math.min(y, z));
			sum=sum-min;
			if(maxProfit<sum)maxProfit=sum;
		}
		System.out.println(maxProfit);

	}

}
