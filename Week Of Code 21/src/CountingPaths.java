import java.util.Scanner;

public class CountingPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int coin[]=new int[N];
		for(int i=0;i<N;i++) coin[i]=sc.nextInt();
		int L=sc.nextInt();
		int R=sc.nextInt();
		int ways=0;
		int waysR=totalways(R, coin, 0)%100000007;
	    int waysLm=totalways(L-1, coin, 0)%1000000007;
		ways=waysR-waysLm;
		System.out.println(ways);

	}
	public static int totalways(int n, int[] v, int i) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		
		if (i == v.length && n > 0) {
			return 0;
		}
		return totalways(n - v[i], v, i) + totalways(n, v, i + 1);
	}

}
