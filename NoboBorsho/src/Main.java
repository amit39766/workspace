import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

			int  TT;
			Scanner sc=new Scanner(System.in);
			TT=sc.nextInt();
			for(int  t=0;t<TT;t++){
				int  L,R;
				L=sc.nextInt();
				R=sc.nextInt();
				int[] A=new int[R+1];
				A[0]=0;
				int  sum=0;
				for(int cc=1;cc<=R;cc++)
					A[cc]=(A[cc-1])^(cc);
				for(int  s=L;s<=R;s++)
					sum+=A[s];
				System.out.println(""+sum);			
			}

			
	}

}
