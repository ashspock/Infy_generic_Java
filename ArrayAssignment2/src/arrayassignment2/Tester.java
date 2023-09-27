//lex_auth_012909489074814976538
//do not modify the above line

package arrayassignment2;

public class Tester {
	
	 public static double[] findDetails(double[] salary) {
	     double result[]=new double[3]; 
	     double avg=0.0;
	     int g=0,l=0;
		 for(double i:salary){
	    	 avg+=i;    	 
	     }
	     avg=avg/salary.length;
	     result[0]=avg;
	     for(double i:salary){
	     if(i>avg)
    		 result[1]=++g;
	     if(i<avg)
	    	 result[2]=++l;
	     }
	     
	     return result;     

	    }
	       
	    public static void main(String[] args) {
	        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
	        double[] details = findDetails(salary);
	              
	        System.out.println("Average salary: "+ details[0]);
	        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
	        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
	    }

}
