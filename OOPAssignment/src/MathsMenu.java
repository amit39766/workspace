import java.util.Scanner;

public class MathsMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int con;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Enter value of a: ");
			a = in.nextInt();
			System.out.print("Enter value of b: ");
			b = in.nextInt();
			System.out.println("*******************************\n Operations: \n************************");
			System.out.println("Press 1 to calculate a+b= ");
			System.out.println("Press 2 to calculate a-b= ");
			System.out.println("Press 3 to calculate axb= ");
			System.out.println("Press 4 to calculate a/b= ");
			System.out.println("Press 5 to exit");
			System.out.print("----------------------------------\nSelect Operation:  ");
			con = in.nextInt();
			switch (con) {
			case 1:
				System.out.println("a+b =" + (a + b));
				break;
			case 2:
				System.out.println("a+b =" + (a - b));
				break;
			case 3:
				System.out.println("axb =" + (a * b));
				break;
			case 4:
				System.out.println("a/b =" + (a / b));
				break;
			default:
				
			}
		} while (con != 5);

	}

}
