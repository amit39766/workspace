package takeOff;
import java.util.*;

public class encodedecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()){
			String line=sc.nextLine();
			StringBuilder string = new StringBuilder();	
			String str="";
			for(int i=0;i<line.length();){
				//char dist[]=new char[3];
				
				if(Character.isDigit((line.charAt(i)))){
					String sb=new StringBuilder(line).reverse().toString();
					if(Integer.valueOf(String.valueOf((sb.charAt(i))))>1){
						String dist=sb.substring(i, (i+2));
						int ch=(Integer.parseInt(dist));
						str+=(Character.toString((char) ch));
						i=i+2;
					}
					else{
						String dist=sb.substring(i, i+3);
						int ch=(Integer.parseInt(dist));
						str+=(Character.toString((char) ch));
						i=i+3;
					}
			
			}
			else{	
				int c=line.charAt(i++);
				string.append(c);
				}
		}
			if(Character.isDigit((line.charAt(0)))){
				System.out.println(str);
			}
			else{
			StringBuilder result=string.reverse();
			System.out.println(result.toString());
			}
	
		

	}

}
}
