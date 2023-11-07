import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Hello_World{
	public static void main(String... args){
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(400,400));
		frame.setLocation(new Point(700,400));
		frame.setBackground(Color.GRAY);
		frame.add(new JButton("button 1"));
		frame.add(new JButton("button 2"));
		frame.add(new JButton("Longest Button here "));
		frame.add(new JRadioButton("option 1"));
		frame.add(new JSlider(0,10,0));
		FlowLayout  layout=new FlowLayout(4,3,3);
        frame.setLayout(layout);
		frame.setVisible(true);
	}
}
