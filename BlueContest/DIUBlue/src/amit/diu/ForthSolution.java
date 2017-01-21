package amit.diu;

import java.util.Scanner;

public class ForthSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if((x%2==0)&&(y%2==0)){
				System.out.println("Impossible");
			}
		}

	}

}
