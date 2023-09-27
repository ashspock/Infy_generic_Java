//lex_auth_012908173091069952511
//do not modify the above line

package exceptionexercise1;

public class Validator extends Applicant {
    
    	public boolean validateName(String name){
    		if(name.length()==0)
    			return false;
    		return true;
    	}
    	public boolean validateJobProfile(String jobProfile){
    		if(jobProfile.equals("Associate") || jobProfile.equals("Clerk") || jobProfile.equals("Executive") || jobProfile.equals("Officer"))
    			return true;
    		return false;
    	}
    	public boolean validateAge(int age){
    		if(age>=18 && age<=30)
    			return true;
    		return false;
    	}

    public void validate(Applicant applicant)throws Exception {
    	if(!(validateName(applicant.getName())))
    		throw new InvalidNameException("Invalid Name");
    	if(!(validateJobProfile(applicant.getJobProfile())))
    		throw new InvalidJobProfileException("Invalid Job");
    	if(!(validateAge(applicant.getAge())))
    		throw new InvalidAgeException("Invalid Age");
    }
}
