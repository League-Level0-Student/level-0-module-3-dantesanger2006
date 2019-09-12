package _04_are_you_happy;
import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String mun=JOptionPane.showInputDialog("ARE YOU HAPPY!!!!");   
		if (mun.equals("yes")) {
			JOptionPane.showMessageDialog(null,"keap doing what you are doing ");
		}
		else {
		
			String num=JOptionPane.showInputDialog(" do you what to be happy");	
	if (num.equals("no")) {
		JOptionPane.showMessageDialog(null,"keap doing what you are doing ");
		
	} 
	else if(num.equals("yes")){
		
		JOptionPane.showMessageDialog(null, "change someing");

	}
	
		
		}
	}
}
