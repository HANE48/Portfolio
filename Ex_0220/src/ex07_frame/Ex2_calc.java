package ex07_frame;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 계산기 만들기
 */

public class Ex2_calc {

	public static void main(String[] args) {
		
		MyListener ml = new MyListener();	//이벤트처리에 사용할 감지자
		Frame f = new Frame("Calculator");
		Font font = new Font("", Font.BOLD, 20);
		Label lb = new Label("0");
		Button[] nums = new Button[10];
		Button[] opers = new Button[5];
		String[] opStr = {"+", "-", "*", "/", "="};
		Button reset = new Button("C");
		
		f.setBounds(500, 200, 260, 300);		//x,y,w,h
		f.setLayout(null);
				
		lb.setFont(font);
		lb.setBounds(10, 180, 180, 100);
		ml.setLb(lb);
		
		//숫자 버튼을 배열로 만듬
		for(int i=0 ; i<nums.length ; i++) {
			nums[i] = new Button(Integer.toString(i));
			if(i>=0 && i<=4) {
				nums[i].setBounds(i*50 + 10, 40, 40, 40);
			}else {
				nums[i].setBounds((i-5)*50 + 10, 90, 40, 40);
			}
			f.add(nums[i]);
			nums[i].addActionListener(ml);		//숫자 버튼에 이벤트 감지자 등록
		}//for
		
		//연산버튼들
		for(int i=0 ; i<opers.length ; i++) {
			opers[i] = new Button(opStr[i]);
			opers[i].setBounds(i*50 + 10, 140, 40, 40);
			f.add(opers[i]);
			opers[i].addActionListener(ml); 	//연산자 버튼들에게 이벤트 감지자 등록
		}//for
		
		
		//초기화 버튼
		reset.setBounds(200, 210, 50, 50);
		reset.addActionListener(ml); 			//초기화 버튼에게 이벤트 감지자 등록
		
		//f에 컴포넌트들을 저장
		f.add(lb);		//label
		f.add(reset);	//reset button
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//f.setResizable(false); 		//레이아웃의 크기를 늘리거나 줄이지 못함
		f.setVisible(true);
		
	}//main
}
