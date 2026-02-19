package ex04_frame;

import java.awt.Frame;

public class FrameMain {

	public static void main(String[] args) {
		
		Frame f = new Frame();
//		f.setSize(400,400);
//		f.setLocation(500, 200);
		
		//size, location 속성을 통합
		//인자로는 x,y,w,h순으로 들어감
		f.setBounds(500, 200, 400, 400);
		
		//f객체에 종료감지자 등록
		f.addWindowListener(new WinClosingListener());
		
		f.setVisible(true);
		
	}//main

}
