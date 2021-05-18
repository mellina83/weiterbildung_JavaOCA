package gen01.classes;

//The type parameter Number is hiding the type java.lang.Number
//The type parameter Integer is hiding the type java.lang.Integer
class MyGenericData<T>{//Platzhalter -> Double|Integer|String|Punkt|........
	
	private T x;
	private T y;
	
	public MyGenericData(T x,T y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

}

class Animal{
	
}

class Schwein extends Animal{
	
}

public class Demo02Achtung {

	public static void main(String[] args) {
		MyGenericData<Number> mgd_Number = new MyGenericData(42, 42);
		MyGenericData<Double> mgd_Double = new MyGenericData(42.0, 42.0);
		
		MyGenericData<String> mgd_String = new MyGenericData("42.0", "42.0");
		
		MyGenericData<Animal> mgd_Animal = new MyGenericData(new Schwein(), new Schwein());
	}

}
