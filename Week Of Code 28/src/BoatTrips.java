import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BoatTrips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hFastScanner sc=new hFastScanner();
		int n=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int pi[]=new int[n];
		for(int i=0;i<n;i++){
			pi[i]=sc.nextInt();
		}
		Arrays.sort(pi);
		int max=m*c;
		System.out.println((max>=pi[n-1]?"Yes":"No"));

	}

}
class hFastScanner {
	BufferedReader br;
	StringTokenizer st;

	public hFastScanner(String s) {
		try {
			br = new BufferedReader(new FileReader(s));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public hFastScanner() {
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
