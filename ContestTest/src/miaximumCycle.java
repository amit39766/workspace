import java.lang.*;
import java.io.*;
import java.util.*;
class miaximumCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//ArrayList<Integer> al=new ArrayList<>();
		while (sc.hasNextLine()) {
		int i=sc.nextInt();
		int j=sc.nextInt();
		maximumCycleLength(i,j);
		
		}
		sc.close();
	}
	public static void maximumCycleLength(int i,int j){
		int[] intArr=new int[j-i+1];
		for(int c=i,ac=0;c<=j;c++,ac++){
			intArr[ac]=cycleFinder(c);
		}
		Arrays.sort(intArr);
		intArr[j-i]++;
		System.out.println(i+" "+j+" "+intArr[j-i]);
	}
	public static int cycleFinder(int n){
		int length=0;
		while(n!=1){
		if(n%2!=0)
			n=3*n+1;
		else
			n=n/2;
		length=length+1;
		}
		return length;
	}

}
