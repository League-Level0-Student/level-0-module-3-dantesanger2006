package _04_are_you_happy;

import javax.swing.JOptionPane;

public class ARYYOUHAPPY {
public static void main(String[] args) {
	String mun=JOptionPane.showInputDialog("ARE YOU HAPPY!!!!");   
	if (mun.equals("yes")) {
		JOptionPane.showMessageDialog(null,"keap doing what you are doing ");
	}
	else {
	}
		String num=JOptionPane.showInputDialog(mun+" why not");	
}
}