// 예제 10-2 : 내부 클래스로 Action 이벤트 리스너 만들기

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame{
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	/*
	 * •Action 리스너를 내부 클래스로 작성
	 * •private으로 선언하여 InnerClassListener 외부에서 사용할 수 없게함
	 * •리스너에서 InnerClassListener의 멤버에 대한 접근 용이
	 */
	
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			// InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
			InnerClassListener.this.setTitle(b.getText());
			// 프레임 타이틀에 버튼 문자열을 출력한다.
		}
	}
	public static void main(String[] args) {
		new InnerClassListener();
	}
}