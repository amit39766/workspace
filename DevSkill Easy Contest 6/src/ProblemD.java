import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dFastScanner sc=new dFastScanner();
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			int N=sc.nextInt();
			long sumOfSeries=(N*(N+1))/2;
			long sumOfSqr=(N*(N+1)*(2*N+1))/6;
			System.out.println((sumOfSeries*sumOfSeries)-sumOfSqr);
		}

	}

}
class dFastScanner {
	BufferedReader br;
	StringTokenizer st;

	public dFastScanner(String s) {
		try {
			br = new BufferedReader(new FileReader(s));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public dFastScanner() {
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
