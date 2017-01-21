import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class circalball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		long n,m;
		long t;
		String nmt[]=sc.nextLine().split(" ");
		n=Integer.parseInt(nmt[0]);
		m=Integer.parseInt(nmt[1]);
		t=Long.parseLong(nmt[2]);
		char[] c=new char[(int) n];
		for(int i=0;i<n;i++){
			String pc[]=sc.nextLine().split(" ");
			int pos=Integer.parseInt(pc[0]);
			char c1=pc[1].charAt(0);
			map.put(c1,pos );
		}
		Map<Character,Integer> sortmap=sortByValue(map);
		for(int i=0;i<4;t++  ){}

	}
	public static <Character, Integer extends Comparable<? super Integer>> Map<Character, Integer> 
    sortByValue( Map<Character, Integer> map )
{
      Map<Character,Integer> result = new LinkedHashMap<>();
     Stream <Entry<Character,Integer>> st = map.entrySet().stream();

     st.sorted(Comparator.comparing(e -> e.getValue()))
          .forEachOrdered(e ->result.put(e.getKey(),e.getValue()));

     return result;
}

}
