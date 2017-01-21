import java.util.Scanner;

public class HikingSelfies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		long possibleCombination=n;
		for(int i=2;i<=n;i++){
			possibleCombination+=Fact(n)/(Fact(n-i)*Fact(i));
		}
		System.out.println((x>=possibleCombination)?(x-possibleCombination):(possibleCombination-x));

	}
	public static long Fact(int n)
    {
        long f=1;

        for(int i=n;i>=1;i--)
        {
        f*=i;
        }

    return f;
    }
}
