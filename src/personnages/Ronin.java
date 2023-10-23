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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		super.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as"
				+ " fait à ce pauvre marchand!");
		if(force>= adversaire.getReputation()){
			super.parler("Je t'ai eu petit yakusa!");
			honneur += 1;
			gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
		}
		else {
			honneur -=1;
			super.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
			argent = 0;
		}
	}
	
}
