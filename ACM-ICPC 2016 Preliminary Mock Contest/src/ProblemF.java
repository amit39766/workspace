import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class ProblemF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		fFastScanner sc=new fFastScanner();
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++){
			Map<Long,Long> pid=new HashMap<>();
			Map<Long,Long>rid=new HashMap<>();
			Set<Long> usedRe=new HashSet<>();
			int Q=sc.nextInt();
			for(int q=0;q<Q;q++){
				if(sc.nextInt()==1){
					long pi=sc.nextLong();
					long ri=sc.nextLong();
					if(usedRe.contains(ri)){
						System.out.println("N");
					}else{
						System.out.println("Y");
						//pid.put(pi, ri);
						usedRe.add(ri);
						rid.put(ri, pi);
					}
				}
				else{
					long ri=sc.nextLong();
					if(usedRe.contains(ri)){
						System.out.println(rid.get(ri));
						usedRe.remove(ri);
						//pid.remove(rid.get(ri));
						rid.remove(ri);
					}
					else{
						System.out.println("F");
					}
				}
			}
		}

	}

}
class fFastScanner {
	BufferedReader br;
	StringTokenizer st;

	public fFastScanner(String s) {
		try {
			br = new BufferedReader(new FileReader(s));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public fFastScanner() {
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