package histoire;

import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain Prof = new Humain("Prof", 54, "kombucha");
		Prof.direBonjour();
		Prof.acheter("une boisson", 12);
		Prof.boire("kombucha");
		Prof.acheter("un jeu", 2);
		Prof.acheter("un kimono", 50);
	}
}
