package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	static int botNum = 5;
	static Robot[] bot = new Robot[botNum];
	public static void main(String[] args) {
        // 2. create an array of 5 robots.
        // 3. use a for loop to initialize the robots.
		//createBot(5);
		// 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
//		for (int i = 0; i < bot.length; i++) {
//			Random ran = new Random();
//			bot[i].move(ran.nextInt(50));
//			if (bot[i].getY() <= 0) {
//				break;
//			} else if (i == bot.length) {
//				i = 0;
//			}
//		}
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
		
        // 7. declare that robot the winner and throw it a party!
		//top();
        // 8. try different races with different amounts of robots.
		top(6);
        // 9. make the robots race around a circular track.
		
	}
	
	static void top(int botNum) {
		createBot(botNum);
		int i = 0;
		while (bot[i].getY() >= 0) {
			Random ran = new Random();
			bot[i].move(ran.nextInt(50));
			if (i == bot.length-1) i = 0;
			else i++;
		} 
		System.out.println("The winner is robot " + i + "!");
	}
	
	static void createBot(int botNum) {
		bot = new Robot[botNum];
		int x = 100;
		for (int i = 0; i < bot.length; i++) {
			bot[i] = new Robot();
			bot[i].setY(570);
			bot[i].setX(x);
			x += 100;
			bot[i].setSpeed(100);
		}
	}
}
