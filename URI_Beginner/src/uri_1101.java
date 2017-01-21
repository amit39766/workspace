import java.util.Scanner;

public class uri_1101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int sum=0;
		while(x>0&&y>0){
			if(x>y){
				for(int j=y;j<=x;j++){
					System.out.print(j+" ");
					sum+=j;
				}
			}else{
				for(int j=x;j<=y;j++){
					System.out.print(j+" ");
					sum+=j;
				}
			}
			System.out.println("Sum="+sum);
			sum=0;
			x=sc.nextInt();
			y=sc.nextInt();
			
		}

	}

}
