/**
 *
 * @author Amit Chandra Sarkar 
 *  Daffodil International University
 *  E-mail : amit39766@outlook.com
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ProblemH {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hFastScanner sc = new hFastScanner();
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			int ele[] = new int[N];
			for (int n = 0; n < N; n++) {
				ele[n] = sc.nextInt();
			}
			int size=ele.length;
			ArrayList<ArrayList<Integer>> subArrays = new ArrayList<>();//subarrays continer
			/*
			 * The loop below will produce all the possible subarrays of ele[]
			 * If the elements of  ele[] be {1, 2 , 3} 
			 * then from this loop we will ge [[1], [2], [3], [1, 2],[2, 3], [1, 2, 3]]
			 */
						
			for (int i = 0; i < size; i++) {

				for (int j = i; j < size; j++) {

					ArrayList<Integer> el = new ArrayList<>();
					for (int k = i; k <= j; k++) {

						el.add(ele[k]);
					}
					Collections.sort(el);//sorting each subarrays ascendingly which will help to find out the range easily later
					subArrays.add(el);
				}
			}
			//Sorting subarrays according to their element size Descending order;
			Collections.sort(subArrays, new Comparator<ArrayList<Integer>>() {

				@Override
				public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
					
					return o2.size() - o1.size();
				}
			});
			System.out.printf("Case %d:%n", t);
			for (int q = 0; q < Q; q++) {
				int L = sc.nextInt();
				int R = sc.nextInt();
				// L is the minmum range and R is the maximum range
				int maxlen = 0;
				for (ArrayList<Integer> arr : subArrays) {//looking for the maximum length sub array which will  
					if (arr.get(0) >= L && arr.get(arr.size() - 1) <= R) {
						maxlen = arr.size();
						//whenever we will find one this will be the maximum size ,
						//because we have sorted all subarrays descendingly accourding to their size,
						//so we have found the answer, we can break the loop;
						break;
					}
				}
				System.out.println(maxlen);
			}
		}

	}

}
//This class is to read input faster than scanner
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
