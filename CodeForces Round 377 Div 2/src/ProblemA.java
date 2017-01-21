import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hFastScanner sc=new hFastScanner();
		long k=sc.nextInt();
		int r=sc.nextInt();
		long kk=k;
		int count=1;
		
		if(k>=10){
			//k=k+kk;
			if(k%10==0)count=(int) (k/10);
			else
				while(k%10!=r&&k%10!=0){
					count++;
					k=k+kk;
				}
		}else if(k<=r){
			if(r%k==0)count=(int) (r/k);
			else count=0;
		}else count=0;
		System.out.println(count);

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