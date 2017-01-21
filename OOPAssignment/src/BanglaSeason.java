import java.util.Scanner;

public class BanglaSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		String[] months = { "", "Boishakh", "Joishtho", "Ashar", "Shrabon", "Bhadro", "Ashshin", "Kartrik", "Ogrohayon",
				"Poush", "Magh", "Phalgun", "Choitro" };
		String season;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Enter the month: ");
			month = in.nextInt();
			switch (month) {
			case 1:
			case 2:
				season = "Greeshshokal(Summer)";
				break;
			case 3:
			case 4:
				season = "Barshakal(Rainy Season)";
				break;
			case 5:
			case 6:
				season = "Shorotkal(Autumn)";
				break;
			case 7:
			case 8:
				season = "Hemontokal(Fall)";
				break;
			case 9:
			case 10:
				season = "Sheetkal(Winter)";
				break;
			case 11:
			case 12:
				season = "Boshontokal(Spring)";
				break;

			default:
				season = "Bogus Month";
				months[0]+=month;
				month=0;
				break;
			}
			System.out.println(months[month] + " is in the " + season + " .");
			months[0]="";

		}
	}

}
