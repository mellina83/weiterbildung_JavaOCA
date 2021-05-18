package inherit02;

interface IEatable{
	void wirdgefressen();
}

abstract class Apfel implements IEatable{
	abstract int getGewicht();
}

class SuesserApfel extends Apfel{
	
	public int getGewicht(){
		System.out.println("Ich wiege wenige Gramm");
		return 42;
	}
	
	public void wirdgefressen(){
		System.out.println("Hmm, super Suess");
	}
}

public class Demo01Class_Interface {

}
