package templatemethod;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArvaaNumero extends Game {
	ArrayList <Players> pelaajat = new ArrayList();
	String voittaja = null;
	int x = (int)(100*Math.random() + 1);
    Scanner input = new Scanner(System.in);
    String oikein = null;
	
	
	@Override
	void initializeGame(int playersCount) {
		for(int i = 0; i < playersCount; i++) {
		Players p = new Players(i);
		
		pelaajat.add(p);
		}
	}

	@Override
	void makePlay(int player) {
		for (Players peluri1 : pelaajat) {
			
			System.out.print("Anna numero 1-100");
	        int guess1 = input.nextInt();
	        if(guess1 < x) {
	        	System.out.println("Number is too low!");
	        }
	        else if(guess1 > x){
	            System.out.println("Number is too high!");
	        }
	        else if(guess1 == x){
	            System.out.println("correct!");
	            voittaja = peluri1.getName();
	        }
	        else{
	            System.out.println("not a valid option");
	        }
	        	
		}
	}
		
	   


	
	@Override
	boolean endOfGame() {
		for(Players peluri1 : pelaajat) {
			if(voittaja != null) {
				
				voittaja = peluri1.getName();
				return true;
			}
				
				
			
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println(voittaja + "  on voittaja!");
		
	}

}
