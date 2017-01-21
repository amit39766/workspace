import java.util.Scanner;

public class uri_1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int days=sc.nextInt();
		int year=days/365;
		days=days%365;
		int months=days/30;
		days=days%30;
		System.out.println(year+" ano(s)\n"+months+" mes(es)\n"+days+" dia(s)");

	}

}

