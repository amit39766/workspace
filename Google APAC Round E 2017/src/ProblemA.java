import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProblemA {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter out =new PrintWriter("H:\\io\\outlA.out");
		aFastScanner sc=new aFastScanner("H:\\io\\A-large.in");
		//aFastScanner sc=new aFastScanner();
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			String pattern=sc.nextToken();
			long L=sc.nextLong();
			long R=sc.nextLong();
			char []patt=pattern.toCharArray();
			int len=pattern.length();
			long numB=0l;
			ArrayList<Integer> rindex=new ArrayList<>();
			for(int i=0;i<len;i++){
				if(patt[i]=='B')rindex.add(i);
			}
			for(long i=L;i<=R;i++){
				int check=(int) (i%len);
				check=(check==0)?len-1:check-1;
				if(rindex.contains(check))numB++;
			}
			out.println("Case #"+t+": "+numB);
			out.flush();
			
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
