package memento;

public class Arvuuttaja {

	private int random;
	
	
	// 
	public Memento liityPeliin() {
		
		 System.out.println("Arvaus peli");
	        System.out.print("Arvaa numero  0 - 100 väliltä: ");
	        random = getRandom();
	        return new Memento(random);
	}
	// random numero 1 - 100
	private int getRandom() {
		int min = 0;
		int max = 100;
		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	// Arvaus metodi jossa annetaan memento objecti ja käyttäjän arvaus
	public boolean Arvaa(Object obj,int arvaus) {
		Memento memento = (Memento) obj;
		if(arvaus == memento.getNumero()) {
			System.out.print("Oikein! oikea vastaus oli:" + arvaus);
			return true;
			
		} else if (arvaus < memento.getNumero()) {
			System.out.print("Numero on liian matala!");
			return false;
			
		}else {
			System.out.print("Numero on liian Korkea");
			
		}
		return false;
				
	}	
	
	private class Memento {
        private final int numero;
 
        public Memento(int Talletettavanmro) {
            numero = Talletettavanmro;
        }
 
        public int getNumero() {
            return numero;
        }

	}
}
