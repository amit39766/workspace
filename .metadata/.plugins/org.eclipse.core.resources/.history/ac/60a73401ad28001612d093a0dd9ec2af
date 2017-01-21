import java.util.Arrays;

public class HighestFrequncy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 3, 6, 5, 6, 5, 5, 4, 9, 6, 5, 5, 4, 6, 5, 4, 22, 36, 25, 11, 22, 33, 66, 55, 44, 11, 2, 3,
				96, 47, 36, 58, 64, 36, 15, 66, 78, 2, 1, 9, 3, 4 };
		
		for (int a : array)
			System.out.print(a + " ");
		Arrays.sort(array);
		int maxfreq = 0;
		int frecounter = 0;
		int num = 0;
		
		for (int b = 0; b < array.length - 1; b++) {
			if (array[b] == array[b + 1]) {
				frecounter++;
				continue;
			}
			if (frecounter > maxfreq) {
				num = array[b];
				maxfreq = frecounter;
			}

			frecounter = 0;

		}
		System.out.println("\nThe Highest Freqence number is: " + num);

	}

}
