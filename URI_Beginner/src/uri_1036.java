import java.util.Scanner;

public class uri_1036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double deter=b*b-4*a*c;
		if(deter<0||a==0){
			System.out.println("Impossivel calcular");
		}else{
			double x1=(-b+Math.sqrt(deter))/(2*a);
			System.out.printf("R1 = %.5f%n",x1);
			double x2=(-b-Math.sqrt(deter))/(2*a);
			System.out.printf("R2 = %.5f%n",x2);
		}
		

	}

}