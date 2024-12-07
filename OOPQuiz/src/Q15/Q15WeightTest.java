package Q15;

import java.util.Scanner;


public class Q15WeightTest {
    /*
     * for this part i used a scanner function to get inputs from users
     * 
     * first i ask the users what they want to convert to. if it is 1 then we convert from pounds to kilogram
     * if it is 2 then we convert from kilogram to pounds
     */
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        Q15Weight converter = new Q15Weight();

        System.out.println("What do you want to convert to?");
        System.out.println("1. Pounds to Kilogram");
        System.out.println("2. Kilograms to Pounds");

        int n = myObj.nextInt();

        if(n == 1){
            //if user inputs 1 then we get pound value we want to convert
            int val = myObj.nextInt();
            //after that we use the convert function to convert the value to kilogram and then we print it
            double kiloConvert = converter.getKilograms(val);
            System.out.println(kiloConvert);
        } else if (n == 2) {
            //if user inputs 2 then we get kilogram value we want to convert
            int val = myObj.nextInt();
            //after that we use the convert function to convert the value from kilograms to pounds and then we print it
            double poundConvert = converter.getPounds(val);
            System.out.println(poundConvert);
        }

        myObj.close();
    }
}
