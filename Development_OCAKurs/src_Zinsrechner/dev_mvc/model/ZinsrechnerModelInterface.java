package dev_mvc.model;

public interface ZinsrechnerModelInterface {
	
	double berechneEndkapital(int startkapital, double zinssatz, int laufzeit);
	
	double berechneLaufzeit(int startkapital, double zinssatz, int endkapital);

}
