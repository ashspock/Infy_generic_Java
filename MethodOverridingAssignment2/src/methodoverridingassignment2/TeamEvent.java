//lex_auth_012908097284579328502
//do not modify the above line

package methodoverridingassignment2;

public class TeamEvent extends Event {
	
	private int noOfParticipant;
	private int teamNo;
	public TeamEvent(String eventName, String participantName, int noOfParticipant, int teamNo) {
		super(eventName, participantName);
		this.noOfParticipant = noOfParticipant;
		this.teamNo = teamNo;
	}
	public void registerEvent(){
		if (noOfParticipant>1) {
			if(super.getEventName().equals("Singing"))
				super.setRegistrationFee(noOfParticipant*4.0);
			else if(super.getEventName().equals("Dancing"))
				super.setRegistrationFee(noOfParticipant*6.0);
			else if(super.getEventName().equals("DigitalArt"))
				super.setRegistrationFee(noOfParticipant*8.0);
			else if(super.getEventName().equals("Acting"))
				super.setRegistrationFee(noOfParticipant*10.0);
			else
				super.setRegistrationFee(0.0);
		}
	}
	public int getNoOfParticipant() {
		return noOfParticipant;
	}
	public void setNoOfParticipant(int noOfParticipant) {
			this.noOfParticipant = noOfParticipant;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
}
