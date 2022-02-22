package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] ar = new String[5];
    	ar[0] = "a";
    	ar[1] = "b";
    	ar[2] = "c";
    	ar[3] = "d";
    	ar[4] = "e";
        // 2. print the third element in the array
    	System.out.println(ar[3]);
        // 3. set the third element to a different value
    	ar[3] = "f";
        // 4. print the third element again
    	System.out.println(ar[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for (int i = 0; i < ar.length; i++) {
    		ar[i] = "hi";
    		System.out.println(ar[i]);
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE

        // 7. make an array of 50 integers
    	int fif[] = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random ran = new Random();
    	int small = 999999999;
    	for (int i = 0; i < fif.length; i++) {
    		fif[i] = ran.nextInt();
    		if (small > fif[i]) small = fif[i];
    	}
    	System.out.println(small);
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	
        // 10 print the entire array to see if step 8 was correct
    	int big = -999999999;
    	for (int i = 0; i < fif.length; i++) {
    		System.out.println(fif[i]);
    		if (big < fif[i]) big = fif[i];
    	}
        // 11. print the largest number in the array.
    	System.out.println(big);
        // 12. print only the last element in the array
    	System.out.println(fif[49]);
    }
}
