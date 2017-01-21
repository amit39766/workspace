import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LuckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		Items it[]=new Items[N];
		for(int i=0;i<N;i++){
			it[i]=new Items(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(it);
		int k=K;
		int sumOfLuck=0;
		for(Items i:it){
			if(k!=0){
				sumOfLuck+=i.luck;
				k-=i.impot;
			}else if(i.impot==0){
				sumOfLuck+=i.luck;
			}
			else
				sumOfLuck-=i.luck;
		}
		System.out.println(sumOfLuck);
		

	}

}
class Items implements Comparable<Items>{
	int luck;
	int impot;
	Items(int l,int i){
		this.luck=l;
		this.impot=i;
	}
	@Override
	public int compareTo(Items o) {
		// TODO Auto-generated method stub
		if((o.luck+o.impot)>(this.luck+this.impot)) return 1;
		else if((o.luck+o.impot)<(this.luck+this.impot)) return -1;
		else 
			return 0;
	}
}
