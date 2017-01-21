import java.util.Scanner;

public class CardsPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] v=new int[n+1];
		sc.nextLine();
		int sum=0;
		for(int i=1;i<=n;i++){
			v[i]=sc.nextInt();
			sum+=v[i];
		}
		int equal=sum/(n/2);
		int count=0;
		while(count++<(n/2)){
			for(int i=1;i<=n;i++){
				for(int j=i+1;j<=n;j++){
					if(v[i]==0)break;
					else if(v[i]+v[j]==equal){
						if(v[i]<=v[j]){
							System.out.println(i+" "+j);
						}
						else System.out.println(j+" "+i);
						v[i]=0;
						v[j]=0;
					}
				}
				
			}
		}
			
	}

}
