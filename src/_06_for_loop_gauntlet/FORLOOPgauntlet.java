package _06_for_loop_gauntlet;

public class FORLOOPgauntlet {
	public static void main(String[] args) {

//The goal of this assignment is to make you a master of utilizing for loops. Complete all the for loop challenges on the paper. Please read each challenge carefully and make sure that your for loops display exactly what is asked. If you finish them all, try the bonus challenge.

//2. Display all numbers from 100 to 0
//3.// Display all even numbers from 2 to 100
///4. D//isplay all odd numbers from 1 to 99
//5. Dis//play all numbers from 1 to 500. If the number is odd, print �odd� next to the number. If the number is even, print �even� next to the number.
		// Eg://
		// 1 is odd
		// 2 is even
		// 3 is odd
		// 4 is even
		// 5 is odd...etc.
//
//6. Display all multiples of 7 from 0 to 777.
//7. Print all the years you were alive and how old you were in each. e.g. �In 1979, i was 2 years old.� (for a really old person)

//Nested For-Loops
//Write nested for loops (a for loop inside another for loop) to do the following:

//1. Display this output:
		// 0 0
		// 0 1
		// 0 2
		// 1 0
		// 1 1
		// 1 2
		// 2 0
		// 2 1
		// 2 2

//2. Display the numbers 1 through 9 in a 3x3 square grid like this:
		// 1 2 3
		// 4 5 6
		// 7 8 9

//3. Display the numbers 1 through 100 in a 10x10 square grid.
//4. Display the following output:
//         *
		// * *
		// * * *
		// * * * *
		// * * * * *
		// * * * * * *
//**Bonus**
//Write a for loop that counts down from 100 to 0. However, the for loop must start with for(int i = 0; and you may NOT have any code ABOVE your for loop.
		// for (int i = 0; i < 101; i++) {
		// System.out.println(i);
		// }
		//for (int i = 0; i < 101; i++) {
			//System.out.println(i);
		//}
		//for (int i = 2; i < 100; i++) {
			//System.out.println(i);
		//}
		//for (int i = 1; i < 99; i++) {
			//if(i%2==1) {
				//System.out.println(i);
			//}
			//for (int i = 0; i < 500; i++) {
				//if (i%2==1) {
					//System.out.println(i+" is odd");
				//}
				//if (i%2==0) {
					//System.out.println(i+" is even");
				//}
			//}
		//for (int i = 0; i < 777; i++) {
			//if (i%7==0) {
				//System.out.println(i);
			//}
		//}
	//for (int i = 0; i < 12; i++) {
		//System.out.println("In "+(2008+i)+" i was "+i+" years old");
	//}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		System.out.println(i+" "+j);
		}
	}
	for (int i = 1; i < 8; i+=3) {
		for (int j = 0; j < 3; j++) {
			System.out.print(i+j+" ");
		}
		System.out.println();
	}
	for (int i = 1; i < 100; i+=10) {
		for (int j = 0; j < 10; j++) {
			System.out.print(i+j+" ");
	}
		System.out.println();
	}
	for (int i = 1; i < 7; i++) {
		for (int j = 0; j < i; j++) {
	System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	}
		
		
		
		
		
	}

