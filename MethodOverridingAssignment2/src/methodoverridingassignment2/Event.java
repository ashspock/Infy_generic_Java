//lex_auth_012908097284579328502
//do not modify the above line

package methodoverridingassignment2;

public class Event {
	//Implement your code here
	private String eventName;
	private String participantName;
	private double registrationFee;
	public Event(String eventName, String participantName) {
		super();
		this.eventName = eventName;
		this.participantName = participantName;
	}
	public void registerEvent(){
		if(this instanceof SoloEvent){
			if(this.eventName.equals("Singing"))
				this.registrationFee=8.0;
			else if(this.eventName.equals("Dancing"))
				this.registrationFee=10.0;
			else if(this.eventName.equals("DigitalArt"))
				this.registrationFee=12.0;
			else if(this.eventName.equals("Acting"))
				this.registrationFee=15.0;
			else
				this.registrationFee=0.0;
		}
		else if(this instanceof TeamEvent){
			if(this.eventName.equals("Singing"))
				this.registrationFee=4.0;
			else if(this.eventName.equals("Dancing"))
				this.registrationFee=6.0;
			else if(this.eventName.equals("DigitalArt"))
				this.registrationFee=8.0;
			else if(this.eventName.equals("Acting"))
				this.registrationFee=10.0;
			else
				this.registrationFee=0.0;
		}
	}
		
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
			this.registrationFee = registrationFee;
	}
	
	
}
