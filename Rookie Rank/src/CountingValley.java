import java.util.Scanner;

public class CountingValley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		int vallyCount=0;
		int level=0;
		boolean h;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='U'){
				level++;
				h=true;
			}
			else{
				level--;
				h=false;
			}
			if(level==0&&h) {
				vallyCount++;
			}
			
		}
		System.out.println(vallyCount);
	}

}
