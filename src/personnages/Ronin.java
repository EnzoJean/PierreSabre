package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = argent*1/10;
		super.parler(beneficiaire.getNom()+" prend ces "+ don +" sous.");
		beneficiaire.recevoir(don);
	}
	
}
