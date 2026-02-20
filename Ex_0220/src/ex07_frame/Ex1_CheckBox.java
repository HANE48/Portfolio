package ex07_frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_CheckBox {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 200, 500, 400);
		f.setLayout(null);
		
		Font font = new Font("", Font.BOLD, 30);		//폰트, 어떻게 표시, 픽셀
		Label q1 = new Label("1. 관심분야는 무엇입니까?");
		q1.setFont(font);
		q1.setBounds(10, 30, 400, 50);
		
		Label q2 = new Label("2. 성별은 무엇입니까?");
		q2.setFont(font);
		q2.setBounds(10, 100, 400, 50);
		
		//체크박스 객체 생성
		Checkbox news = new Checkbox("news");
		news.setBounds(30, 80, 70, 30);
		
		Checkbox movie = new Checkbox("영화관람");
		movie.setBounds(101, 80, 70, 30);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("남자", group, false);
		Checkbox female = new Checkbox("여자", group, false);
		male.setBounds(30, 170, 70, 30);
		female.setBounds(100, 170, 70, 30);
		
		//체크박스 선택여부 판단
		news.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				String str = e.getStateChange() == 1 ? "news selected" : "news unselected";
				System.out.println(str);
				
			}
		});
		
		//라디오버튼에 감지자 등록
		male.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("male");
			}
		});

		female.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("female");
			}
		});
		
		

		//f에 각종 컴포넌트 추가
		f.add(q1);
		f.add(news);
		f.add(movie);
		f.add(q2);
		f.add(male);
		f.add(female);
		
		f.addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//f.dispose();
				System.exit(0);
			}

		});
		
		
		f.setVisible(true);
		
		
	}//main
	
}
