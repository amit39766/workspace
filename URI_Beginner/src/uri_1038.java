import java.util.Scanner;

public class uri_1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		double y=sc.nextInt();
		double price=0d;
		switch(x){
		case 1:
			price=4.00*y;
			break;
		case 2:
			price=4.50*y;
			break;
		case 3:
			price=5.00*y;
			break;
		case 4:
			price=2.00*y;
			break;
		default:
			price=1.50*y;
		}
		System.out.printf("Total: R$ %.2f%n", price);

	}

}
