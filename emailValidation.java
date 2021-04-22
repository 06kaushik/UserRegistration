package pincode;
import java.util.regex.*;

public class emailValidation {
	
	public static boolean isValidemail(String email) {
		
        String regex
            = "^[0-9A-Za-z]+([._+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+.[a-zA-Z]{2,3}([.][a-zA-Z])*$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the email is empty
        // return false
        if (email == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given email
        // and regular expression.
        Matcher m = p.matcher(email);
  
        // Return if the email
        // matched the ReGex
        return m.matches();
    }
  
    // Driver Code.
    public static void main(String args[])
    {
  
        // Test Case 1:
        String email = "himanshu06kaushik@gmail.com";
        System.out.println(
        		email + ": "
            + isValidemail(email));
        
}
}
