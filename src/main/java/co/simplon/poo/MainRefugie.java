package co.simplon.poo;

import java.util.Calendar;
import java.util.Date;

public class MainRefugie {

	public static void main(String[] args) {
		
		Calendar rightNow = Calendar.getInstance();
		rightNow.set(Calendar.YEAR, 2017);
		Date dateLimite = rightNow.getTime();	
		
		Refugie refugie = new Refugie("DURAND", "Jules", 26, dateLimite);
		refugie.setFemme(false);
		System.out.println(refugie);
		
		refugie.demanderAsile(new Adresse(12, "rue de l'église", 78500, "Sartrouville"));
		System.out.println(refugie);
		
		refugie.demenage(new Adresse(13, "rue de l'église", 78500, "Sartrouville"));
		System.out.println(refugie);
	}

}
