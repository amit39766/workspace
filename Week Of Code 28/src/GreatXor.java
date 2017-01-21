import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

public class GreatXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bFastScanner sc=new  bFastScanner();
		int q=sc.nextInt();
		for(int a0 = 0; a0 < q; a0++){
            long x = sc.nextLong();
            // your code goes here
            //BitSet bit=new BitSet();
            String binStr=Long.toBinaryString(x);
            int len=binStr.length();
            int zeroPos=0;
            for(int i=0;i<len;i++){
            	if(binStr.charAt(i)=='0'){
            		zeroPos=i;
            		break;
            	}
            }
            String substr=binStr.substring(zeroPos);
            int substrlen=substr.length();
            long subStringvalue=Long.parseLong(substr,2);
            StringBuilder maxPossible=new StringBuilder();
            for(int i=0;i<substrlen;i++){
            	maxPossible.append('1');
            }
            
            long max=Long.parseLong(maxPossible.toString(),2);
            System.out.println(max-subStringvalue);
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
