package ml.aufgabe_15_1;

public class Email {

	private String betreff;
	private String text;
	private String empfaenger;
	private String absender;

	private String addresse;

	private boolean sender;
	private boolean receiver;

	private static String defServer = "@it-designers.de";

	public Email(String absender, String empfaenger, String betreff,
			String text) {

		this.setAbsender(absender);
		this.setEmpfaenger(empfaenger);
		this.setBetreff(betreff);
		this.setText(text);

	}

	public String getBetreff() {
		return betreff;
	}

	public void setBetreff(String betreff) {
		this.betreff = betreff;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getEmpfaenger() {
		return empfaenger;
	}

	public void setEmpfaenger(String empfaenger) {
		this.empfaenger = empfaenger;
	}

	public String getAbsender() {
		return absender;
	}

	public void setAbsender(String absender) {
		this.absender = absender;
	}

	public void senden() {

		class checkAdress {

			public checkAdress() {
			}

			public boolean isValid(String adress) {

				int len = 0;

				addresse = adress;

				if (addresse.startsWith("@") || addresse.startsWith("+")) {
					return false;
				}

				// mehr als ein "*"
				len = addresse.length() - addresse.replace("*", "").length();
				if (len > 1) {
					return false;
				}
				if (addresse.endsWith("*")) {
					addresse = addresse.replace("*", defServer);
				}

				// mehr als ein "@" oder keines
				len = addresse.length() - addresse.replace("@", "").length();
				if (len != 1) {
					return false;
				}

				return (addresse.replace("*", "").replace("-", "")
						.replace(".", "").replace("@", "")
						.matches("[0-9a-zA-Z]*"));

			}
		}

		checkAdress ca = new checkAdress();
		sender = ca.isValid(this.absender);
		if (sender) {
			this.setAbsender(addresse);
		}
		receiver = ca.isValid(this.empfaenger);
		if (receiver) {
			this.setEmpfaenger(addresse);
		}

		if (sender && receiver) {

			System.out.println("Mail von : " + this.getAbsender());
			System.out.println("An       : " + this.getEmpfaenger());
			System.out.println("Betreff  : " + this.getBetreff());
			System.out.println("Text     :");
			System.out.println(this.getText());

		} else {
			System.out.println("Die Email konnte nicht verschickt werden!");
			if (!sender) {
				System.out.println(
						"Die Email-Adresse des Absenders ist ungültig   : "
								+ this.getAbsender());
			}
			if (!receiver) {
				System.out.println(
						"Die Email-Adresse des Empfaengers ist ungültig : "
								+ this.getEmpfaenger());
			}
		}

		System.out.println("--------------");

	}

}
