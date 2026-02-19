package ex06_frame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest{

	//추후에 Label에 값을 변경하기 위한 변수
	static String str = "";
	static int num = 0;
			
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 200, 1000, 500);
		f.setLayout(null);
		f.setVisible(true);
			
		Label q1 = new Label();
		q1.setText("label result");
		q1.setBounds(50, 100, 700, 50);
		f.add(q1);
		
		Button btn1 = new Button("btn1");
		btn1.setBounds(100, 200, 200, 250);
		f.add(btn1);
		
		Button btn2 = new Button("btn2");
		btn2.setBounds(400, 200, 200, 250);
		f.add(btn2);
		
		Button btn3 = new Button("btn3");
		btn3.setBounds(700, 200, 200, 250);
		f.add(btn3);
		
		//버튼 클릭 감지자
		ActionListener ac = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// e.getActionCommand() 클릭한 버튼에 쓰인 텍스트
				System.out.println(e.getActionCommand());
				
				switch( e.getActionCommand() ) {
				case "btn1":
					num++;
					q1.setText("label result: " + num);
					break;
				case "btn2":
					num--;
					q1.setText("label result: " + num);
					break;
				case "btn3":	//현재 프레임 종료
					f.dispose();
					break;
				
				}
			}
		};
		
		//각 버튼에 클릭 이벤트 감지자를 추가
		
		btn1.addActionListener(ac);
		btn2.addActionListener(ac);
		btn3.addActionListener(ac);
		
		
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		} );
		
		
		
	}//main
}
