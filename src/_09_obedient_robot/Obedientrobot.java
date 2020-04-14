package _09_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedientrobot {
	static Robot rob = new Robot();
public static void main(String[] args) {
	rob.hide();
	rob.penDown();
	rob.setSpeed(100);
	String color = JOptionPane.showInputDialog("What color do you want? Red, Blue, or Yellow");
	if (color.equalsIgnoreCase("Red")) {
		rob.setPenColor(Color.RED);
	}
	if (color.equalsIgnoreCase("Blue")) {
		rob.setPenColor(Color.BLUE);
	}
	if (color.equalsIgnoreCase("Yellow")) {
		rob.setPenColor(Color.YELLOW);
	}
	String shape = JOptionPane.showInputDialog("What shape do you want. Circle, Triangle, or Square?");
	if (shape.equalsIgnoreCase("Circle")) {
	drawCircle();
	}
	if (shape.equalsIgnoreCase("Triangle")) {
		drawTriangle();
	}
	if (shape.equalsIgnoreCase("Square")) {
		drawSquare();
	}
	
	
	
	
}
static void drawSquare() {
for (int i = 0; i < 4; i++) {
	rob.move(100);
	rob.turn(90);
}

}
static void drawTriangle() {
	for (int i = 0; i < 3; i++) {
		rob.move(100);
		rob.turn(120);
	}
}
static void drawCircle() {
	for (int i = 0; i < 36; i++) {
		rob.move(30);
		rob.turn(10);
	}
}
	}

