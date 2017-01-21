import java.util.Scanner;

public class GridLand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int P=sc.nextInt();
		for(int i=0;i<P;i++){
			int N=sc.nextInt();
			char[][] grid=new char[2][N];
			String str1=sc.nextLine();
			String str2=sc.nextLine();
			for(int k=0;k<str1.length();k++){
				grid[0][k]=str1.charAt(k);
			}
			for(int k=0;k<str2.length();k++){
				grid[1][k]=str1.charAt(k);
			}
		}
		//move1
		
		


	}
	 

}
