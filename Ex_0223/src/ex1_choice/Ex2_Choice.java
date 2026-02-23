package ex1_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Choice {
	
	public static void main(String[] args) {
		
		Frame f = new Frame("Question");
		f.setBounds(500, 300, 500, 250);
		f.setLayout(null);
		f.setVisible(true);

		Choice ch = new Choice();
		ch.setBounds(50, 100, 150, 0);
		ch.add("Select State");
		ch.add("Seoul");
		ch.add("Gyeonggi");
		ch.add("Incheon");
		ch.add("Gwangju");
		ch.add("Deagu");
		ch.add("Pusan");
		ch.add("Daejeon");
		f.add(ch);

		Label lb = new Label();
		lb.setBounds(250, 100, 150, 50);
		lb.setText("<-- Select State");
		f.add(lb);

		ch.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// 현재 선택된 항목의 이름을 가져온다
				String res = ch.getSelectedItem();

				if (!res.equals("Select State")) {
					lb.setText(res + " is Selected");
				}
			}
		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
	}//main
	
}
