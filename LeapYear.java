import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = in.nextInt();
		System.out.print(isLeapYear(year));
		
	}
	public static boolean isLeapYear(int year){
		boolean leap;
		if (year%400==0)
			leap = true;
		else if (year%100==0)
			leap = false;
		else if (year%4==0)
			leap = true;
		else
			leap = false;
		return leap;
	}
}
