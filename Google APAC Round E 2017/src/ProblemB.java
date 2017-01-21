import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ProblemB {
	public static int convertToDecimal(String str, int base) {
	    int v = 0;
	    int total = 0;
	    int pow = 0;
	    str = str.toUpperCase();
	    for (int i = str.length() - 1; i >= 0; i--) {
	        char c = str.charAt(i);
	        if (c >= '0' && c <= '9')
	            v = c - '0';
	        else if (c >= 'A' && c <= 'Z')
	            v = 10 + (c - 'A');
	        total += v * Math.pow(base, pow);
	        pow++;
	    }
	    return total;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter out = new PrintWriter("H:\\io\\outsB.out");
		// aFastScanner sc=new aFastScanner("H:\\io\\B-small.in");
		aFastScanner sc = new aFastScanner();
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			long num = sc.nextLong();

			int max = 0;
			int base = 0;
			String bin=Long.toBinaryString(num);
			for(int i=0;i<bin.length();i++){
				
			}
			for (int i = 2; i <= num; i++) {
				
				String changeB = ""+convertToDecimal(""+num, i);
				if (changeB.matches("^1+1$")) {
					if (changeB.length() > max) {
						base = i;
						max = changeB.length();
					}

				}
			}
			System.out.println("Case #" + t + ": " + base);
			out.flush();

		}
		out.close();

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
