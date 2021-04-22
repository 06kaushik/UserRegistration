package pincode;
import java.util.regex.*;

public class MobileValidation {
	
	public static boolean isValidMobile(String Mobile) {
		
        String regex
            =  "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the Mobile is empty
        // return false
        if (Mobile == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given Mobile
        // and regular expression.
        Matcher m = p.matcher(Mobile);
  
        // Return if the Mobile
        // matched the ReGex
        return m.matches();
    }
  
    // Driver Code.
    public static void main(String args[])
    {
  
        // Test Case 1:
        String Mobile = "+91 9860641590";
        System.out.println(
        		Mobile + ": "
            + isValidMobile(Mobile));
        
}
}
