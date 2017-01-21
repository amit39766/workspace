package amit.diu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int a_i = 0; a_i < n; a_i++) {
			int element = in.nextInt();
			al.add(element);
		}
		for (int aa = 0; aa < al.size();aa++ ) {
			int match = 0;
			int firstMatchedIndex = 0;
			for (int b = aa + 1; b < al.size(); b++) {

				if ((al.get(aa) + al.get(b)) % k == 0) {
					match++;
					firstMatchedIndex = b;

				}

			}
			if (match > 1){
				al.remove(aa);
				aa--;
			}
				
			else if (match == 1) {
				int count = 0;
				for (int i = 0; i < al.size(); i++) {
					if (i == firstMatchedIndex)
						continue;
					if ((al.get(firstMatchedIndex) + al.get(i)) % k == 0) {
						count++;
					}
				}
				if (count > 1)
					al.remove(firstMatchedIndex);
				else if (count == 1){
					al.remove(aa);
					aa--;
				}
					
			}
			
		}
		System.out.println(al.size());
	}
}
