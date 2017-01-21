import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		eFastScanner sc=new eFastScanner();
		int N=sc.nextInt();
		double max=sc.nextInt();
		double min=max;
		for(int y=1;y<=N;y++){
			if(y==1){
				System.out.printf("Case %d: %.2f%n",y,(max/min));
				continue;
			}
			int val=sc.nextInt();
			if(max<val){
				max=val;
			}else if(val<min){
				min=val;
			}
			
			System.out.printf("Case %d: %.2f%n",y,(max/min));
		}
	}

}
class eFastScanner {
	BufferedReader br;
	StringTokenizer st;

	public eFastScanner(String s) {
		try {
			br = new BufferedReader(new FileReader(s));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public eFastScanner() {
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
