import java.util.Scanner;

public class uri_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int pid1=sc.nextInt();
		float product=sc.nextInt();
		float price1=sc.nextFloat();
		sc.nextLine();
		int pid2=sc.nextInt();
		float product2=sc.nextInt();
		float price2=sc.nextFloat();
		float result=(product*price1)+(product2*price2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",result);

	}

}