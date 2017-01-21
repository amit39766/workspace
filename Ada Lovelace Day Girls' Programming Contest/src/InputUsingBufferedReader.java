import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		long startTime=System.nanoTime();
		//Scanner sc=new Scanner(System.in);
		BufferedReader fs=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> numberList=new ArrayList<>();
		int i=0;
		while(i++<2000){
			String str=fs.readLine();
			numberList.add(str);
		}
		long endTime=System.nanoTime();
		System.out.println("Run Time : ".format("%.10f %s",(endTime-startTime)/10e9,"sec"));


	}
}