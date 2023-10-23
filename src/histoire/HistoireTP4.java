package histoire;

import personnages.Humain;
import personnages.Yakuza;
import personnages.Commercant;


public class HistoireTP4 {
	public static void main(String[] args) {
		Humain Prof = new Humain("Prof", 54, "kombucha");
		Prof.direBonjour();
		Prof.acheter("une boisson", 12);
		Prof.boire();
		Prof.acheter("un jeu", 2);
		Prof.acheter("un kimono", 50);
		
		Commercant Marco = new Commercant("Marco", 20);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
		
		Yakuza Yaku = new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");
		Yaku.direBonjour();
		Yaku.extorquer(Marco);
	}
}
