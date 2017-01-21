import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitWiseOR {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int counter=0;
        for(int j=0;j<=n;j++){
            if((n+j)==(n^j)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
