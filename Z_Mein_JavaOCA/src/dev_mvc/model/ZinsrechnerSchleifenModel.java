package dev_mvc.model;

public class ZinsrechnerSchleifenModel implements ZinsrechnerModelInterface{

	@Override
	public double berechneEndkapital(int startkapital, double zinssatz, int laufzeit) {
		double temp = startkapital;
		for (int jahr = 1; jahr <= laufzeit; jahr ++) {
			temp = temp * (1 + zinssatz / 100);
		}		
		return temp;
	}

	@Override
	public double berechneLaufzeit(int startkapital, double zinssatz, int endkapital) {
		double temp = startkapital;
		double laufzeit = 0;
		while (temp < endkapital) {
			temp = temp * (1 + zinssatz / 100);
			laufzeit++;
		}
		return laufzeit;
	}

}
