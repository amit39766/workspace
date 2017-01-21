import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatXoR{

    public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner sc=new Scanner(System.in);
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String str=sc.readLine();
        StringTokenizer stk=new StringTokenizer(str, " ");
        int n=Integer.parseInt(stk.nextToken());
        long m=Long.parseLong(stk.nextToken());
        Long matx[]=new Long[n];
        Long[] maty;
        String num=sc.readLine();
        stk=new StringTokenizer(num, " ");
        for(int i=0;i<n;i++){
           matx[i]=Long.parseLong(stk.nextToken());
        }
        ArrayList<String> strList=new ArrayList<>();
        int start=0;
        boolean flag=false;
        for(long i=1;i<m;i++){
        	maty=new Long[n];
        	StringBuilder pattern=new StringBuilder();
            for(int j=0;j<n-1;j++){
                	maty[j]=(matx[j]^matx[j+1]);
                    pattern.append(maty[j]+" ");
            }
            //System.out.println();
            maty[n-1]=(matx[n-1]^matx[0]);
            pattern.append(maty[n-1]);
            String patt=pattern.toString();
            if(strList.contains(patt)){
            	start=strList.indexOf(patt);
            	flag=true;
            	break;
            }else{
            	strList.add(patt);
            }
            matx=maty;
        }
        int sze=strList.size()-start;
        if((m-start)%sze==0||!flag){
//        	 for(int j=0;j<n;j++){
//                 System.out.print(matx[j]+" ");
//             }
//             System.out.println();
        	if(flag)
        	System.out.println(strList.get(start));
        	else System.out.println(strList.get(strList.size()-1));
        }else{
        	int index=(int)(m-start)%sze;
        	System.out.println(strList.get(index+start-1));
        	
        	}
        	
        }
       
    }
