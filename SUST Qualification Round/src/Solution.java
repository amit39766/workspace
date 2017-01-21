import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class PrintAllKLengthStrings {
	static ArrayList<String> str=new ArrayList<>();
	// Driver method to test below methods
	public static void main(String[] args) {			 
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		char set[] = {'A', 'C', 'G', 'T'};
		printAll(set, k,n);	 
	} 

	static void printAll(char set[], int k,int n) {
		int s = set.length;
		printAllKLength(set, "", s, k);
		Collections.sort(str);
		System.out.println(str.get(n-1));
	}


	static  void printAllKLength(char set[], String prefix, int s, int k) {		
		
		if (k == 0) {
			str.add(prefix);
			return;
		}

		for (int i = 0; i < s; ++i) {
			

			String newPrefix = prefix + set[i]; 

			printAllKLength(set, newPrefix, s, k - 1); 
		}
	}
}
