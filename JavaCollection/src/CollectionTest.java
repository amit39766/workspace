import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CollectionTest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int M,N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        sc.nextLine();
        BitSet B1=new BitSet(N);
        BitSet B2=new BitSet(N);
        sc.nextLine();
        for(int i=0;i<M;i++){
           /* String[] opt=sc.nextLine().split(" ");
            String operatorName= opt[0];
            int Left=Integer.parseInt(opt[1]);
            int Right=Integer.parseInt(opt[2]);
            */
            
            String operatorName=sc.next();
            int Left=sc.nextInt();
            int Right=sc.nextInt();
            if(operatorName.equalsIgnoreCase("AND")){
                if(Left==1){
                    B1.and(B2);
                }else{
                    B2.and(B1);
                }
                System.out.println(""+B1.cardinality()+" "+B2.cardinality());
            }
            else if(operatorName.equalsIgnoreCase("OR")){
                if(Left==1){
                    B1.or(B2);
                }else{
                    B2.or(B1);
                }
                System.out.println(""+B1.cardinality()+" "+B2.cardinality());
            }
            else if(operatorName.equalsIgnoreCase("XOR")){
                if(Left==1){
                    B1.xor(B2);
                }else{
                    B2.xor(B1);
                }
                System.out.println(""+B1.cardinality()+" "+B2.cardinality());
            }
            else if(operatorName.equalsIgnoreCase("FILP")){
                if(Left==1){
                    B1.flip(Right);
                }else{
                    B2.flip(Right);
                }
                System.out.println(""+B1.cardinality()+" "+B2.cardinality());
            }
            else {
                if(Left==1){
                    B1.set(Right);
                }else{
                    B2.set(Right);
                }
                System.out.println(""+B1.cardinality()+" "+B2.cardinality());
            }
            

        }
        
    }
}
