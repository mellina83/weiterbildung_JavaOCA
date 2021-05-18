package assertions.use;

public class TestData {

	public static void main(String[] args) {
		Data data = new Data();

		data.setAmount(3);
		data.doStuff();
		data.doStuff();
		data.doStuff();
		data.doStuff();
		data.doStuff();

		assert data.getAmount() > 0 : "Fehlerhaftes Data";

		System.out.println("Test Complete");
	}

}
