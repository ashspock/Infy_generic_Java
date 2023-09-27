//lex_auth_012908097284579328502
//do not modify the above line

package methodoverridingassignment2;

public class Event {
	private String eventName;
	private String participantName;
	private double registrationFee;
	
	public Event(String eventName, String participantName) {
		this.eventName = eventName;
		this.participantName = participantName;
	}
	
	public void registerEvent(){
			if(eventName.equals("Singing"))
				registrationFee=8.0;
			else if(eventName.equals("Dancing"))
				registrationFee=10.0;
			else if(eventName.equals("DigitalArt"))
				registrationFee=12.0;
			else if(eventName.equals("Acting"))
				registrationFee=15.0;
			else
				registrationFee=0.0;
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
