package pincode;
import java.util.regex.*;

public class LastName {
	
	public static boolean isValidLastName(String LastName) {
		
        String regex
            = "^[A-Z]{1}[a-z]{2,}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the Last Name is empty
        // return false
        if (LastName == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given Last Name
        // and regular expression.
        Matcher m = p.matcher(LastName);
  
        // Return if the Last Name
        // matched the ReGex
        return m.matches();
    }
  
    // Driver Code.
    public static void main(String args[])
    {
  
        // Test Case 1:
        String LastName = "Himanshu";
        System.out.println(
        		LastName + ": "
            + isValidLastName(LastName));
        
}
}
