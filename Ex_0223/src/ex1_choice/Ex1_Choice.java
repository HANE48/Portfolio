package ex1_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {

	public static void main(String[] args) {
		Frame f = new Frame("Your Blood Type");
		f.setBounds(500, 100, 300, 250);
		f.setLayout(null);
		
		Choice bt = new Choice();
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");
		bt.setBounds(50, 100, 150, 0);
		
		//frame에 컴포넌트 추가 
		f.add(bt);
		
		bt.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				//현재 선택된 항목의 이름을 가져온다
				String res = bt.getSelectedItem();
				System.out.println(res);
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
		
		
	}//main
	
}
