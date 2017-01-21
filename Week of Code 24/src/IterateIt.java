import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class IterateIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hFastScanner sc=new hFastScanner();
		int n=sc.nextInt();
		int rep=0;
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<n;i++)al.add(sc.nextInt());
		long start=System.nanoTime();
		long elapsed=0l;
		long maxtime=2699599999l;
		while(!al.isEmpty()){
			ArrayList<Integer> bb=new ArrayList<>();
			for(int i=0;i<al.size()&&elapsed<maxtime;i++){
				int x=al.get(i);
				for(int j=0;j<al.size();j++){
					int y=al.get(j);
					if(x!=y)bb.add(Math.abs(x-y));
				}
				elapsed=(System.nanoTime()-start);
			}
			elapsed=(System.nanoTime()-start);
			if(elapsed>maxtime){
				rep=-1;
				break;
			}
			rep++;
			al=bb;
		}
		System.out.println(rep);
		

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
