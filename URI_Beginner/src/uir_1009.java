import java.util.Scanner;

public class uir_1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		double salary=sc.nextDouble();
		double sells=sc.nextDouble();
		double result=sells*(15d/100d);
		System.out.printf("TOTAL = R$ %.2f%n",result+salary);

	}

}
