package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
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
	
}
