package co.simplon.poo;

import java.util.Date;

public class Refugie extends Personne {

	private Date dateLimiteAutorisation;
	private Date dateDeRegularisation;
	private boolean regularise;

	public Refugie(String nom, String prenom, int age, Date dateLimiteAutorisation) {
		super(nom, prenom, age);
		this.regularise = false;
		this.dateLimiteAutorisation = dateLimiteAutorisation;
	}
	
	public void demanderAsile(Adresse adresseAssignation) {
		Date dateCourante = new Date();
		if (adresseAssignation != null) {
			if (dateCourante.before(this.dateLimiteAutorisation)) {
				// la date limite n'est pas atteinte, on peut traiter la demande
				System.out.println(this.getNom() + " " + this.getPrenom() + " demande l'asile pour l'adresse " + adresseAssignation);
				this.adresse = adresseAssignation;
				this.dateDeRegularisation = dateCourante;
				this.regularise = true;
			} else {
				System.out.println("La demande d'asile pour " + this.getNom() + " " + this.getPrenom() + " ne peut aboutir : date limite dépassée");
			}
		} else {
			System.out.println("Absence d'adresse pour la demande d'asile de " + this.getNom() + " " + this.getPrenom());
		}	
	}

	@Override
	public void demenage(Adresse nouvelleAdresse) {
		if (nouvelleAdresse == null) {
			System.out.println("L'adresse est vide");
		} else {
			if (regularise && this.adresse != null) {
				if (this.adresse.getCodePostal() == nouvelleAdresse.getCodePostal()
						&& this.adresse.getVille().equals(nouvelleAdresse.getVille())) {
					super.demenage(nouvelleAdresse);
				} else {
					System.out.println("Adresses incompatibles");
				}
			} else {
				System.out.println("Il faut d'abord régulariser le réfugié");
			}
		}
	}

	public Date getDateLimiteAutorisation() {
		return dateLimiteAutorisation;
	}

	public void setDateLimiteAutorisation(Date dateLimiteAutorisation) {
		this.dateLimiteAutorisation = dateLimiteAutorisation;
	}

	public boolean isRegularise() {
		return regularise;
	}

	public void setRegularise(boolean regularise) {
		this.regularise = regularise;
	}

	@Override
	public String toString() {
		String toStringPersonne = super.toString();
		return "Refugie [dateLimiteAutorisation=" + dateLimiteAutorisation
				+ "dateDeRegularisation=" + dateDeRegularisation + ", regularise=" + regularise + "]\n  " + toStringPersonne;
	}
	
}
