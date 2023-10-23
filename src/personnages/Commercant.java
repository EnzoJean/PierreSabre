package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "th�");
	}

	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste...");
		argent = 0;
		return argent;
	}
	
	public void recevoir(int don) {
		parler(don+" sous ! Je te remercie g�n�reux donateur!");
		argent += don;
	}
	
}