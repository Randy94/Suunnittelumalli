package templatemethod;

import java.util.Scanner;

public class Players {

	
	  String name;
	  Scanner a = new Scanner(System.in);
	private int players;
	  
	Players(int players) {
		super();
		this.players = players;
		System.out.println("Anna pelaajan nimi");
		this.name = a.next();
	}
	
	
	public String getName() {
		return name;
			
	}

}
