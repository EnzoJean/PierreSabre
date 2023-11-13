package personnages;

public class Humain {
	private static final int TAILLE_MEMOIRE = 3;
	protected String nom;
	protected int argent;
	private String boisson;
	protected int nbConnaissances = 0; 
	protected Humain[] memoire = new Humain [TAILLE_MEMOIRE];
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	protected void parler(String texte) {
		System.out.println(nom+" - "+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+
				" et j'aime boire du "+boisson+".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(argent >= prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir"
					+ "m'offrir "+bien+" à "+prix+" sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai que "+argent+" sous en poche. Je ne peux"
					+ " même pas m'offrir "+bien+" à "+prix+" sous.");
		}
	}
	
	protected void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	private void memoriser(Humain homme) {
		this.memoire[nbConnaissances%TAILLE_MEMOIRE] = homme;
		this.nbConnaissances += 1;
	}
	
	private void repondre(Humain homme) {
		this.direBonjour();
		this.memoriser(homme);
	}
	
	public void faireConnaissanceAvec(Humain homme2) {
		this.direBonjour();
		homme2.repondre(this);
		this.memoriser(homme2);
	}
	
	public void listerConnaissance() {
		this.parler("Je connais beaucoup de monde dont : ");
		if(nbConnaissances>=TAILLE_MEMOIRE) {
			for(int i=0; i<TAILLE_MEMOIRE; ++i) {
				System.out.println(memoire[i].getNom()+", ");
			}
		}
		else {
			for(int i=0; i<nbConnaissances; ++i) {
				System.out.println(memoire[i].getNom()+", ");
			}
		}
	}
	
	
}














