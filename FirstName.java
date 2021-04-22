package pincode;
import java.util.regex.*;

public class FirstName {
	
	public static boolean isValidFirstName(String FirstName) {
		
        String regex
            = "^[A-Z]{1}[a-z]{2,}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the First Name is empty
        // return false
        if (FirstName == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given First Name
        // and regular expression.
        Matcher m = p.matcher(FirstName);
  
        // Return if the First Name
        // matched the ReGex
        return m.matches();
    }
  
    // Driver Code.
    public static void main(String args[])
    {
  
        // Test Case 1:
        String FirstName = "Himanshu";
        System.out.println(
        		FirstName + ": "
            + isValidFirstName(FirstName));
        
}
}
