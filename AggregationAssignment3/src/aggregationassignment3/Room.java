//lex_auth_012890622843117568163
//do not modify the above line

package aggregationassignment3;

public class Room {
	
	//Implement your code here 
    private int roomNo;
    private int capacity;
    private static int roomCounter=500;
	
    public Room() {
		this.roomNo=Room.roomCounter++;
		this.capacity=4;	
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public static int getRoomCounter() {
		return roomCounter++; 
	}
	public static void setRoomCounter(int roomCounter) {
		Room.roomCounter = roomCounter;
	}
    
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }
    */ 

}
