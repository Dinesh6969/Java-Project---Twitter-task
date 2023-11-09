package TaskTwitterX;

import java.util.Scanner;

public class PrivateUservalues extends FrontDesign {
	Scanner sc = new Scanner(System.in);
	private String UserName;
	private String PassWord;
	public void setUserName() {
		System.out.println("Enter the UserName:");
		getUserName();
		UserName = sc.nextLine();
	}
	public String getUserName() {
		return UserName;
	}
	public void setPassWord() {
		System.out.println("Enter the PassWord:");
		getPassWord();
		PassWord = sc.nextLine();
	}
	public String getPassWord() {
		return PassWord;
	}
	
		
	
		
}
	
	
	


