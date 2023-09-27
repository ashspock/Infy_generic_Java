//lex_auth_012908097284579328502
//do not modify the above line

package methodoverridingassignment2;

public class SoloEvent extends Event {
	//Implement your code here
	private int participantNo;
	public SoloEvent(String eventName, String participantName, int participantNo) {
		super(eventName, participantName);
		this.participantNo = participantNo;
	}
	public void registerEvent(){
		super.registerEvent();
	}
	public int getParticipantNo() {
		return participantNo;
	}
	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
}
