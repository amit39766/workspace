import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ns=n*n;
		long hacc[]=new long[ns*ns+1];
		ArrayList<Long>sc
		hacc[1]=1;hacc[2]=2;hacc[3]=3;
		for(int i=4;i<=ns*ns;i++){
			hacc[i]=hacc[i-1]+2*hacc[i-2]+3*hacc[i-3];
		}
		boolean matrix[][]=new boolean[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int ij=(i+1)*(i+1)*(j+1)*(j+1);
				if(hacc[ij]%2==0)matrix[i][j]=true;
				else matrix[i][j]=false;
			}
		}
		int diff[]=new int[4];
		boolean temp[][]=new boolean[n][n];
		temp=rotateMatrix(matrix);
		int counter=0;
		for(int c=0;c<n;c++){
			for(int d=0;d<n;d++){
				if(temp[c][d]!=matrix[c][d])counter++;
			}
			}	
		diff[1]=counter;
		counter=0;
		temp=rotateMatrix(temp);
		for(int c=0;c<n;c++){
			for(int d=0;d<n;d++){
				if(temp[c][d]!=matrix[c][d])counter++;
			}
		}	
		diff[2]=counter;
	
		counter=0;	
		temp=rotateMatrix(temp);
		
		for(int c=0;c<n;c++){
			for(int d=0;d<n;d++){
				if(temp[c][d]!=matrix[c][d])counter++;
			}
		}	
		diff[3]=counter;
		diff[0]=0;

		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int deg=sc.nextInt();
			int angle=(deg/90)%4;
			
		System.out.println(diff[angle]);
		}
	}
	public static boolean[][] rotateMatrix(boolean matrix[][]){
		//boolean matx[][]=matrix;
		//while(deg--!=0){
			int row=matrix.length;
			boolean temp[][]=new boolean[row][row];
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					temp[i][j]=matrix[row-j-1][i];
				}
			}
		
		
		return temp;
	}


}

