package _06_birthday_reminder;
import javax.swing.JOptionPane;

public class Berthday {
public static void main(String[] args) {
	
	// 1. correct the birthdays for your family below
			String momsBirthday = "January 24th";
			String dadsBirthday = "June 9th";
			String myBirthday = "April 16th";

			// 2. Find out which birthday the user wants and and store their response in a variable
		
			String mun= JOptionPane.showInputDialog("what berthday do you whont");
			// 3. Print out what the user typed
			System.out.println(mun);
			// 4. if user asked for "mom"
				//print mom's birthday
			if (mun.equals("mom")) {
				System.out.println(800);

			}
			// 5. if user asked for "dad"
			// print dad's birthday
			if (mun.equals("dad")) {
				
			}
			// 6. if user asked for your name
			// print myBirthday
			
			//7. otherwise print "Sorry, i don't remember that person's birthday!"
	System.out.println("Sorry, i don't remember that person's birthday!");
		
}
}
