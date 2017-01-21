import java.util.Scanner;

public class uri_1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int time=sc.nextInt();
		int hours=time/3600;
		time=time%3600;
		int minutes=time/60;
		time=time%60;
		System.out.println(hours+":"+minutes+":"+time);

	}

}
