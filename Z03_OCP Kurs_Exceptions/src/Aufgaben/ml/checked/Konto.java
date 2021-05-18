package Aufgaben.ml.checked;

public class Konto {

	private double saldo;

	public Konto() {
		this(5.0);
	}

	public Konto(double saldo) {
		super();
		this.setSaldo(saldo);
	}

	public double getSaldo() {
		return this.saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Vor dem Abheben einer Summe soll gepr�ft werden ob das Konto ausreichend
	 * gedeckt ist, wenn nicht soll eine "NegativeSaldoException" mit dem
	 * Aktuellen Saldo und dem abzuhebenden Betrag als Nachricht geworfen werden.
	 * 
	 * Es geht hier um eine "Checked" Exception
 	 */
	public void geldAbheben(double saldo) throws NegativeSaldoException {
		if (saldo > this.getSaldo()) {
			throw new NegativeSaldoException("ACHTUNG!!! - Es sind nur " + getSaldo() + " Verf�gbar");
		} else {
			this.setSaldo(this.getSaldo() - saldo);
		}
	}

	public void geldEinzahlen(double saldo) {
		this.setSaldo(this.getSaldo() + saldo);
	}

	@Override
	public String toString() {
		return "Saldo verfuegbar = " + this.getSaldo();
	}
}
