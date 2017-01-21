package amit.diu;

import java.util.Scanner;

public class SecondSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int A=sc.nextInt();
			int B=sc.nextInt();
			int X=sc.nextInt();
			int C=A;
			int count=1;
			
			while(C<X){
				if(count%2==0){
					C+=A;
				}
				else{
					C-=B;
				}
				count++;
			}
			System.out.println(count);
		}

	}

}
