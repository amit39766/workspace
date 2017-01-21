package amit.diu;
import java.util.*;
public class NumberOfRent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N,D,K;
		N=sc.nextInt();
		D=sc.nextInt();
		K=sc.nextInt();
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		Set<Integer> mst=new HashSet<>(); 
		//int cons[]=new int[K];
		for(int d=1;d<=D;d++){
			mst.add(d);
		}
		for(int n=0;n<N;n++){
			ArrayList<Integer> l=new ArrayList<>();
			l.add(sc.nextInt());
			l.add(sc.nextInt());
			al.add(l);
		}
		for(int k=0;k<K;k++){
			Set<Integer> st=new HashSet<>(mst); 
			int cons=sc.nextInt();
			int maxday=0;
			for(int i=0;i<al.size();i++){
				int temp=0;
				Set<Integer> set=new HashSet<>();
				for(int j=al.get(i).get(0);j<=al.get(i).get(1);j++){
					set.add(j);
					temp++;
				}
				if(temp>=cons){
					if(st.containsAll(set)){
						maxday+=temp;
						st.removeAll(set);
					}
				}
				
			}
			System.out.println(maxday);
		}
		
		

	}

}
