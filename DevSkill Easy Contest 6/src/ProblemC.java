import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cFastScanner sc=new cFastScanner();
		int num[]=new int[45];
		num[1]=1;
		num[2]=3;
		for(int i=3;i<=44;i++){
			num[i]=num[i-2]+num[i-1];
		}
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			int n=sc.nextInt();
			System.out.println(num[n]);
		}

	}

}
class cFastScanner {
	BufferedReader br;
	StringTokenizer st;

	public cFastScanner(String s) {
		try {
			br = new BufferedReader(new FileReader(s));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public cFastScanner() {
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
