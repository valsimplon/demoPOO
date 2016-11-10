package co.simplon.poo;

public class MainPersonne {

	public static void main(String[] args) {
		Personne eric = new Personne("Siber", "Eric", 35);
		Personne ellene = new Personne("Siber", "Ellène", 32);
		System.out.println(eric);

		eric.setFemme(false);
		ellene.setFemme(true);

		Adresse adresse = new Adresse(12, "Rue des lilas", 78500,
				"Sartrouville");
		eric.setAdresse(adresse);
		ellene.setAdresse(adresse);

		System.out.println(eric);
		System.out.println(ellene);
		
		eric.declineTonIdentite();
		eric.feteTonAnniversaire();
		Adresse nouvelleAdresse = new Adresse(13, "Rue principale", 75001,
				"Paris");
		eric.demenage(nouvelleAdresse);
		ellene.demenage(nouvelleAdresse);
		
		System.out.println(eric);
		System.out.println(ellene);
	}

}
