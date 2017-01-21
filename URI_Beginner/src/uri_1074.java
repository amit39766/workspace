import java.util.Scanner;

public class uri_1074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			int y=Math.abs(x);
			if(x==0)System.out.println("NULL");
			else if(y%2==0){
				if(x>0)
				System.out.println("EVEN POSITIVE");
				else System.out.println("EVEN NEGATIVE");
			}
			else{
				if(x>0)System.out.println("ODD POSITIVE");
				else System.out.println("ODD NEGATIVE");
			}
		}

	}

}
