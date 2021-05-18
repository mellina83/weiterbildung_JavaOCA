package inner03local_innerclass;

public class Demo01LocalClass {

	private static String staticAttribute = "Statisch";
	private String instanceAttribute = "Instanz";

	private static void staticContext() {
		System.out.println(staticAttribute);
//		Cannot make a static reference to the non-static field instanceAttribute
//		System.out.println(instanceAttribute);

		/*
		 * Welche zugriffsmodifizierer sind für Lokale Klassen erlaubt?
		 * 
		 * Sichtbarkeiten? public:NO protected:NO paketweit:NO private:NO
		 * 
		 * final:YES abstract:YES
		 */
		abstract class Inside {
			
			private String myText = "Hello World";
			
			public Inside() {
				System.out.println(staticAttribute);
				System.out.println(myText);
			}
			
			public void changeString() {
				staticAttribute = staticAttribute + " changed";
//				Cannot make a static reference to the non-static field instanceAttribute
//				System.out.println(instanceAttribute);
			}
			
			private void doStuff() {
				System.out.println("doStuff");
			}
		}
		
		class SubInside extends Inside{
			public SubInside() {
				
			}

			private void doStuff() {
				System.out.println("SubInside doStuff");
			}
		}
		
		Inside in = new SubInside();
		in.changeString();
		in.doStuff();
		System.out.println(in.myText);
		System.out.println(staticAttribute);
		
	}

	public void instanceContext() {
		System.out.println(staticAttribute);
		System.out.println(instanceAttribute);

		/*
		 * Welche zugriffsmodifizierer sind für Lokale Klassen erlaubt?
		 * 
		 * Sichtbarkeiten? public:NO protected:NO paketweit:NO private:NO
		 * 
		 * final:YES abstract:YES
		 */
		abstract class Inside {
			
			public Inside() {
				System.out.println(staticAttribute);
				System.out.println(instanceAttribute);
			}
			
			public void changeString() {
				staticAttribute = staticAttribute + " changed";
				instanceAttribute = instanceAttribute + " changed";
			}
			
			boolean isValid() {
				System.out.println("isValid wurde durchgeführt");
				return true;
			}	
		}
		
		class SubInside extends Inside{
			
		}
		Inside in = new SubInside();
		in.isValid();
		in.changeString();
		System.out.println("--------------");
		System.out.println(staticAttribute);
		System.out.println(instanceAttribute);
		
	}

	public static void main(String[] args) {
		Demo01LocalClass.staticContext();
		System.out.println("*****************");
		new Demo01LocalClass().instanceContext();
	}
}
