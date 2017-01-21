package amit.diu;

import java.util.Scanner;

public class SeventhSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int N=sc.nextInt();
			System.out.println(permuFunc(N));
		}
		
		

	}
	public static long permuFunc(int N){
		if(N==1)
			return 1;
		else 
			return N*permuFunc(N-1);
		
	}

}
