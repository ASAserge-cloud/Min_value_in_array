
/**This program calculates the minimum value in an array created and
 * populated by the user.
 * Source code written by Awunjia Serge Atabong in Buea-cameroon
 * on the 17/08/2020, contact me directly at awujiaa2018@gmail.com whatsApp: +237 651565843.
 * This is a free and open source software(FOSS), feel free to modify accordingly and use.
 */

package com.ASAtech;

import java.util.Scanner;

//Main class
public class Main {

    //Creating the Scanner object
    private static Scanner read = new Scanner(System.in);

    //Main method that runs all codes
    public static void main(String[] args) {

        int size; //Declaring variable to hold the array size

        System.out.println("Enter the size of the array");
        size = read.nextInt();

        int myArray[] = new int[size];  //Creating the array with appropriate size

        //Loop to get user's input into array
        for(int i = 0; i < size; i++){
            System.out.printf("Enter value at position %d\n", i + 1);
            myArray[i] = read.nextInt();
        }

        int min = myArray[0]; //Assigning the first value of the array to min variable

        //Loop to check minimum value in the array
        for(int j = 1; j < size; j++){
            if(myArray[j] < min){
                min = myArray[j];
            }
        }

        //Printing out the minimum value
        System.out.println("Minimum value in array: " + min);
    }

    //Open source is love
}
