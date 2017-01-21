import java.util.HashSet;
import java.util.Scanner;

public class StringConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++){
			String s=sc.nextLine();
			HashSet<Character> st=new HashSet<>();
			st.add(s.charAt(0));
			//int cost=1;
			for(int j=1;j<s.length();j++){
				Character ch=s.charAt(j);
				if(!st.contains(ch)){
					st.add(ch);
				}
			}
			System.out.println(st.size());
			
		}
		
		

	}

}
