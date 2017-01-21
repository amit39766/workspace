import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class middlevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int Test=sc.nextInt();
	sc.nextLine();
	for(int c=0;c<Test;c++){
		String[] sal=sc.nextLine().split(" ");
		int[] arr=new int[3];
		arr[0]=Integer.parseInt(sal[0]);
		arr[1]=Integer.parseInt(sal[1]);
		arr[2]=Integer.parseInt(sal[2]);
		Arrays.sort(arr);
		System.out.println("Case "+(c+1)+": "+arr[1]);
	}

	}

}
