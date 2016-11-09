package co.simplon.poo;

public class Adresse {
	
	private int codePostal;
	private String ville;
	private int numeroVoie;
	private String nomVoie;

	public Adresse(int numeroVoie, String nomVoie, int codePostal, String ville) {
		this.codePostal = codePostal;
		this.ville = ville;
		this.numeroVoie = numeroVoie;
		this.nomVoie = nomVoie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}

	public int getNumeroVoie() {
		return numeroVoie;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	@Override
	public String toString() {
		return "Adresse [codePostal=" + codePostal + ", ville=" + ville
				+ ", numeroVoie=" + numeroVoie + ", nomVoie=" + nomVoie + "]";
	}
}