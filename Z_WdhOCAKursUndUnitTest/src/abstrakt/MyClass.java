package abstrakt;

public abstract class MyClass {
	public abstract Integer doStuff();
}

abstract class SubMyClass extends MyClass {

//	@Override
//	public void doStuff() {
//			
//	}

}

class SubSubMyClass extends SubMyClass {

	@Override
	public Integer doStuff() {
		return null;
	}

}