import java.util.Scanner;

public class FactorialsAlas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); String st=sc.nextLine().trim();
		int k=st.length();
		long result=n;
		if(n%k!=0){
			for(int i=1;(n-k*i)>=(n%k);i++){
				result*=(n-k*i);
			}
		
		}else{
			for(int i=1;(n-k*i)>=k;i++){
				result*=(n-k*i);
			}
			
		}
		System.out.println(result);

	}

}
