package amit.diu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ProblemE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int t=1;t<=T;t++){
			String str=sc.nextLine();
			ArrayList<Character > chList=new ArrayList<>();
			ArrayList<Character> plaindrom=new ArrayList<>();
			for(int i=0;i<str.length();i++){
				chList.add(str.charAt(i));
			}
			for(int j=0;j<chList.size()-1;){
				boolean flag=false;
				for(int k=j+1;k<chList.size();k++){
					if(chList.get(j)==chList.get(k)){
						plaindrom.add(chList.get(j));
						chList.remove(k);
						chList.remove(j);
						flag=true;
						break;
					}
				}
				if(!flag)
					j++;
			}
			if(chList.isEmpty()||chList.size()==1){
				Collections.sort(plaindrom);
				String left="";
				String right="";
				for(int s=0;s<plaindrom.size();s++){
					left+=plaindrom.get(s);
				}
				for(int z=plaindrom.size()-1;z>=0;z--){
					right+=plaindrom.get(z);
				}
				if(chList.isEmpty()){
					System.out.println("Case "+t+": "+left+right);
				}
				else
				System.out.println("Case "+t+": "+left+chList.get(0)+right);
			}
			else
				System.out.println("impossible");
		}

	}

}
