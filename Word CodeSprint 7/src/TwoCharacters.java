import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<Character> cs=new HashSet<>();
		
		sc.nextLine();
		String st=sc.nextLine();		
//		for(int i=1;i<st.length();i++){
//			if(st.charAt(i-1)==st.charAt(i)){
//				st=st.replaceAll(""+st.charAt(i), "");
//				i=0;
//			}
//		}
		
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)cs.add(ch[i]);
		Object[] uch=cs.toArray();
		String temp=st;
		int maxlen=0;
		for(int i=0;i<uch.length;i++){
			for(int j=i+1;j<uch.length;j++){
				for(int k=0;k<uch.length;k++){
					if(k!=i&&k!=j){
						char c=(Character)uch[k];
						temp=temp.replaceAll(""+c, "");
					}
						
				}
				char c1=(Character)uch[i];
				char c2=(Character)uch[j];
				String mst=c1+""+c2;
				String nst=c2+""+c1;
				String regex=String.format("^(%s|%s)+(%s|%s){0,1}$",mst,nst,c1,c2);
				if(temp.matches(regex)){
					if(maxlen<temp.length()){
					maxlen=temp.length();	
					}
				}
				temp=st;

			}
		}

		System.out.println(maxlen);
		

	}

}
