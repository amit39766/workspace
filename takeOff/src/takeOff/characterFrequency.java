package takeOff;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//uva 4
public class characterFrequency {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			while(sc.hasNextLine()){
				String strLine=sc.nextLine();
				Map<Character, Integer> map=new HashMap<Character,Integer>();
				Pattern pt=Pattern.compile("[a-zA-Z]");
				Matcher mt=pt.matcher(strLine);
				while(mt.find()){
					char ch=mt.group().charAt(0);
					Integer m=map.get(ch);
					m=(m==null)?1:++m;
					map.put(ch, m);
				}
				map=new TreeMap<>(map);
				Iterator<Map.Entry<Character, Integer>> i=map.entrySet().iterator();
				StringBuilder string=new StringBuilder();
				int comp=1;
				while(i.hasNext()){
					char key=i.next().getKey();
					if(map.get(key)>comp){
						string.delete(0, string.length());
						string.append(key);
						comp=map.get(key);
					}else if(map.get(key)==comp){
						string.append(key);
					}
					
				}
				System.out.println(string+" "+comp);
				
			}
			sc.close();
			
		}



}
