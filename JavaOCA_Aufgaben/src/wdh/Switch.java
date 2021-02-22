package wdh;

public class Switch {

	public static void main(String[] args) {
		
		char eingabe = 'A';
		
		if (eingabe >= 'A' && eingabe <='z') {
			switch(eingabe) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Das eingegebene Zeichen ist ein Vokal");
				break;
			default:
				System.out.println("Das eingegebene Zeichen ist ein Konsonant");
			}
			
			
		} else {
			System.out.println("Zeichen ist nicht erlaubt: " + eingabe);
		}
		
		

	} // Ende Main

}
