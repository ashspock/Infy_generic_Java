//lex_auth_012908260248895488520
//do not modify the above line

package staticassignment2;

public class Participant {
	
	 //Implement your code here
	
	private static int counter;
	private String registrationId;
	private String name;
	private long contactNumber;
	private String city;
	
	public Participant(String name, long contactNumber, String city)
	{
		this.name=name;
		this.city=city;
		this.contactNumber=contactNumber;
		Participant.counter=1001;
		this.registrationId="D";
	}

	public static int getCounter() {
		return Participant.counter;
	}

	public static void setCounter(int counter) {
		Participant.counter = Participant.counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegistrationId() {
		return registrationId=registrationId+Participant.counter++;
	}
	

}
