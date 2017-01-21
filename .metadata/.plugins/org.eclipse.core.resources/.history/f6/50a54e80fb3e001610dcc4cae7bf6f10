import java.util.Scanner;

public class Fibonakki {
	static long f[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++){
			long N=sc.nextLong();
			f=new long[(int) (4*N+1)];
			long max=0;
			for(int i=1;i<=4*N;i++){
				f[i]=fibonacciRecusion(i);
			}
			for(int i=1;i<=N;i++){
				long temp=gfibo(i)%1007;
				if(max<temp)
					max=temp;
			}
			System.out.println(max);
			
		}

	}
	
	 public static long fibonacciRecusion(long number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	 
	        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); 
	    }
	 public static long gfibo(long number){
	        if(number == 0){
	            return 0;
	        }
	 
	        return gfibo(number-1) + f[(int) (4*number-1)]; 
	    }

}
