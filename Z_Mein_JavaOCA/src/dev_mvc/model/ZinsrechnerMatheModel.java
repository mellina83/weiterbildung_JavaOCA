package dev_mvc.model;

public class ZinsrechnerMatheModel implements ZinsrechnerModelInterface{

	@Override
	public double berechneEndkapital(int startkapital, double zinssatz, int laufzeit) {
		return startkapital * Math.pow(1 + zinssatz / 100, laufzeit);
	}

	@Override
	public double berechneLaufzeit(int startkapital, double zinssatz, int endkapital) {
		return Math.log(endkapital / startkapital) / Math.log(1 + zinssatz / 100);
	}
	
}
