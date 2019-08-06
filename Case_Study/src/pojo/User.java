package pojo;

public class User {
	
	private String userEmail;
	private String userPassword;
	private String retypePassword;
	private String securityColor;
	
    

	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getRetypePassword() {
		return retypePassword;
	}
	
	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}
	
	public String getSecurityColor() {
		return securityColor;
	}
	
	public void setSecurityColor(String securityColor) {
		this.securityColor = securityColor;
	}
	
	
	
}