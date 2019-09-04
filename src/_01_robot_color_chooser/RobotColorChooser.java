//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot num =new Robot();
		for (int i = 0; i < 690; i++) {
			
		
		//3. Ask the user what color they would like the robot to draw
	String sans =	 JOptionPane.showInputDialog( "what color would like the robot to draw");
		//5. Use an if/else statement to set the pen color that the user requested
if (sans.equals("red") ) {
	num.setPenColor(Color.red);
}else if(sans.equals("black")){
	num.setPenColor(Color.black);

}
        //6. If the user doesn’t enter anything, choose a random color
else{
			num.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		num.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		num.setSpeed(100);
		num.penDown();
		
		num.move(100);
		num.turn(50);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	}

}