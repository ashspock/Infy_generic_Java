//lex_auth_012908097284579328502
//do not modify the above line

package methodoverridingassignment2;

public class TeamEvent extends Event {
	//Implement your code here
	private int noOfParticipant;
	private int teamNo;
	public TeamEvent(String eventName, String participantName, int noOfParticipant, int teamNo) {
		super(eventName, participantName);
		this.noOfParticipant = noOfParticipant;
		this.teamNo = teamNo;
	}
	public void registerEvent(){
		super.registerEvent();
		super.setRegistrationFee(super.getRegistrationFee()*noOfParticipant);
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
