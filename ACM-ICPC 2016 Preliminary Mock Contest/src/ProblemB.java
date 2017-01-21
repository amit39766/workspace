import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		bFastScanner sc=new bFastScanner();
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			int N=sc.nextInt();
			int fary[]=new int[N-1];
			int max=0;
			int pass=0;
			for(int i=1;i<N;i++){
				pass+=sc.nextInt();
				pass-=sc.nextInt();
				if(max<pass)max=pass;
			}
			System.out.println("Case "+t+": "+max);
		}

	}

}
class bFastScanner {
	BufferedReader br;
	StringTokenizer st;

	public bFastScanner(String s) {
		try {
			br = new BufferedReader(new FileReader(s));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public bFastScanner() {
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
