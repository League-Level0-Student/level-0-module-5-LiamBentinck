package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primenumber {
public static void main(String[] args) {
	String num = JOptionPane.showInputDialog("give a number please.");
	int num2 = Integer.parseInt(num);
	for (int i = 2; i < num2; i++) {
		if (num2%i == 0) {
			JOptionPane.showMessageDialog(null, "it is not prime.");
			System.exit(0);
		}
		
	}
	JOptionPane.showMessageDialog(null, "It's prime.");
	
	
	
	
	
	
	
	
	
	
}
}
