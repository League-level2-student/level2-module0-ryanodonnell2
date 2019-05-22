package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


public class _01_RobotRace {
	//1. make a main method
	
	public static void main(String[] args) {
	//2. create an array of 5 robots.
	int x = 0;
		Robot r[] = new Robot[5];
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < r.length; i++) {
			String name = "Robot"+i;
			r[i] = new Robot();
			
			r[i].moveTo(50+200*i, 550); 
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	while(x<1) {
		Random randy = new Random();
		for (int i = 0; i < r.length; i++) {
			r[i].setSpeed(25);
			r[i].move(randy.nextInt(50));
		}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}