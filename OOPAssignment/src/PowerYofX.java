import java.util.Scanner;

public class PowerYofX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("x^y=  ?");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the the value of x and y:");
		System.out.print("x= ");
		long x=in.nextLong();
		System.out.print("y= ");
		long y=in.nextLong();
		System.out.println(x+"^"+y+" =  "+powerofxy(x, y));
	}
	public static long powerofxy(long x,long y){
		int pow=1;
		for(int i=1;i<=y;i++) pow*=x;
		return pow;
		
	}

}
