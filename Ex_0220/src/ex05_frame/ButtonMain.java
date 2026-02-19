package ex05_frame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ButtonMain {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		//버튼 객체를 준비
		Button b = new Button("확인");
		Button btnClose = new Button("종료");
		Button btnAdd = new Button("새 프레임");
			
		
		b.setBounds(80, 90, 100, 50);
		btnClose.setBounds(230, 90, 100, 50);
		btnAdd.setBounds(150, 200, 100, 50);
		
		
		f.setBounds(500, 200, 400, 400);
		f.setVisible(true);
		
		//프레임의 자동배치 설정을 끈다.
		f.setLayout(null);
		
		//준비된 프레임에 버튼을 추가
		f.add(b);
		f.add(btnClose);
		f.add(btnAdd);
	
		
		//버튼에 클릭감지자를 추가
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("click OK Button");
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("click exit");
				System.exit(0);
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Frame f2 = new Frame();
				f2.setBounds(500, 300, 300, 250);
				f2.setVisible(true);
				f2.addWindowListener(new WindowAdapter() {
				
					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						super.windowClosing(e);
						//원하는 프레임만 단독으로 종료
						f2.dispose();
					}
					
				});
			}
		});
		
		
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		} );
		
		
		
	}//main

}
