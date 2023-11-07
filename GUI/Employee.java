import javax.swing.*;
import java.util.*;

public class Employee{
	public static void main(String... args){
		String name="invald name",DOB="Invalid DOB",country="Invald";
		int salary=-1;
		try{
			name=JOptionPane.showInputDialog(null,"enter your name");
			try{
				DOB=JOptionPane.showInputDialog(null,"enter your date of birth");
				try{
					String s;
					s=JOptionPane.showInputDialog(null,"enter your salary");
					salary=Integer.parseInt(s);
					try{
						country=JOptionPane.showInputDialog(null,"enter your country");
					}catch(NumberFormatException nfe){
						JOptionPane.showMessageDialog(null,"unexpected error");
						return;
					}
				}catch(NumberFormatException nfe){
					JOptionPane.showMessageDialog(null,"unexpected error");
					return;
				}	
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"unexpected error");
				return;
			}
		}catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null,"unexpected error");
			return;
		}
		JOptionPane.showMessageDialog(null,"Name : "+name+"\nDOB : "+DOB+" \nSalary : "+salary+" \nCountry :"+country);	
	}
}
