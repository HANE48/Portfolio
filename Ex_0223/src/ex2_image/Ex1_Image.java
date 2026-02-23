package ex2_image;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Ex1_Image {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 50, 730, 1300);
		f.setLayout(null);
		
		
		//배경으로 지정할 이미지 선택
		ImageIcon back = new ImageIcon("images/배경화면.jpg");
		JLabel img_back = new JLabel(back);
		img_back.setBounds(0, 0, 730, 1300);
		f.add(img_back);
		
		ImageIcon btIcon = new ImageIcon("images/vs.jpg");
		JButton btn = new JButton(btIcon);
		btn.setBounds(50, 50, 175, 175);
		f.add(btn);
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.repaint();
		f.setVisible(true);
	}//main

}
