package ex07_frame;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener{

	private String num1 = "";	//연산자를 사용하기 전 숫자를 저장
	private String num2 = "";	//연산자를 사용 후 숫자를 저장
	private String op = "";		//연산자를 저장
	private int res1 = 0;		//+ - * 연산의 결과
	private float res2 = 0.0f;	// /연산의 결과
	private int phase = 0;		//단계를 구분하는 변수
	private Label lb;			
			
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch( e.getActionCommand() ) {	//사용자가 클릭한 버튼에 부착된 텍스트를 가져옴
		case "+":
		case "-":
		case "*":
		case "/":		//연산자를 누른경우
			op = e.getActionCommand();
			phase++;
			lb.setText(num1 + " " + op + " " + num2); 
			break;
			
		case "=":		//= 버튼을 누른경우
			int f = 0;
			in: switch (op) {
			case "+":
				res1 = Integer.parseInt(num1) + Integer.parseInt(num2);
				break in;
			case "-":
				res1 = Integer.parseInt(num1) - Integer.parseInt(num2);
				break in;
			case "*":
				res1 = Integer.parseInt(num1) * Integer.parseInt(num2);
				break in;
			case "/":
				res2 = Float.parseFloat(num1) / Float.parseFloat(num2);
				f++;
				break in;
			}// switch
			lb.setText(num1 + " " + op + " " + num2 + " = " + (f==0 ? String.format("%d", res1) : String.format(".1f", res2)));
			phase = 0;
			break;
			
		case "C":		//초기화 한 경우
			num1 = "";
			num2 = "";
			op = "";
			res1 = 0;
			res2 = 0;
			lb.setText(""); 
			phase = 0;
			break;
			
		default:		//숫자를 클릭한 경우
			if(phase == 0) {
				num1 += e.getActionCommand();
				lb.setText(num1);
			}else {
				num2 += e.getActionCommand();
				lb.setText(num1 + " " + op + " " + num2); 
			}
			break;
			
		}
	}//actionPerformed
	
	//화면 갱신을 위한 메서드
	public void setLb(Label lb) {
		this.lb = lb;
	}
	
	
}
