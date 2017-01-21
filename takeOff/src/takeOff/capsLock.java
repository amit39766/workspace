package takeOff;

import java.util.Scanner;

public class capsLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
			char [] strChar=str.toCharArray();
			boolean a=false;
			boolean b=false;
			boolean fob=Character.isLowerCase(strChar[0]);
			for(int i=0;i<strChar.length;i++){
				a=false;
				if(Character.isUpperCase(strChar[i])){
					a=true;
				}
				else
					break;
				
			}
			if(fob)
			for(int i=1;i<strChar.length;i++){
				b=false;
				if(Character.isUpperCase(strChar[i])){
					b=true;
				}
				else
					break;
			}
			if(a==true){	
			//strChar[0]=Character.toUpperCase(strChar[0]);
			for(int j=0;j<strChar.length;j++)
				strChar[j]=Character.toLowerCase(strChar[j]);
			System.out.println(strChar);
			} else if(b==true){
				strChar[0]=Character.toUpperCase(strChar[0]);
				for(int j=1;j<strChar.length;j++)
					strChar[j]=Character.toLowerCase(strChar[j]);
				System.out.println(strChar);
			}
			else if(strChar.length==1)
				System.out.println(""+Character.toUpperCase(strChar[0]));
			else 
				System.out.println(strChar);

	}

}
