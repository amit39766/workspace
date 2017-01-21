import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class ProblemD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++ ){
			int l=sc.nextInt();
			int r=sc.nextInt();
			Queue<Integer> lq=new LinkedList<>();
			Queue<Integer>rq =new LinkedList<>();
			for(int i=0;i<l;i++){
				lq.add(sc.nextInt());
			}
			for(int i=0;i<r;i++){
				rq.add(sc.nextInt());
			}
			long waiting=0;
			int last=((rq.peek()<lq.peek())?lq.poll():rq.poll());
			while(!(rq.isEmpty()&&lq.isEmpty())){
				if(!(rq.isEmpty()||lq.isEmpty())){
					if(rq.peek()<lq.peek()){
						waiting+=lq.poll();
					}
					else waiting+=rq.poll();
				}else if(rq.isEmpty()){
					waiting+=lq.poll();
				}
				else waiting+=rq.poll();
				
				
			}
			System.out.println("Case "+(t+1)+": "+(waiting));
			
		}

}
}
