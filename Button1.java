import javax.swing.*;	
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Button1 {
	public static void main(String [] args ) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				ButtonFrame frame = new ButtonFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});			
				
	}

}
class ButtonFrame extends JFrame {
	public ButtonFrame(){
	setTitle("Button test");
	setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	JButton yellowbutton= new JButton("yellow");
	JButton bluebutton = new JButton("Blue");
	
	buttonPanel = new JPanel();
	buttonPanel.add(yellowbutton);
	buttonPanel.add(bluebutton);
	
	add(buttonPanel);
	ColorAction yellowAction = new ColorAction(Color.YELLOW);
	ColorAction blueAction = new ColorAction(Color.BLUE);
	
	yellowbutton.addActionListener(yellowAction);
	bluebutton.addActionListener(blueAction);
}

private class ColorAction implements ActionListener{
	public ColorAction(Color c){
		backgroundColor=c;
		
	}
	public void actionPerformed(ActionEvent e){
		buttonPanel.setBackground(backgroundColor);
	}
	private Color backgroundColor;
}
private JPanel buttonPanel;
public static final int DEFAULT_WIDTH=30;
public static final int DEFAULT_HEIGHT=200;

}