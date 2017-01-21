package takeOff;

import java.util.Scanner;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String strLine=new String();
		while(sc.hasNextLine()){
			String[] str=sc.nextLine().split("!");
			for(int c=0;c<str.length;c++){
				int fre=0;
				for(int k=0;k<str[c].length();k++){
					char ch=str[c].charAt(k);
					if(ch>48&&ch<58){
						fre+=Integer.parseInt(String.valueOf(ch));
						continue;
					}
					
					else{
							for(int m=0;m<fre;m++){
								System.out.print((ch!='b')?ch:' ');
								
						}
							fre=0;
					}
				}
				System.out.println();
			}
		}

	}

}
