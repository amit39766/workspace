import java.util.Scanner;

public class uri_1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split("\\.");
		int intpart=Integer.parseInt(str[0]);
		int decnum=Integer.parseInt(str[1]);
		int note[]={100,50,20,10,5,2};
		int coin[]={1,50,25,10,5,1};
		double coins[]={.50,.25,.10,.05,.01};
		System.out.println("NOTAS:");
		for(int i=0;i<6;i++){
			int counter=0;
			counter=intpart/note[i];
			intpart=intpart-note[i]*counter;
			System.out.printf("%d nota(s) de R$ %d.00%n",counter,note[i]);
		}
		
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ %d.00%n",intpart,coin[0]);
		for(int i=1;i<6;i++){
			int counter=0;
			counter=decnum/coin[i];
			decnum=decnum-coin[i]*counter;
			System.out.printf("%d moeda(s) de R$ %.2f%n",counter,coins[i-1]);
		}

	}

}
