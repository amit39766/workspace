import java.util.Scanner;

public class CrowsNumber {
		static int b[];
		static int a[];
		static int s[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[n];
		sc.nextLine();
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		b=new int[n];
		s=new int[n];
		for(int i=n-1;i>=0;i--){
			b[i]=findBi(i);
		}
		for(int p=0;p<n;p++){
			System.out.print(b[p]+" ");
		}
		

	}

	private static int findBi(int i) {
		// TODO Auto-generated method stub
		int bb=a[i];
		int bi=0;
		if(s[i]==0){
			for(int j=i+1;j<=a.length-1;j++){				
				bi+=b[j];				
			if(j!=a.length-1){
				bb-=b[j+1];
				j++;
			}
		}
			s[i]=bi;
		}else{
			bi=s[i+1]+b[i];
			s[i]=bi;
		}
			
			
		return bb+bi;
	}

}
