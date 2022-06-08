package day15;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("연습");
		// 하나의 틀 만드는 것 (값을 넣는건 생성자에게 값을 부여)
		Container c = frame.getContentPane(); 
		JLabel label = new JLabel();
		label.setText("test");
		
		Font font = new Font(null, Font.ITALIC, 32); // 마지막 글씨크기 
		label.setFont(font); 
		label.setHorizontalAlignment(JLabel.CENTER); // 가운데정렬
		
		c.add(label);
		
		frame.setLocation(1000, 200); // 위치 지정
		frame.setPreferredSize(new Dimension(500,200)); // 사이즈 지정
		frame.pack(); // 설정값 적용 
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// x 버튼 누르면 프로그램 종료 
		
		
		for(int i = 0; ; i++) {
			label.setText(i + "다른 내용");
		}
	
		
	}
	
}
