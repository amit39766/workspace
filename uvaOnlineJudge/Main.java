import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int fields=1;
		while(!(n==0&&m==0)){
			char[][] mines=new char[n+2][m+2];
			sc.nextLine();
			for(int i=1;i<=n;i++){
				char temp[]=sc.nextLine().toCharArray();
				for(int j=1;j<=m;j++){
					mines[i][j]=temp[j-1];
				}
			}
			for(int i=1;i<=n;i++){
				for(int j=1;j<=m;j++){
					if(mines[i][j]=='.'){
						mines[i][j]=addjacentMines(i,j,mines);
					}
				}
			}
			if(fields>1)System.out.println();
			System.out.println("Field #"+fields+++": ");
			for(int i=1;i<=n;i++){
				for(int j=1;j<=m;j++){
					System.out.printf("%c",mines[i][j]);
				}
				System.out.println();
			}
			//System.out.println();
			n=sc.nextInt();
			m=sc.nextInt();
			
			
		}


	}

	private static char addjacentMines(int i, int j, char[][] mines) {
		// TODO Auto-generated method stub
		int mineCounter=0;
		if(mines[i-1][j-1]=='*')mineCounter+=1;
		if(mines[i-1][j]=='*')mineCounter+=1;
		if(mines[i-1][j+1]=='*')mineCounter+=1;
		if(mines[i][j-1]=='*')mineCounter+=1;
		if(mines[i][j+1]=='*')mineCounter+=1;
		if(mines[i+1][j-1]=='*')mineCounter+=1;
		if(mines[i+1][j]=='*')mineCounter+=1;
		if(mines[i+1][j+1]=='*')mineCounter+=1;
		String ch=""+mineCounter;
		return ch.charAt(0);
	}

}
