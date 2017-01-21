import java.util.Scanner;

public class ProblmeB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++){
			System.out.printf("Case %d: %.3f%n",(t+1),sc.nextDouble()/Math.PI);
		}

	}

}
