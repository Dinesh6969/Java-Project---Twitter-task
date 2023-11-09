package TaskTwitterX;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HomePage extends PrivateUservalues {
	
	public void details() {
			setUserName();
		    setPassWord();		    
		System.out.println(this.getUserName()+" "+this.getPassWord());
		Map<String, String> m = new HashMap<>();
		m.put("Dinesh", "Dinesh!1234");
		m.put("Virat", "Virat!1234");
		m.put("Sachin", "Sachin!1234");
		m.put("a","b");
		try {
		for(Map.Entry<String, String> i: m.entrySet()) {
			if(getUserName().equals(" ") || getPassWord().equals(" ")) {
				System.out.println("You enter wrong ");
				throw new ArrayIndexOutOfBoundsException("Exception");
				
			}
			else {
			if(this.getUserName().equalsIgnoreCase(i.getKey()) && this.getPassWord().equals(i.getValue())) {
				HomePage h = new HomePage();
				h.Line();
				System.out.println("\n\t\t\t**********************\n\t\t\t  Welcome To X @ _ @  \n"+" \t\t\t      "+this.getUserName().toUpperCase()+"\n\t\t\t     @"+this.getUserName().toLowerCase()+"\n\t\t\t**********************");
				h.tweets();
			}
			}
		}
		}
		catch (Exception e){
			System.out.println("You Have Enter the null Value.");
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HomePage hp = new HomePage();
		try {
		hp.frontPage();
		char s = sc.nextLine().charAt(0);
		if(s == 'Y' || s =='y') {
			hp.details();
			
		}
		else if (s == 'N' || s == 'n'){
			System.out.println("Please Register the Page.");
			hp.Register();
			
	
			
			
		}
		else {
			System.out.println("Enter the correct key.");
			
		}
		
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.print("You Did not Enter the Correct Value.\n");
			
		}
		finally {
			System.out.println("\n------------------ Beware of Frauds !!! --------------------");
		}
		sc.close();

	}

}
