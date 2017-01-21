package modon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			String str=sc.nextLine();
			
			
		}

	}
	public static boolean isFloat( String input,int rex ) {
	    try {
	        Integer.parseInt( input,rex );
	        return true;
	    }
	    catch( Exception e ) {
	        return false;
	    }
	}

}
