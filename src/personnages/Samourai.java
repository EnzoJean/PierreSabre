package personnages;

public class Samourai extends Ronin{
	private String seigneur;
	
	
	public Samourai(String seigneur, String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur "+this.seigneur+".");
	}
	
	public void boire(String boisson) {
		this.parler("Qu'est-ce que je vais choisir comme boisson ?"
				+ " Tiens je vais prendre du "+boisson+".");
	}

}
