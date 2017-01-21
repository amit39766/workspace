package takeOff;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class uva492 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			String strLine=new String(sc.nextLine());

			Pattern pt=Pattern.compile("[a-zA-Z]+");
			Pattern apt=Pattern.compile("[^a-zA-Z]+");
			Matcher amt=apt.matcher(strLine);
			Matcher mt=pt.matcher(strLine);
			ArrayList<String> strmt=new ArrayList<>();
			ArrayList<String> stramt=new ArrayList<>();
			int i=0;
			boolean  which=Character.isAlphabetic(strLine.charAt(0));
			while(mt.find()){
				char ch=mt.group().charAt(0);
				if(ch=='a'||ch=='u'||ch=='o'||ch=='e'||ch=='i'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
					strmt.add(mt.group()+"ay");					
				}
				else{
					String str=mt.group();
					if(str.length()>1){
						String strBuild=str.substring(1);
						strmt.add(strBuild+ch+"ay");
					}
					else
						strmt.add(ch+"ay");
					
					
				}
				i=i+1;
			}
			i=0;
			while(amt.find()){
				stramt.add(amt.group());
			}
			int k=0,m=0;
			if(which){
				for(int c=0;c<stramt.size()||c<strmt.size();c++){
				if(k<strmt.size())
				System.out.print(strmt.get(k++));
				if(m<stramt.size())
				System.out.print(stramt.get(m++));
				}
			}
			else{
				for(int c=0;c<stramt.size()||c<strmt.size();c++){
				if(m<stramt.size())
				System.out.print(stramt.get(m++));
				if(k<strmt.size())
				System.out.print(strmt.get(k++));
				}
			}
				System.out.println();
		}
			
		

		}


}
