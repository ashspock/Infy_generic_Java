package unit_test;

public class CheckArmstrong {
	public boolean checkArm(int n){
		int sum=0, num;
		num=n;
		while(n>0){
			int d=n%10;
			sum=sum+(d*d*d);
			n=n/10;
		}
		if(num==sum){
			return true;
		}
		else{
			return false;
		}
	}

}
