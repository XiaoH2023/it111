import javax.swing.*;
import java.awt.*;

public class ShowWindow2{

	public static void main(String[] args){
		final int WINDOW_WIDTH  = 400;
		final int WINDOW_HEIGHT = 600;
		final int X_MARGIN = 10;
		final int Y_MARGIN = 50;
		final int Y_OFFSET = 50;

		JFrame window = new JFrame();
		window.setTitle("A Simple Window");
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window.getContentPane().setBackground(Color.RED);
		window.setLocation(700,200);

		JLabel myLabel  = new JLabel("My First Big Label!!!");
		JLabel myLabel2  = new JLabel("My Second Big Label!!!");
		JTextField text1 = new JTextField ();
		JTextField text2 = new JTextField ();

		myLabel.setFont(new Font(null, Font.PLAIN, 24));
		myLabel2.setFont(new Font(null, Font.BOLD, 24));

		window.setLayout(null);

		myLabel.setBounds(	X_MARGIN, Y_MARGIN, 			300, 30);
		text1.setBounds(	X_MARGIN, Y_MARGIN + Y_OFFSET, 300, 30);
		myLabel2.setBounds(	X_MARGIN, Y_MARGIN + 2*Y_OFFSET, 300, 30);
		text2.setBounds(	X_MARGIN, Y_MARGIN + 3*Y_OFFSET, 300, 30);

		window.add(myLabel);
		window.add(myLabel2);
		window.add(text1);
		window.add(text2);

		window.setVisible(true);
	}

}
