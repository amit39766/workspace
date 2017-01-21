import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ProblemB  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bFastScanner sc=new bFastScanner();
		int N=sc.nextInt();
		ArrayList<String>al=new ArrayList<>(N) ;
		for(int i=1;i<=N;i++){
		
			al.add(sc.nextToken()+" "+sc.nextDouble());
			
		}
		Collections.sort(al, new Comparator<String>() {



			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String str1[]=o1.split(" ");
				String str2[]=o2.split(" ");
				String name1=str1[0];
				String name2=str2[0];
				double gpa1=Double.parseDouble(str1[1]);
				double gpa2=Double.parseDouble(str2[1]);
				if(gpa1>gpa2)return 1;
				else if(gpa1<gpa2)return -1;
				else{
					if(name1.compareToIgnoreCase(name2)<1)return 0;
					else return -1;
				}
				
				
			}
		});
		for(int i=N-1;i>=0;i--){
			String name[]=al.get(i).split(" ");
			System.out.println((N-i)+"."+name[0]);
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
