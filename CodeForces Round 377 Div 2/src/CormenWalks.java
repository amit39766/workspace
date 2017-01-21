import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CormenWalks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bFastScanner sc=new bFastScanner();
		int n=sc.nextInt();
		int k=sc.nextInt();
		int days[]=new int[n];
		int totalWalks=0;
		for(int i=0;i<n;i++){
			days[i]=sc.nextInt();
			totalWalks+=days[i];
		}
		int extraWalks=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<=i+1;j++){
				if(days[i]+days[j]<k){
					days[j]=k-days[i];
				}
			}
			extraWalks+=days[i];
		}
		extraWalks+=days[n-1];
		System.out.println(extraWalks-totalWalks);
		for(int i=0;i<n;i++){
			System.out.print(days[i]+" ");
		}
		System.out.println();
		

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