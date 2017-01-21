import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		Stack<Integer>sn1=new Stack<>();
		Stack<Integer>sn2=new Stack<>();
		Stack<Integer>sn3=new Stack<>();
		for(int i=0;i<n1;i++){
			int in=sc.nextInt();
			sn1.push(in);
		}
		for(int i=0;i<n2;i++){
			int in=sc.nextInt();
			sn2.push(in);
		}
		for(int i=0;i<n3;i++){
			int in=sc.nextInt();
			sn3.push(in);
		}
		int he[]={sumOfStack(sn1),sumOfStack(sn2),sumOfStack(sn3)};
		
		while(greIndex(he[0],he[1],he[2])!=-1){
			int x=greIndex(he[0],he[1],he[2]);
			if(x==0){
				he[0]-=sn1.remove(0);
			}
			else if(x==1){
				
				he[1]-=sn2.remove(0);
			}
				
			else{				
				he[2]-=sn3.remove(0);
			}
				
		
		}
		System.out.println(he[0]);
		

	}
	public static int sumOfStack(Stack<Integer> st){
		int sum=0;
		for(int s:st){
			sum+=s;
		}
		return sum;
	}
	
	public static int greIndex(int x,int y,int z){

	      if ( x > y && x > z )
	         return 0;
	      else if ( y > x && y > z )
	         return 1;
	      else if ( z > x && z > y )
	         return 2;
	      else   
	         return -1;
	}
	public static int greIndex(int x,int y){

	      if ( x > y  )
	         return 0;
	      else if ( y > x )
	         return 1;
	      else   
	         return -1;
	}

}

