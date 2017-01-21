import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class InputGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nn=sc.nextInt();
		int ne=sc.nextInt();
		sc.nextLine();
		ArrayList<Integer>[] edgs = new  ArrayList[10000] ;
		ArrayList<Integer>[] cost=new ArrayList[100000];
		for(int i=1;i<=ne;i++){
			int x,y;
			x=sc.nextInt();
			y=sc.nextInt();
			int l=sc.nextInt();
			edgs[x].add(y);
			edgs[y].add(x);
			cost[x].add(l);
			cost[y].add(l);
			sc.nextLine();
		}
		for(int i=1;i<=nn;i++){
			System.out.print(i+">>");
			for(int j=0;j<edgs[i].size();j++)
				System.out.print(edgs[i].get(j)+">>");
			System.out.println("X");
		}
		

	}

}
