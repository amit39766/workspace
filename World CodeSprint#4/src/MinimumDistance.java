import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MinimumDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		sc.nextLine();
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=0;i<n;i++){
			A[i]=sc.nextInt();
		}
		for(int k=0;k<n;k++){
			for(int m=0;m<n;m++){
				if(k!=m&&A[k]==A[m]){
					list.add(Math.abs(k-m));
				}
					
			}
		}
		if(list.isEmpty()){
			System.out.println("-1");
		}
		else{
			Collections.sort(list);
			System.out.println(list.getFirst());
		}

	}

}
