import java.util.Scanner;

public class CamelWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int words=1;
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))) words++;
		}
		System.out.println(words);

	}

}
