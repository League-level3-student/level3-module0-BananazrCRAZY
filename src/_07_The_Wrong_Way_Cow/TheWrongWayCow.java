/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.HashMap;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	int i = 0, j = 0;
    	int n = 0, s = 0, e = 0, w = 0;
    	int[] arr = null;
    	HashMap<String, int[]> name = new HashMap<String, int[]>(4);
    	for (i = 0; i < field.length; i++) {
    		for (j = 0; j <field[i].length; j++) {
    			if (name.size() > 1 && (n + e + s + w) > 2) {
    				i = field.length;
    				break;
    			}
    			if (field[i][j] == 'c') {
    				int numRows = field.length;
    				int numCol = field[i].length;
    				if (n < 2) {
    					if ((i + 2) < numRows && field[i + 1][j] == 'o' && field[i + 2][j] == 'w') {
    						name.put("north", new int[] {j, i});
    						n++;
    						continue;
    					}
    				}
    				if (w < 2) {
    					if ((j + 2) < numCol && field[i][j + 1] == 'o' && field[i][j + 2] == 'w') {
    						name.put("west", new int[] {j, i});
    						w++;
    						continue;
    					}
    				}
    				if (e < 2) {
    					if ((j - 2) >= 0 && field[i][j - 1] == 'o' && field[i][j - 2] == 'w') {
    						name.put("east", new int[] {j, i});
    						e++;
    						continue;
    					}
    				}
    				if (s < 2) {
    					if ((i - 2) >= 0 && field[i - 1][j] == 'o' && field[i - 2][j] == 'w') {
    						name.put("south", new int[] {j, i});
    						s++;
    						continue;
    					}
    				}
    			}
    		}
    	}
    	if (n == 1) {
    		arr = name.get("north");
    	} else if (w == 1) {
    		arr = name.get("west");
    	} else if (e == 1) {
    		arr = name.get("east");
    	} else if (s == 1) {
    		arr = name.get("south");
    	}
        return arr;
    }
}
