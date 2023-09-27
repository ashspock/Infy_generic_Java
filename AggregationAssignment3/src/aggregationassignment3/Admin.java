//lex_auth_012890622843117568163
//do not modify the above line

package aggregationassignment3;

public class Admin {
	public void assignRoom(Room[] rooms,Member member){
		for(Room r:rooms)
		{
			if(r.getCapacity()>0)
			{
				r.setCapacity(r.getCapacity()-1);
				member.setRoom(r);
				break;
			}
		}
	}
}