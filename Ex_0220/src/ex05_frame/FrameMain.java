package ex05_frame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 200, 400, 400);
		f.setBackground(Color.CYAN);
		
		//프레임에게 종료감지자 등록
		//익명 내부클래스를 이용
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				Frame f2 = new Frame();
				f2.setBounds(500, 300, 200, 100);
				f2.setVisible(true);
			}
		} );
		
		f.setVisible(true);
		
		
	}//main

}
