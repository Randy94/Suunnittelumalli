package templatemethod;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Game game = new ArvaaNumero();
		System.out.println("Montako pelaajaa");
		Scanner s = new Scanner(new InputStreamReader(System.in));
		int Players = s.nextInt();
		game.playOneGame(Players);
				

	}

}
