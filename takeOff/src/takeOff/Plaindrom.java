package takeOff;

import java.util.Scanner;

public class Plaindrom {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				while(sc.hasNextLine()){
					StringBuffer str=new StringBuffer(sc.nextLine());
					int c1=0,c2=0,c3=0;
					int slen=str.length();
					String original=str.toString().trim();
					String strrev=str.reverse().toString().trim();
					if(strrev.equals(original)) {
						c1=1;
					}
					for(int i=0; i<slen; i++) {
					if(str.charAt(i)=='E'||str.charAt(i)=='3') {
						if(str.charAt(i)=='E')
							str.replace(i, i+1, "3");
						else
							str.replace(i, i+1, "E");
					} else if(str.charAt(i)=='J'||str.charAt(i)=='L') {
						if(str.charAt(i)=='J')
							str.replace(i, i+1, "L");
						else
							str.replace(i, i+1, "J");
					} else if(str.charAt(i)=='S'||str.charAt(i)=='2') {
						if(str.charAt(i)=='S')
							str.replace(i, i+1, "2");
						else
							str.replace(i, i+1, "S");
					} else if(str.charAt(i)=='Z'||str.charAt(i)=='5') {
						if(str.charAt(i)=='Z')
							str.replace(i, i+1, "5");
						else
							str.replace(i, i+1, "Z");
					}
				}
					String mStr=str.toString().trim();
					
					if(mStr.equals(original))
					c2=1;
					if(slen==1){
						char ch=original.charAt(0);
						if(!(ch=='A'||ch=='H'||ch=='I'||ch=='M'||ch=='O'||ch=='T'||ch=='U'||ch=='V'||ch=='W'||ch=='X'||ch=='Y'||ch=='1'||ch=='8'))
							c2=0;
					}
						
					if(c1==1&&c2==1)
						c3=1;
					if(c3==1)
						System.out.println(original+" -- is a mirrored palindrome.");
					else if(c2==1)
						System.out.println(original+" -- is a mirrored string.\n");
					else if(c1==1)
						System.out.println(original+" -- is a regular palindrome.\n");
					else
						System.out.println(original+" -- is not a palindrome.\n");
					
		}


	}

}
/**
 * Authour: Amit Chandra Sarkar
 * Diploma in Computer Technology
 * Dinajpur Polytechnic Institute
 * B.Sc in CSE
 * Daffodil International University
 * E-mail: amit39766@outlook.com
 * Mobile: 01740354545
 * 
 */
