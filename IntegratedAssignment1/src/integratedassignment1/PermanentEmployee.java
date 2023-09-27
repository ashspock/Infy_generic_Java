//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class PermanentEmployee extends Employee {
	private double basicPay;
	private String[] salaryComponents;
	private float experience;
	private Asset[] assets;
	public PermanentEmployee(String employeeName, double basicPay, String[] salaryComponents, Asset[] assets) {
		super(employeeName);
		this.basicPay = basicPay;
		this.salaryComponents = salaryComponents;
		this.assets = assets;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public String[] getSalaryComponents() {
		return salaryComponents;
	}
	public void setSalaryComponents(String[] salaryComponents) {
		this.salaryComponents = salaryComponents;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public Asset[] getAssets() {
		return assets;
	}
	public void setAssets(Asset[] assets) {
		this.assets = assets;
	}
	public double calculateBonus(float experience)throws Exception {
		try{
			if(experience>=2.5 && experience<4)
				return 2550;
			else if(experience>=45 && experience<8)
				return 5000;
			else if(experience>=8 && experience<12)
				return 8750;
			else if(experience>=12)
				return 13000;
			else
				throw new InvalidExperienceException("A minimum of 2.5 years is required for bonus!");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return 0 ;
		
	}
	public void calculateSalary(float experience) throws Exception{
		this.experience=experience;
		float hra=0.0f;
		float da=0.0f;
		double bonus=0;
		for(String str:salaryComponents) {
			if(str.substring(0,3).equals("HRA"))
					hra=Integer.parseInt(str.substring(4,6));
			if(str.substring(0,2).equals("DA"))
					da=Integer.parseInt(str.substring(3, 5));
		}
		try{
			bonus=calculateBonus(experience);
		}
		catch(Exception e) {
			bonus=0;
		}
		this.setSalary(Math.round(basicPay*(1+(da/100)+(hra/100))+bonus));
	}
	public Asset[] getAssetByDate(String lastDate)throws Exception {
		Asset[] approvedAsset = new Asset[assets.length];
		int i=0;
		for(Asset str:assets) {
			if(Integer.parseInt(lastDate.substring(0, 4)) <= Integer.parseInt(str.getAssetExpiry().substring(0, 4))){
				if(Resources.getMonth(lastDate.substring(5, 7)) <= Resources.getMonth(str.getAssetExpiry().substring(5, 7))) {
					approvedAsset[i].setAssetId(str.getAssetId());
					approvedAsset[i].setAssetName(str.getAssetName());
					approvedAsset[i].setAssetExpiry(str.getAssetExpiry());
					//continue;
					i++;
				}
			}
			else
				continue;
		}
		try {
			if(approvedAsset[0]!=null)
				return approvedAsset;
			else
				throw new InvalidAssetsException("No essets found for the given criteria!");
		}
		catch( InvalidAssetsException ee) {
			System.out.println(ee.getMessage());
	}
		return null;
	}
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Basic Pay: "+getBasicPay()+", Salary Components: "+getSalaryComponents()+", Assets: "+getAssets();
	}
}























