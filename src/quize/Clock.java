package quize;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clock {
	
	public Date date;
	public SimpleDateFormat simpl;
	
	public void timefunc() {
		
		simpl = new SimpleDateFormat("a hh시 mm분 ss초");
		
		String s = simpl.format(date);
		
		JFrame frame = new JFrame();
		Container c = frame.getContentPane(); 
		JLabel label = new JLabel();
		label.setText(s);
		
		Font font = new Font(null, Font.BOLD, 32);  
		label.setFont(font); 
		label.setHorizontalAlignment(JLabel.CENTER); // 가운데정렬
		
		c.add(label);
		
		frame.setLocation(1000, 200); // 위치 지정
		frame.setPreferredSize(new Dimension(500,200)); // 사이즈 지정
		frame.pack(); // 설정값 적용 
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
