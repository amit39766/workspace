package uvaOnlineJudge;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char name[]={'A','M','I','T'};
		printAllSubsets(name);

	}
	 private static void printAllSubsets(char set[]){
		int n=set.length;
		int number_of_subsets=1<<n;
		for(int i=0;i<number_of_subsets;i++){
			System.out.print("{ ");
			for(int j=0;j<n;j++){
				if((i&(1<<j))>0){
					System.out.print(set[j]+" ");
				}
				
			}
			System.out.println("}");
		}
	}

}
