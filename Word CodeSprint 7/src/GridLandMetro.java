import java.util.*;

public class GridLandMetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		Set<String> st=new HashSet<>();
		int track=0;
		for(int i=0;i<k;i++){
            sc.nextLine();
			int r=sc.nextInt();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			for(int j=c1;j<=c2;j++){
				String str=r+" "+j;
				st.add(str);
			}
		}
		System.out.println((m*n)-st.size());

	}

}
