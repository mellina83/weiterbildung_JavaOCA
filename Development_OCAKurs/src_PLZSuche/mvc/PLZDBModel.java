package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PLZDBModel implements PLZModelInterface {
	
	private Connection verbindung;
	private Statement befehl;
	//kommt aus dem SQL Package, fuer Zugriff per SQL
	
	public PLZDBModel () {
		//Klasse bzw Treiber laden
		//Es nennt sich: Klassenlader. Der ist seit JAVA 6 nicht mehr noetig
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// Verbindung zur Datenbank herstellen
		try {
			verbindung = DriverManager.getConnection("jdbc:ucanaccess://files/PLZ_Datenbank-1.accdb");
			//an Stelle von jdbc und ucanaccess bei anderen Systemen: mssql (Microsoft), msql
			befehl = verbindung.createStatement();
			System.out.println("Verbindung erfolgreich");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String sucheOrt(String postleitzahl) {
		String sql = "select Ort from tblPLZ where PLZ = '" + postleitzahl + "'";
		StringBuilder ort = new StringBuilder();
		try {
			ResultSet rs = befehl.executeQuery(sql);
			while(rs.next()) {
				ort.append(rs.getString("Ort") + " ");
			}
			rs.next();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ort.toString();
	}

	@Override
	public String sucheBundesland(String postleitzahl) {
		String sql = "select Bundesland from tblPLZ where PLZ = '" + postleitzahl + "'";
		StringBuilder bundesland = new StringBuilder();
		try {
			ResultSet rs = befehl.executeQuery(sql);
			while (rs.next()) {
				bundesland.append(rs.getString("Bundesland") + " ");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bundesland.toString();
	}
	

}
