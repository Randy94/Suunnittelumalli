package memento;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner skanneri = new Scanner(System.in);
		boolean peliloppu = false;
		
		
		Arvuuttaja x = new Arvuuttaja();
		Object obj = x.liityPeliin();
		
		while(peliloppu = true) {
			int l = Integer.parseInt(skanneri.nextLine());
			peliloppu = x.Arvaa(obj, l);
			
		}
		
		
		
		
	}
	
	
	
}
