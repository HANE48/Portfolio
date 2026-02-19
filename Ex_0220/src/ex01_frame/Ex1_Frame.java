package ex01_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_Frame {
	
	public static void main(String[] args) {
		
		Frame frame = new Frame("Frame Title");
		frame.setSize(400, 300); 		//width, height
		frame.setLocation(500, 100); 	//x, y
		
		frame.setBackground(Color.BLUE);
		frame.setVisible(true);			//생성된 프레임을 보이게 처리
		
		
	}//main
}
