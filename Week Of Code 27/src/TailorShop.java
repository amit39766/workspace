import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TailorShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		Set<Integer> used=new HashSet<>();
		int expenses[]=new int[n];
		for(int i=0;i<n;i++){
			expenses[i]=sc.nextInt();
		}
		//Arrays.sort(expenses);
		int numBtn=0;
		used.add(0);
		for(int i=0;i<n;i++){
			int reminder=expenses[i]%p;
			int dividen=expenses[i]/p;
	
			if(reminder==0){
				while(used.contains(dividen)){
					dividen=dividen+1;
					}
					used.add(dividen);
					numBtn+=dividen;
				}
				else{
					expenses[i]+=p-reminder;
					dividen=expenses[i]/p;
					while(used.contains(dividen)){
						dividen=dividen+1;
						}
					used.add(dividen);
					numBtn+=dividen;
				}
				
			}

		System.out.println(numBtn);
		

	}

}
