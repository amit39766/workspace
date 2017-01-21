import java.util.Scanner;

public class uri_1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		System.out.printf("TRIANGULO: %.3f%n",(.5*a*c));
		System.out.printf("CIRCULO: %.3f%n",(3.14159*c*c));
		System.out.printf("TRAPEZIO: %.3f%n",(((a+b)/2d)*c));
		System.out.printf("QUADRADO: %.3f%n",(b*b));
		System.out.printf("RETANGULO: %.3f%n",(a*b));
		

	}

}
