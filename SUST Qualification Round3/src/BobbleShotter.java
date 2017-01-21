import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BobbleShotter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			boolean[][] mn = new boolean[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					mn[i][j] = (0 != sc.nextInt());
				}

			}
			int bullet = sc.nextInt();
			int maxobs = sc.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int bul=0;
				int obs=0;
				for (int j = 0; j < m; j++) {
					if (mn[i][j]) {
						bul++;
					} else if (!mn[i][j] && obs < maxobs) {
						obs++;
					}
					else break;
				}
				int bulr=0;
				int obsr=0;
				for (int j = m-1; j >=0; j--) {
					if (mn[i][j]) {
						bulr++;
					} else if (!mn[i][j] && obsr < maxobs) {
						obsr++;
					}
					else break;
				}
				if(bul>bulr)al.add(bul);
				else al.add(bulr);
				

			}
			Collections.sort(al);
			int maxbul=0;
			int size=al.size();
			for(int i=al.size()-1;i>size-bullet-1;i--)maxbul+=al.get(i);

			System.out.println("Case " + t + ": " + maxbul);

		}

	}

}
