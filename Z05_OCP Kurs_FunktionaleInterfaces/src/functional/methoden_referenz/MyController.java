package functional.methoden_referenz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyController implements ActionListener {

	String content;
	
	public MyController(String content) {
		this.content = content;
	}
	
	public static void staticExitAction(ActionEvent e) {
		System.out.println("Bye bye");
		System.exit(0);
	}
	
	public void instanceExitAction(ActionEvent e) {
		System.out.println(content);
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Controller");
		switch (e.getActionCommand().toLowerCase()) {
			case "exit": {
				break;
			}
			case "save": {
				break;
			}
			default: {
				break;
			}
		}
	}

}
