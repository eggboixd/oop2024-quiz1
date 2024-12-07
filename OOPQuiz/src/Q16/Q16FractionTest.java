package Q16;

import java.util.Scanner;

public class Q16FractionTest {

    /*
     * 
     * same as previous problems, i used java scannner to get input from users to make it easier to test multiple test cases
     */
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);


    //asks users to input the numerator and denominator for first fraction and initializes object for the fraction
    System.out.println("Enter first numerator and denominator");
    int n1 = myObj.nextInt();
    int d1 = myObj.nextInt();
    Q16Fraction f1 = new Q16Fraction(n1, d1);
    
    //asks users to input the numerator and denominator for first fraction and initializes object for the fraction
    System.out.println("Enter second numerator and denominator");
    int n2 = myObj.nextInt();
    int d2 = myObj.nextInt();
    Q16Fraction f2 = new Q16Fraction(n2, d2);

    //gets the sum and product of the fraction using the getSum and getProduct function from the Q16Fraction class
    Q16Fraction sum = f1.getSum(f2);
    Q16Fraction product = f1.getProduct(f2);

    //print out the sum and product of the fractions
    System.out.println("Sum of fractions: " + sum);
    System.out.println("Product of fractions: " + product);

    myObj.close();

    }
    
}
