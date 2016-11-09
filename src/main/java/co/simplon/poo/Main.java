package co.simplon.poo;

public class Main {

	public static void main(String[] args) {
		Personne eric = new Personne("Siber", "Eric", 35);
		System.out.println(eric);
		
		eric.setFemme(false);
		eric.setAdresse("Sartrouville");
		System.out.println(eric);
	}

}
