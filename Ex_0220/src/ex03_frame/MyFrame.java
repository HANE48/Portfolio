package ex03_frame;

import java.awt.Frame;

public class MyFrame {

	public static void main(String[] args) {
		
		Frame fr = new Frame();
		fr.setSize(400, 400);
		fr.setLocation(500, 200);
		
		//프레임 우상단 속성버튼들의 상태를 감지하는 감지자
		MyListener ml = new MyListener();
		fr.addWindowListener(ml);
		
		fr.setVisible(true);
		
		
	}//main

}
