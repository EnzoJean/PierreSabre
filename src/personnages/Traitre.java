package personnages;
import java.util.Random;

public class Traitre extends Samourai{
	private int traitrise = 0;
	
	public Traitre(String seigneur, String nom, int argent, String boisson) {
		super(seigneur, nom, argent, boisson);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traître et mon niveau de traîtrise est: "
				+ this.traitrise +". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (traitrise <3) {
			int argentRanconne = commercant.getArgent()*2/10;
			commercant.perdreArgent(argentRanconne);
			this.gagnerArgent(argentRanconne);
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer !"
					+ " Donne moi "+ argentRanconne + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " +getNom()+".");
			this.traitrise += 1;
		}
		else {
			this.parler("Mince je ne peux plus ranconner personne sinon un "
					+ "samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if(this.nbConnaissances<1) {
			this.parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		}
		else {
			Random random = new Random();
			int don = this.argent * 1/20;
			Humain ami = this.memoire[random.nextInt(this.nbConnaissances)];
			String nomAmi = ami.getNom();
			
			this.parler("Il faut absolument remonter ma cote de confiance."
					+ "Je vais faire ami ami avec "+nomAmi+".");
			this.parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "
					+ don + " sous.");
			
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			String nom = this.getNom();
			ami.parler("Merci "+nom+". Vous êtes quelqu'un de bien.");
			if(this.traitrise>=1) {
				this.traitrise -= 1;
			}
		}
	}
}
