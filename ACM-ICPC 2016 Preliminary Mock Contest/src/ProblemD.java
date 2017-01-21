import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class ProblemD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		dFastScanner sc=new dFastScanner();
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			int N=sc.nextInt();
			ArrayList qubic=new ArrayList<>();
			for(int i=0;i<N;i++){
				qubic.add((long)Math.pow(sc.nextDouble(),3));
			}
			Collections.sort(qubic);
			ArrayList<Long> al=new ArrayList<>();
			al.addAll(qubic);
			int qN=N;
			for(int i=N-1;i>0;i--){
				if(qubic[i]!=qubic[i-1])qN--;
		}
			System.out.println(qN);

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
