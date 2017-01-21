package amit.diu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FifthSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<N;i++){
			String str=sc.nextLine();
			char[] charray=str.toCharArray();
			ArrayList<Character> chList=new ArrayList<>();
			for(char c:charray){
				chList.add(c);
			}
			String center="";
			char [] plaindrome=new char[charray.length];
			for(int k=0;k<chList.size()-1;){
				boolean flag=false;
				for(int m=k+1;m<chList.size();m++){
					
		
						if(chList.get(k)==chList.get(m)){
							plaindrome[k]=chList.get(k);
							chList.remove(k);
							chList.remove(m-1);
							flag=true;
							break;

						}
						
					
					
					
				}
				if(!flag)
					k++;

				
			}
			if(chList.size()==1||chList.size()==0){
				Arrays.sort(plaindrome);
				int len=plaindrome.length;
				String left="";
				for(int h=0;h<len;h++){
					left+=plaindrome[h];					
				}
				StringBuffer st=new StringBuffer(left);
				String strr=st.reverse().toString();
				if(chList.size()==0)
				System.out.println("Case "+(i+1)+": "+left+strr);
				else
					System.out.println("Case "+(i+1)+": "+left+chList.get(0)+strr);
			}
			else{
				System.out.println("impossible");
			}
			
			
		}

	}

}
