package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		rob.hide();
		//2. Set the speed to 100
		rob.setSpeed(100);
		rob.penDown();
		int colorChoice=JOptionPane.showOptionDialog(null, "Wassup", "THIS IS THE TITLE", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"red 1","blue 2", ""
				+ "yellow 3"}, 0);
		System.out.println(colorChoice);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice==0) {
		rob.setPenColor(Color.RED);	
		}
		if (colorChoice==1) {
			rob.setPenColor(Color.BLUE);
		}
		if (colorChoice==2) {
			rob.setPenColor(Color.YELLOW);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String plygn = JOptionPane.showInputDialog("How many polygons do you want?");
		int x = Integer.parseInt(plygn);
		//5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 3; j++) {
				rob.move(100);
				rob.turn(120);
			}
			rob.turn(360/x);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

