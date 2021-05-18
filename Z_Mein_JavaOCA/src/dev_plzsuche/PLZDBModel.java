package dev_plzsuche;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PLZDBModel implements PLZModelInterface{
	
	private Connection verbindung;
	private Statement befehl;
	
	public PLZDBModel() {
		// Klasse (Treiber) laden
//		try {
//			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		// Verbindung zur Datenbank herstellen
		try {
			verbindung = DriverManager.getConnection("jdbc:ucanaccess://files/PLZ_Datenbank-1.accdb");
			befehl = verbindung.createStatement();
			System.out.println("Verbindung erfolgreich!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String sucheOrt(String postleitzahl) {
		StringBuilder ort = new StringBuilder();
		String sql = "select Ort from tblPLZ where PLZ = '" + postleitzahl + "'";
		try {
			ResultSet rs = befehl.executeQuery(sql);
			while(rs.next()) {
				ort.append(rs.getString("Ort") + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ort.toString();
	}

	@Override
	public String sucheBundesland(String postleitzahl) {
		StringBuilder bundesland = new StringBuilder();
		String sql = "select Bundesland from tblPLZ where PLZ = '" + postleitzahl + "'";
		try {
			ResultSet rs = befehl.executeQuery(sql);
			while(rs.next()) {
				bundesland.append(rs.getString("Bundesland") + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bundesland.toString();
	}

}
