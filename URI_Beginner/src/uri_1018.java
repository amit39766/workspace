import java.util.Scanner;

public class uri_1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num);
		int note[]={100,50,20,10,5,2,1};
		for(int i=0;i<7;i++){
			int counter=0;
			counter=num/note[i];
			num=num-note[i]*counter;
			System.out.printf("%d nota(s) de R$ %d,00%n",counter,note[i]);
		}

	}

}
