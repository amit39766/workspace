import java.util.Scanner;

public class ProblemC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int para=x*2+y*3;
			System.out.println("Case "+t+": "+para);
		}

	}

}
