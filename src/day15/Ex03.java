package day15;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex03 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("����");
		// �ϳ��� Ʋ ����� �� (���� �ִ°� �����ڿ��� ���� �ο�)
		Container c = frame.getContentPane(); 
		JLabel label = new JLabel();
		label.setText("test");
		
		Font font = new Font(null, Font.ITALIC, 32); // ������ �۾�ũ�� 
		label.setFont(font); 
		label.setHorizontalAlignment(JLabel.CENTER); // �������
		
		c.add(label);
		
		frame.setLocation(1000, 200); // ��ġ ����
		frame.setPreferredSize(new Dimension(500,200)); // ������ ����
		frame.pack(); // ������ ���� 
		
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// x ��ư ������ ���α׷� ���� 
		
		
		for(int i = 0; ; i++) {
			label.setText(i + "�ٸ� ����");
		}
	
		
	}
	
}
