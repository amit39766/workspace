import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PolandBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<Integer> st=new HashSet<>();
		int loop=n*1000;
		for (int i = 1; i<loop; i++) {

			boolean isPrimeNumber = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break; 
				}
			}

			if (isPrimeNumber) {
				st.add(i);
			}
		}
		for(int m=1;m<=1000;m++){
			if(!st.contains((m*n)+1)){
				System.out.println(m);
				break;
			}
		}

	}

}
