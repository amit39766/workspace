import java.util.Scanner;

public class uri_2242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer ss=new StringBuffer(sc.nextLine());
		StringBuilder sv=new StringBuilder();
		for(int i=0;i<ss.length();i++){
			char ch=ss.charAt(i);
			if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e') sv.append(ch);
		}
		String vw=sv.toString().trim();
		String rs=sv.reverse().toString().trim();
		System.out.println(vw.compareTo(rs)==0?'S':'N');

	}

}
