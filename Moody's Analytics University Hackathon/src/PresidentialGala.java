import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class PresidentialGala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Graph<Integer> kingdom=new Graph(false);
		ArrayList<Vertex<Integer>> al=new ArrayList<>();
		for(int i=1;i<=n;i++){
			Vertex v1=new Vertex(i);
			v1.setData(sc.nextInt());
			kingdom.addVertex(v1);
			al.add(v1);
		}
		
		for(int j=0;j<m;j++){
			kingdom.addEdge(sc.nextLong(), sc.nextLong());
		}
		al.sort(new Comparator<Vertex<Integer>>() {
			@Override
			public int compare(Vertex<Integer> o1, Vertex<Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getData()==o2.getData())  
					return 0;  
				else if(o1.getData()>o2.getData())  
					return 1;  
				else  
					return -1;  
			}
		});
		System.out.println(al);

	}
	

}
