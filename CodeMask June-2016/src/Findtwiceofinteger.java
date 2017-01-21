import java.util.Scanner;

public class Findtwiceofinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++){
			int N=sc.nextInt();
			int ele[]=new int[N];
			for(int i=0;i<N;i++) ele[i]=sc.nextInt();
			int find=0;
			for(int j=0;j<N;j++){
				for(int k=0;k<N-1;k++){
					if(ele[j]==ele[k]*2){
						find++;
						break;
					}
				}
			}
			System.out.println(find);
		}
		
		

	}

}
