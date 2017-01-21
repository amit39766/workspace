import java.util.Scanner;

public class CompleteTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt(2);
		int s2=sc.nextInt(2);
		int lev1=0;
		int lev2=0;
		double tem=0;
		for(int i=0;;i++){
			double x=Math.pow(2, i);
			
			if(tem<s1&&s1<=tem+x){
				lev1=i;
				break;
			}
			tem+=x;
		}
		tem=0;
		for(int j=0;;j++){
			double x=Math.pow(2, j);
			
			if(tem<s2&&s2<=tem+x){
				lev2=j;
				break;
			}
			tem+=x;
		}
		System.out.println(lev1+lev2);

	}

}
