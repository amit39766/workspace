import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++){
			int n=sc.nextInt();
			int num[]=new int[n];
			for(int i=0;i<n;i++){
				num[i]=sc.nextInt();
			}
			int mrNum=0;
			int red=0;
			for(int i=0;i<n;i++){
				int temp=getRedundant(num[i]);
				if(temp!=0){
					if(temp>red){
						mrNum=num[i];
						red=temp;
					}else if(temp==red){
						mrNum=Math.min(mrNum, num[i]);
					}
				}
				
			}
			if(red==0){
				System.out.println("-1");
			}else{
				System.out.println(mrNum+" "+red);
			}
			
		}

	}

	private static int getRedundant(int i) {
		// TODO Auto-generated method stub
		int redan=0;
		for(int j=1;j<i;j++){
			if(i%j==0)redan+=j;
		}
		if(redan<=i) return 0;
		return redan-i;
	}

}
