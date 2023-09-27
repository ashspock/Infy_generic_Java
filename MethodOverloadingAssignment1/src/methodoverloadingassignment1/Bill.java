//lex_auth_012907624695250944483
//do not modify the above line

package methodoverloadingassignment1;

public class Bill {
	
	public double findPrice(int itemId){
		if(itemId==1001)
			return 25;
		else if(itemId==1002)
			return 20;
		else if(itemId==1003)
			return 23;
		else if(itemId==1004)
			return 18;
		else
			return 0;
	}
	public double findPrice(String brandName, String itemType, int size){
		
		double price=0;
		
		if(brandName.equals("Puma")){
			if(itemType.equals("T-shirt")){
				if(size==34 || size==36)
					price=25;
				else
					price=0;
			}
			if(itemType.equals("Skirt")){
				if(size==38 || size==40)
					price=20;
				else 
					price=0;
			}
		}
		
		else if(brandName.equals("Reebok")){
			if(itemType.equals("T-shirt")){
				if(size==34 || size==36)
					price=23;
				else
					price=0;
			}
			if(itemType.equals("Skirt")){
				if(size==38 || size==40)
					price=18;
				else 
					price=0;
			}
		}
		else 
			price=0;
		
		return price;
	}
}
