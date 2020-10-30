package co.jallain;

public class LeapYears {

	public static boolean check(int année) {
		return année % 400 == 0 ? true : année % 100 == 0 ? false : année % 4 == 0 ? true : false;
	}

}
