//lex_auth_012909125609562112532
//do not modify the above line

package arrayassignment3;

public class Tester {

	public static int[] findLeapYears(int year) {
		int years[]=new int[15];
		int i=0;
		while(i<years.length){
			if(year%4==0){
				if(year%100==0){
					if(year%400==0){
						years[i]=year;
						++year;++i;
						continue;
					}
					else{
						++year;
						continue;
					}
				}
				else{
					years[i]=year;
					++year;++i;
					continue;
				}
			}
			else{
				++year;
			}
		}
		return years;
	}

	public static void main(String[] args) {
		int year = 1684;
		int[] leapYears;
		leapYears = findLeapYears(year);
		for (int index = 0; index < leapYears.length; index++) {
			System.out.println(leapYears[index]);
		}
	}
}
