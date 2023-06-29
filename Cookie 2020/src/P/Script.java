package P;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Script extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Script()
	{
		JButton Cookie = new JButton();
		Cookie.setBackground(new Color(0,0,0,0));
		Cookie.setIcon(new ImageIcon(getClass().getResource("res/Cookie.png")));
		Cookie.setBounds(100, 100, 20, 20);
		JPanel JP = new JPanel();
		JP.add(Cookie);
		this.add(JP);
	}
	public static void main(String[] args)
	{
		Script frame = new Script();
		frame.setExtendedState(MAXIMIZED_BOTH);
		frame.setVisible(true);
	}
}
