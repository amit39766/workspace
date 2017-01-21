package takeOff;

import java.util.*;
class CharFre{
	   private int frequecy;
	   private char ch;
	   public CharFre(int value, char ch) {
	      super();
	      this.frequecy =value;
	      this.ch=ch;

	   }
	   public int getFrequncy() {
	      return frequecy;
	   }
	   public char getChar() {
	      return ch;
	   }
	}

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		PriorityQueue<CharFre> csQ=new PriorityQueue<>(10, new Comparator<CharFre>() {
			@Override
			public int compare(CharFre o1, CharFre o2) {
				// TODO Auto-generated method stub
				if(o1.getFrequncy()<o2.getFrequncy())
					return 1;
				else if(o1.getFrequncy()==o2.getFrequncy()){
					int kv1=o1.getChar();
					int kv2=o2.getChar();
					return (kv1>kv2)?1:-1;
				}
				else
					return -1;
				
			}
		});
		while(n-->=0){
			String s=sc.nextLine();
			s=s.toUpperCase();
			         
			for(int i = 0; i < s.length(); i++){
			   char c = s.charAt(i);
			   Integer val = map.get(new Character(c));
			   if(val != null){
			     map.put(c, new Integer(val + 1));
			   }else{
			     map.put(c,1);
			   }
			}
			
		}
		sc.close();
		for(int i=65;i<91;i++){
			char ch=(char)i;
			if(map.get(ch) != null){
				CharFre chs=new CharFre(map.get(ch), ch);
				csQ.add(chs);
			}
		}
	      while(true) {
	          CharFre serve = csQ.poll();
	          if(serve == null) {
	              break;
	          }
	          System.out.println(serve.getChar()+" "+serve.getFrequncy());
	      }
				
	}

}
 