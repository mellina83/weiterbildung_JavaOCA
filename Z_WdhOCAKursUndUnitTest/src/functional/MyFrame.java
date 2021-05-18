package functional;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	public static void main(String[] args) {
		new MyFrame();

	}

	public MyFrame() {
		this.setTitle("Lambda Test");
		this.setBounds(100, 100, 640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel myPanel =new JPanel();
		this.setContentPane(myPanel);
		
		JButton btn01 = new JButton("exit");
		JButton btn02 = new JButton("load");
		JButton btn03 = new JButton("save");
		JButton btn04 = new JButton("beenden");
		
		
		btn01.addActionListener(MyActions::exitAction);
		btn02.addActionListener(MyActions::loadAction);
		btn03.addActionListener(MyActions::saveAction);
		btn04.addActionListener(MyActions::beendenAction);
		//btn01.addActionListener(this);
		
		myPanel.add(btn01);
		myPanel.add(btn02);
		myPanel.add(btn03);
		myPanel.add(btn04);
		
		this.setVisible(true);
	}


}
