import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Queue<Integer> qu=new LinkedList<>();
		Queue<Integer> lw=new LinkedList<>();
		Queue<Integer> l=new LinkedList<>();
		Queue<Integer> rw=new LinkedList<>();
		Queue<Integer> r=new LinkedList<>();
		for(int i=1;i<=m&&i<=2*n;i++){
			if(i%2==1)
				lw.add(i);
			else
				rw.add(i);
		}
		for(int i=2*n+1;i<=m&&i<=4*n;i++){
			if(i%2==1)
				l.add(i);
			else
				r.add(i);
		}
		while(!l.isEmpty()||!r.isEmpty()||!rw.isEmpty()||!lw.isEmpty()){
			if(!l.isEmpty())
				qu.add(l.poll());
			if(!lw.isEmpty())
				qu.add(lw.poll());
			if(!r.isEmpty())
				qu.add(r.poll());
			if(!rw.isEmpty())
				qu.add(rw.poll());
		}
		while(!qu.isEmpty()){
			System.out.printf("%d ",qu.poll());
		}

	}

}
