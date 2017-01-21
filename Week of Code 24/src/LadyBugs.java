import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LadyBugs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner in = new Scanner(System.in);
	        int Q = in.nextInt();
	        
	        for(int a0 = 0; a0 < Q; a0++){
	            int n = in.nextInt();
	            in.nextLine();
	            ArrayList<Character> keys=new ArrayList<>();
	            Map<Character,Integer> cmaps=new HashMap<>();
	            String str=in.nextLine();
	            char [] ch=str.toCharArray();
	            boolean flag=false;
	            if(str.matches("^_*_$")){
	            	flag=true;
	            }
	            else if(str.matches(".*_.*")){
	            	for(int i=0;i<n;i++){
	            		char key=ch[i];
	            		if(key!='_'){
	            			if(cmaps.containsKey(key)){
	            				cmaps.put(key,1+cmaps.get(key));
	            			}else{
	            				keys.add(key);
	            				cmaps.put(key, 1);
	            			}
	            		}
	            	}
	            	for(char key:keys){
	            		if(cmaps.get(key)==1){
	            			flag=false;
	            			break;
	            		}
	            		else{
	            			flag=true;
	            		}
	            	}
	            	
	            }else{
	            	for(int i=0;i<n-1;i++){
	            		char key=ch[i];
	            		if(i==0){
	            			if(key==ch[1])continue;
	            			break;
	            		}
	            		if(key==ch[i-1]||key==ch[i+1]){
	            			flag=true;
	            		}
	            		else {
	            			flag=false;
	            			break;
	            		}
	            	}
	            	flag=flag&&(ch[n-1]==ch[n-2]);
	            }
	            	System.out.println(flag?"YES":"NO");
	            
	        }
	        
	    }


}
