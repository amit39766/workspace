package amit.diu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class AliagnLanguage {

 public static void main(String[] args) {
 try {
   Scanner sc=new Scanner(System.in);
   String[] arr = sc.nextLine().split(" ");
   int numOfWords = Integer.parseInt(arr[1]);
   int numOfPatterns = Integer.parseInt(arr[2]);
   
   List<String> wordList = new ArrayList<String>();
   for(int i =0; i < numOfWords; i++)
    wordList.add(sc.nextLine());
   
   List<Pattern> patternList = new ArrayList<Pattern>();
   for(int i =0; i < numOfPatterns; i++)
    patternList.add(Pattern.compile( sc.nextLine().replace('(', '[').replace(')', ']')));
   int index = 0;
   for(Pattern p : patternList)
   {
    index++;
    int count = 0;
    for(String word : wordList)
    {
     Matcher m = p.matcher(word);
     if(m.matches())
      count++;
    }
    System.out.println("Case " + index + ": " + count);
   }
  } catch (Exception e) {
   e.printStackTrace();
  }
}
}