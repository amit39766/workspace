import java.util.LinkedList;
import java.util.Scanner;

public class Tokendistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++){
			int N=sc.nextInt();
			int coin[]=new int[N];
			LinkedList<Integer> cl=new LinkedList<>();
			int sumOfcoin=0;
			for(int i=0;i<N;i++) {
				coin[i]=sc.nextInt();
				cl.add(coin[i]);
				sumOfcoin+=coin[i];
			}
			if(sumOfcoin%3!=0){
				System.out.println(":(");
			}
			else{
				
			}
			
		}

	}

}
