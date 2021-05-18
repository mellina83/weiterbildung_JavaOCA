package assertions.use;

public class Data {

	private int amount;

	public int getAmount() {
		return amount;
	}

	/**
	 * only Positive
	 */
	public void setAmount(int amount) {
		if(amount > 0) {
			this.amount = amount;
		}
	}
	
	public void doStuff() {
		this.amount--;
	}
}
