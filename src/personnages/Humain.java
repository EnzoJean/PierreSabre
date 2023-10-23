package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;

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

public void parler(String texte) {
	System.out.println(nom+" - "+texte);
}

public void direBonjour() {
	parler("Bonjour ! Je m'appelle "+nom+
			" et j'aime boire du "+boisson);
}

public void boire(String boisson) {
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

public void gagnerArgent(int gain) {
	this.argent = this.argent+gain;
}

public void perdreArgent(int perte) {
	this.argent = this.argent-perte;
}


}
