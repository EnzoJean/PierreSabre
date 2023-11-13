package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.getArgent(); 
		this.argent += argentVole;
		victime.seFaireExtorquer();
		this.reputation += 1;
		super.parler("J'ai piqué les "+argentVole+" sous de "+victime.getNom()+", "
				+ "ce qui me fait "+argent+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		reputation -= 1;
		super.parler("J'ai perdu mon duel et mes "+argent+" sous, snif... J'ai déshonorer"
				+ " le clan de "+clan);
		argent = 0;
		return reputation;
	}
	
	public void gagner(int gain) {
		super.parler("Ce ronin pensait vraiment battre "+nom+" du clan "+clan+
				" ? Je l'ai dépouillé de ses "+gain+" sous.");
		this.gagnerArgent(gain);
		reputation += 1;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est celui de " + this.clan + ".");
	}
	
	
}
