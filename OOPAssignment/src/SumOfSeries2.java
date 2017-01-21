import java.util.Scanner;

public class SumOfSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1-2+3-4+5-........+n=  ?");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the the value of n: ");
		int n=in.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%2==0) sum=sum-i;
			else sum=sum+i;
		}
		System.out.println("Sum of the series is : "+sum  );
		in.close();

	}

}
