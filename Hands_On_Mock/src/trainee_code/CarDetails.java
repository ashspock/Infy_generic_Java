package trainee_code;

public class CarDetails {
	private static String[] carTypeArr = {"Hatch-back","Sedan","SUV"};
	private static int[] perDayRentsArr = {3500,5000,6000};
	
	public static int identifyPerDayRent(String carType) {
		int i=0;
		for(String s : carTypeArr) {
			if(s.equals(carType)) {
				return CarDetails.perDayRentsArr[i];
			}
			else {
				i++;
				s="";
			}
		}
		return -1;
	}
}
