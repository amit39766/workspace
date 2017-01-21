package uvaOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class uva_102 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int bins[]=new int[9];
		String colors[]={"BGC","BCG","GBC","GCB","CGB","CBG"};
		int movements[]=new int[6];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String botols="";
		while((botols=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(botols," ");;
			for(int i=0;i<9;i++){
	
					bins[i]=Integer.parseInt(st.nextToken());

				
			}
			movements[0]=bins[1]+bins[2]+bins[3]+bins[5]+bins[6]+bins[7];//BGC
			movements[1]=bins[1]+bins[2]+bins[3]+bins[4]+bins[6]+bins[8];//BCG
			movements[2]=bins[0]+bins[2]+bins[4]+bins[5]+bins[6]+bins[7];//GBC
			movements[3]=bins[0]+bins[2]+bins[3]+bins[4]+bins[7]+bins[8];//GCB
			movements[4]=bins[0]+bins[1]+bins[3]+bins[5]+bins[7]+bins[8];//CGB
			movements[5]=bins[0]+bins[1]+bins[4]+bins[5]+bins[6]+bins[8];//CBG
			int min=Integer.MAX_VALUE;
			String binColor="";
			for(int j=0;j<6;j++){
				if(movements[j]<min){
					min=movements[j];
					binColor=colors[j];
				}
				else if(movements[j]==min){
					if(binColor.compareTo(colors[j])>0){
						binColor=colors[j];
					}
				}
			}
			System.out.println(binColor+" "+min);

			
		}
			
	}

}
