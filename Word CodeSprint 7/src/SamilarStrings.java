import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SamilarStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		for(int i=0;i<q;i++){
			int li=sc.nextInt();
			int ri=sc.nextInt();
			String subString=s.substring(li-1, ri);
			int len=subString.length();
			int numOfSamilarString=0;
			int index=0;
			while(index+len<=s.length()){
				if(isSimilar(s.substring(index,index+len),subString,len)){
					numOfSamilarString++;
				}
				index++;
			}
			System.out.println(numOfSamilarString);
		}

	}

	private static boolean isSimilar(String substring, String subString2,int len) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=0;i<len;i++ ){
			for(int j=i;j<len;j++){

				if((substring.charAt(i)==substring.charAt(j)&&subString2.charAt(i)==subString2.charAt(j))||((substring.charAt(i)!=substring.charAt(j)&&subString2.charAt(i)!=subString2.charAt(j)))){
					flag=true;
				}else{
					
					return false;
				}
			}
		}
		return flag;
	}

}
