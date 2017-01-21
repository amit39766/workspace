import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1^2+2^2+3^2+........+n^2=_____ ?");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the the value of n: ");
		int n=in.nextInt();
		int sum=(n*((2*n*n)+(3*n)+1))/6;
		System.out.println("Sum of the series is : "+sum  );
		in.close();

	}

}
