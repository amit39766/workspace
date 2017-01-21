import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CoPrimeCondonDram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            
        }

	}
    private static List<Integer> findFactors(int num)
    {
        int incrementer = 1;
        if (num % 2 != 0)
        {
            incrementer = 2; //only test the odd ones
        }
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= num / 2; i=i+incrementer)
        {
            if (num % i == 0)
            {
                list.add(i);
            }
        }
        list.add(num);
        return list;
    }

}
