import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProblemA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		aFastScanner sc=new aFastScanner();
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			long N=sc.nextLong();
			if(N>0){
				for(long i=0;i<=N;i++){
					System.out.print(i+" ");
				}
				System.out.println();
			}else{
				System.out.print("0 ");
				for(long i=N;i<0;i++){
					System.out.print(i+" ");
				}
				System.out.println();
			}

		}

	}

}

class aFastScanner {
		BufferedReader br;
		StringTokenizer st;

		public aFastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public aFastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String nextToken() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(nextToken());
		}

		long nextLong() {
			return Long.parseLong(nextToken());
		}

		double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}
