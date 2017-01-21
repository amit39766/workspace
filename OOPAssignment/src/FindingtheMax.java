import java.util.Scanner;

public class FindingtheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] array;
		System.out.print("Enter the size of array :" );
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		array=new float[size];
		System.out.println("Enter values for the array:");
		for(int i=0;i<size;i++){
			System.out.print("array["+i+"] :");
			array[i]=in.nextFloat();
		}
		float max=array[0];
		for(int i=0;i<size;i++){
			if(array[i]>max)max=array[i];
		}
		System.out.println("Maximum value of the array is: "+max);

	}

}
