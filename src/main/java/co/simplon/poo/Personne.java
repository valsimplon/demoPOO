package co.simplon.poo;

public class Personne {

	private String prenom;
	private String nom;
	private int age;
	private boolean femme;
	private String adresse;

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

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}

	public int getAge() {
		return age;
	}

	public String getAdresse() {
		return adresse;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", age=" + age
				+ ", femme=" + femme + ", adresse=" + adresse + "]";
	}

}
