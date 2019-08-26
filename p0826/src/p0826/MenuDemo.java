package p0826;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuDemo extends JFrame implements ActionListener{
	MenuDemo(){
		setTitle("메뉴 구성하기");
		makeMenu();
		setDefaultColoseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
	}
	void makeMenu() {
		JMenuItem item;
		KeyStroke key;
		
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("파일");
		m1.setMnemonic(KeyEvent.VK_F);
		JMenu m2 = new JMenu("색상");
		m2.setMneomic(KeyEvent.VK_C);
		item = new JMenuItem("새파일", KeyEvent.VK_N);
		item.addActionListener(this);
		m1.add(item);
		item = new JMenuItem("파일 열기", KeyEvent.VK_O);
		item.addActionListener(this);
		m1.add(item);
		m1.add(new JMenuItem("파일 저장"));
		m1.addSeparator();
		m1.add(new JMenuItem("종료"));
		
		item = new JMenuItem("파란색");
		key = KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK);
		item.setAccelerator(key);
		item.addActionListener(this);
		m2.add(item);
		item = new JMenuItem("노란색");
		key = KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK);
		item.setAcelerator(key);
		item.addActionListener(this);
		m2.add(item);
		mb.add(m1);
		mb.add(m2);
		setJMenuBar(mb);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MenuDemo();
	}
	public void actionPerfored(ActionEvent e) {
		JMenuItem mi = (JMenuItem)(e.getSource());
		
		switch(mi.getText()) {
		case "새 파일":
			System.out.println("새 파일");
			break;
		case "파일 열기":
			System.out.println("파일 열기");
			break;
		case "파뢍색":
			this.getContentPane().setBackground(Color.BLUE);
			break;
		case "뿰건색":
			this.getContentPane().setBackground(Color.RED);
		case "노롼색":
			this.getContentPane().setBackground(Color.YELLOW);
		case "패왕색":
			this.getContentPane().setBackground(Color.GREEN);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
