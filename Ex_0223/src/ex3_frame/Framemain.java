package ex3_frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Framemain {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 200, 300, 450);
		f.setBackground(Color.yellow);
		f.setLayout(null);
		
		Font font = new Font("", Font.PLAIN, 20);
		
		//최상단 컴포넌트
		TextField tf = new TextField();
		tf.setFont(font);
		tf.setBounds(10, 30, 200, 25);
		
		Button enter = new Button("Enter");
		enter.setBounds(211, 30, 80, 25);
		enter.setEnabled(false);
		
		TextArea ta = new TextArea();			//중앙에 들어갈 컴포넌트
		ta.setFont(font);
		ta.setBounds(10, 55, 280, 320);
		ta.setEditable(false);					//직접 입력하지 못하게 비활성화
		
		Button save = new Button("Save");		//최하단에 들어갈 컴포넌트
		save.setFont(font);
		save.setBounds(10, 375, 130, 45);
		
		Button close = new Button("Close");
		close.setFont(font);
		close.setBounds(145, 375, 130, 45);
		
		//텍스트 필드에 값이 들어가 있는 경우
		//버튼을 누를수 있게
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {	
				if(tf.getText().trim().equals("")) {
					enter.setEnabled(false);
				}else {
					enter.setEnabled(true);
				}
			}
		});
		
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n"); // 텍스트 에어리어에 입력한 내용을 넣음
				tf.setText(""); 				// 텍스트 필드의 내용을 비움
				tf.requestFocus();
			}
		});
		
		//텍스트필드에서 엔터가 감지되면 엔터키를 누른것과 같은 효과 주기
		tf.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {	//키보드에 언테버튼을 누른경우
					ta.append(tf.getText() + "\n"); 		// 텍스트 에어리어에 입력한 내용을 넣음
					tf.setText(""); 						// 텍스트 필드의 내용을 비움
					tf.requestFocus();
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {}	
			@Override
			public void keyPressed(KeyEvent e) {}
		});
		
		//닫기버튼 이벤트 감지자 등록
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sb = ta.getText();
				FileWriter fw = null;
				BufferedWriter bw = null;
				try {
					FileDialog fd = new FileDialog(f, "save", FileDialog.SAVE);	//저장하거나 불러오기를 할때 사용하는 대화상자를 만들어줌
					fd.setVisible(true);
					
					//저장을 위한 경로 읽기
					String path = fd.getDirectory() + fd.getFile();
//					System.out.println(path);
					File file = new File(path);
					fw = new FileWriter(file);
					bw = new BufferedWriter(fw);
					
					bw.write(sb);
					bw.flush();
					
					JOptionPane.showMessageDialog(f, "저장 성공");	//지정한 프레임을 기준으로 나타남
					
				}catch (Exception ex) {
					// TODO: handle exception
				}finally {
					if(fw != null || bw != null) {
						try {
							bw.close();
							fw.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				}
				
			}
		});
		
		//프레임에 컴포넌트 담기
		f.add(tf);
		f.add(enter);
		f.add(ta);
		f.add(save);
		f.add(close);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setResizable(false);
		f.setVisible(true);
	}//main

}
