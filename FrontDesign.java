package TaskTwitterX;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrontDesign implements InsidePage {
	
	@Override
	public void frontPage() {
		int n = 5;
		int k = n*2-1;
		for(int i=1; i<=k; i++) {
			for(int j=1; j<=k; j++) {
				if(j==i || j == k-i+1) {					
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
			
		}
		System.out.println("\n**************************************\n*\tWelcome To Twitter / X:      *\n*\t Happening Now               *\n*\t  Join Today.                *\n**************************************\n");
		System.out.println("Sign up to X -> Enter Y or N");
		
	}
	@Override
	public void tweets() {
		System.out.println("Today Tweets:\n");
		System.out.println("Narendra Modi*\n@narendramodi\ntweet: On #EngineersDay We pay homage to Sri M Visvesvaraya, a visionary engineer and statesman.\n");
		System.out.println("ISRO*\n@isro\ntweet: Chandrayaan-3 has successfully soft-landed on the moon...Congratulations, India\n");
		System.out.println("Rahul Gandhi*\n@RahulGandhi\ntweet: Wishing PM NarendraModi a happy birthday.\n");
		System.out.println("Elon Musk*\n@elonmusk\ntweet: Haven't listened to it yet, but any conversation with Walter & Lex will be great.");
		
		
	}
	@Override
	public void Line() {
		for(int i=0; i<80; i++) {
			System.out.print("-");
		}
		
	}
	@Override
	public void Register() {
		Scanner sc = new Scanner(System.in);
		FrontDesign f = new FrontDesign();
		HashMap<String, String> d = new HashMap<>();
		System.out.println("Create a UserName:");
		String un = sc.nextLine();
		System.out.println("Create a Password:");
		String pd = sc.nextLine();
		d.put(un, pd);
		for(Map.Entry<String, String> m: d.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			System.out.println("Now, You Have Successfull Registered (:");	
			System.out.println("Please Login Here:");
			System.out.println("Enter the userName:");
			String u1 = sc.nextLine();
			System.out.println("Enter the Password:");
			String p1 = sc.nextLine();
			System.out.println("\n");
			if(u1.equalsIgnoreCase(m.getKey()) && p1.equals(m.getValue())) {
				f.tweets();
			}
			else {
				System.out.println("You have Entered Wrong Details");
			}
		}
		
		
		
		
		
		
	}
}
