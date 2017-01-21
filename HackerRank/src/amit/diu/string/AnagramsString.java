package amit.diu.string;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class AnagramsString {

static boolean isAnagram(String a, String b) {
	a=a.toLowerCase();
	b=b.toLowerCase();
	char [] ca=a.toCharArray();
	char [] cb=b.toCharArray();
	Arrays.sort(ca);
	Arrays.sort(cb);
	return Arrays.equals(ca, cb);
	
        
    }
  
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
