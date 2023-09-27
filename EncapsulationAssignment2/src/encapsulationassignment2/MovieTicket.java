//lex_auth_012907551251406848427
//do not modify the above line

package encapsulationassignment2;

public class MovieTicket {
	private int movieId;
	private int noOfSeats;
	private double costPerTicket;
	private double amount;
	
	public MovieTicket(int movieId,int noOfSeats){
		this.movieId=movieId;
		this.noOfSeats=noOfSeats;
	}
	
	public int getMovieId(){
		return movieId;
	}
	public void setMovieId(int movieId){
		this.movieId=movieId;
	}
	
	public int getNoOfSeats(){
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats){
		this.noOfSeats=noOfSeats;
	}
	
	public double getCostPerTicket(){
		return costPerTicket;
	}
	public void setCostPerTicket(double costPerTicket){
		this.costPerTicket=costPerTicket;
	}
	
	public double calculateTotalAmount(){
		
		    if (this.movieId==111){
				this.costPerTicket=7.0;
				this.amount= this.costPerTicket*this.noOfSeats*1.02;
			}
			else if (this.movieId==112){
				this.costPerTicket=8.0;
				this.amount= this.costPerTicket*this.noOfSeats*1.02;
			}
			else if (this.movieId==113){
				this.costPerTicket=8.5;
				this.amount=this.costPerTicket*this.noOfSeats*1.02;
			}	
			else
				this.amount=0.0;
		return amount;
	}
}
