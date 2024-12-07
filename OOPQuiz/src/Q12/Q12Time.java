package Q12;

import java.util.Scanner;

public class Q12Time {
    /*
     * for this problem we want to calculate the angle that two hands on a clock make counting from the hour hand counter clock-wise
     * 
     * first i set the minute angle to 6 degrees and hour angle to 60 degrees
     * 
     * then i use java scanners to get input from users in order to test different test cases
     * the format for the input is hour (enter) then minute. for example 
     * if i want to input 9:00 =
     * 9 (hour hand on 9)
     * 0 (minute hand 0)
     * 
     * i then set a condition for if users put hours above 24 or minutes above 60, they'd have to input a valid number
     * 
     * i then set it so that this program can handle military time (24 hour format) by giving the condition if the hours are above
     * 12 then i subtract it by 12 and set the new value to that.
     * 
     * then i count the hour hand position using the formula hours * hourAngle + (minutes / 2)
     * and i count the minute hand position using the formula 
     * minutes * minAngle
     * 
     * i then calculate the clockwise angle i subtract the hour hand position angle with the minute hand ==> hourHandPosition - minuteHandPosition
     * and i use the math.abs function in order to ensure that the value is never negative
     * 
     * and since we want to calculate the angle from the left of the hour hand, we then calculate the counterclockwise angle by doing 360 - counterclockwiseangle
     * 
     * once we find the angle, we then print it
     */

    public static void main(String[] args) {
        int hours, minutes;

        int minAngle = 6;  
        int hourAngle = 30;

        Scanner myObj = new Scanner(System.in);  

        System.out.println("Input hours and minutes:");
        hours = myObj.nextInt();
        minutes = myObj.nextInt();

        if (minutes >= 60 || hours >= 24) {
            System.out.println("Please input a valid number");
        } else {
            if (hours >= 12) {
                hours -= 12;
            }

            int hourHandPosition = hours * hourAngle + (minutes / 2); 
            int minuteHandPosition = minutes * minAngle;

            int clockwiseAngle = Math.abs(hourHandPosition - minuteHandPosition);

            int counterClockwiseAngle = 360 - clockwiseAngle;

            System.out.println("The angle from the left of the hour hand is " + counterClockwiseAngle);
        }

        myObj.close();
    }
}
