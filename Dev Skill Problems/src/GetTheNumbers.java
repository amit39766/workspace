import java.util.ArrayList;
import java.util.Scanner;

public class GetTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=1;t<=T;t++){
			int n=sc.nextInt();
			sc.nextLine();
			String mobile[]=new String[n];
			for(int a=0;a<n;a++){
				mobile[a]=sc.nextLine();
			}
			ArrayList<String> success=new ArrayList<>();
			ArrayList<String> fails=new ArrayList<>();
			// String num[]=new String[n];
			//String status[]=new String[n];
			for(int a=0;a<n;a++){
				String str[]=sc.nextLine().split(",");
				if(str[1].equals("Success")){
					success.add(str[0]);
				}else{
					fails.add(str[0]);
				}
			}
			System.out.println("Case: "+t);
			System.out.println("Success list");
			for(int j=0;j<success.size();j++){
					String hnum=success.get(j);
					String number="";
					String parts[]=hnum.split("\\*\\*\\*\\*");
					String regex=parts[0]+".+"+parts[1];
					int counter=0;
					for(int k=0;k<n;k++){
						if(mobile[k].matches(regex)){
							number=mobile[k];
							counter++;
							if(counter>1){
								number="Confused";
								break;
							}
							
						}
					}

					System.out.println(hnum+" : "+number);
					
				}
			System.out.println("Failed list");
			for(int j=0;j<fails.size();j++){
				String hnum=fails.get(j);
				String number="";
				String parts[]=hnum.split("\\*\\*\\*\\*");
				String regex=parts[0]+".+"+parts[1];
				int counter=0;
				for(int k=0;k<n;k++){
					if(mobile[k].matches(regex)){
						number=mobile[k];
						counter++;
						if(counter>1){
							number="Confused";
							break;
						}
						
					}
				}

				System.out.println(hnum+" : "+number);
				
			}
			if(t<T)
			sc.nextLine();
		}

	}

}

