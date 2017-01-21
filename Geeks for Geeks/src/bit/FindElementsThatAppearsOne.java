package bit;

import java.util.Scanner;

public class FindElementsThatAppearsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int numbers[]=new int[N];
		for(int i=0;i<N;i++ ){
			numbers[i]=sc.nextInt();
		}
		System.out.println("The single occurance nubmer is: "+getSingle(numbers, N));

	}
	private static int getSingle(int[] arr, int n)
	{
	    // Initialize result
	    int result = 0;
	 
	    int x, sum;
	 
	    // Iterate through every bit
	    for (int i = 0; i < 32; i++)
	    {
	      // Find sum of set bits at ith position in all
	      // array elements
	      sum = 0;
	      x = (1 << i);
	      for (int j=0; j< n; j++ )
	      {
	          if ((arr[j] & x)==1)
	            sum++;
	      }
	 
	      // The bits with sum not multiple of 3, are the
	      // bits of element with single occurrence.
	      if (sum % 3!=0)
	        result |= x;
	    }
	 
	    return result;
	}

}