package java;

public class LoginAlwaysValid implements LoginInterface {
 
	/**
	 * @see java.LoginInterface#isValidUser(java.User)
	 */
	public boolean isValidUser(User user) {
		return false;
	}
	 
}
 
