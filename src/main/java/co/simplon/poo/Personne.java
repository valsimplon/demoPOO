package co.simplon.poo;

public class Personne {

	private String prenom;
	private String nom;
	private int age;
	private boolean femme;
	private Adresse adresse;

	/**
	 * Constructeur d'une personne, reprenant les données obligatoire à la
	 * création
	 * 
	 * @param nom
	 *            Nom de la personne
	 * @param prenom
	 *            Prénom de la personne
	 * @param age
	 *            Age de la personne
	 */
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.femme = true;
	}

	public void declineTonIdentite() {
		System.out.println("Je m'appelle " + this.prenom + " " + this.nom
				+ " et j'habite à " + this.adresse.getVille());
	}

	public void feteTonAnniversaire() {
		this.age = this.age + 1;
		System.out.println(this.prenom + " " + this.nom + " fête ses "
				+ this.age + " printemps");
		// this.age++; => on incrémente d'une unité l'élément courant
	}

	public void demenage(Adresse nouvelleAdresse) {
		System.out.println(this.prenom + " " + this.nom + " déménage de "
				+ this.adresse.getVille() + " vers " + nouvelleAdresse.getVille());
		this.adresse = nouvelleAdresse;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isFemme() {
		return femme;
	}

	public void setFemme(boolean femme) {
		this.femme = femme;
	}

	public String getNom() {
		return nom;
	}

	public int getAge() {
		return age;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", age=" + age
				+ ", femme=" + femme + ", adresse=" + adresse + "]";
	}

}
