package amit.diu;

import java.util.Scanner;

public class ThirdSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int S=sc.nextInt();
		int arr[]=new int[S];
		for(int i=0;i<S;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<S;i++){
			for(int j=i+1;j<S;j++){
				if(arr[i]>arr[j])
					System.out.println(arr[i]+" "+arr[j]);
			}
		}

	}

}
