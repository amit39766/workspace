import java.util.ArrayList;
import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.nanoTime();
		Scanner sc=new Scanner(System.in);
		ArrayList<String> numberList=new ArrayList<>();
		int i=0;
		while(i++<3000){
			String str=sc.nextLine();
			numberList.add(str);
		}
		long endTime=System.nanoTime();
		System.out.println("Run Time : ".format("%.10f %s",(endTime-startTime)/10e9,"sec"));

	}

}
