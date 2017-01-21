package uvaOnlineJudge;

import java.io.IOException;
import java.util.*;

public class uva272 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //Scanner sc=new Scanner(System.in);
        String str = null;
        char cH;
        while((cH= (char) System.in.read())!=-1){
            str+=cH;
        }
        char[] charArr=str.toCharArray();
        for(int i=0,c=0;i<charArr.length;i++,c++){
            if(charArr[i]=='"'&& (c%2)==0){
                System.out.print("``");
            }
            else if(charArr[i]=='"'){
                System.out.print("''");
            }
            else
                System.out.print(charArr[i]);
            
            
                
        }

    }

}
