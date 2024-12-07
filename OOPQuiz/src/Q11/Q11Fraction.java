package Q11;

import java.util.Scanner;

public class Q11Fraction {
    /*
     * for this problem we want to calculate the sum and product of two fractions
     * to do this i first initialize the variables for numerators and denominators for each fraction
     * 
     * i then use a scanner function in order to get input from users so that we can test using a variety of test cases
     * 
     * after the user inputs the values and it is set to the variables, i then set the calculation for the sum
     * for the sum the numerator calculation is (e1 * d2) + (e2 * d1) and for the denominator is d1 * d2
     * 
     * then for the product we just calculate numerator with numerator and denominator with denominator
     * ep_num = e1 * e2;  
     * ep_den = d1 * d2;
     *  
     * after the numerators and denominators for the sum and products have been calculated we then print it
     */
    public static void main(String[] args){
        int e1, d1, e2, d2;
        int es_num, es_den, ep_num, ep_den;

        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter values for e1, d1, e2, d2 (separated by space):");
        e1 = myObj.nextInt();  
        d1 = myObj.nextInt();  
        e2 = myObj.nextInt();  
        d2 = myObj.nextInt();  

        es_num = (e1 * d2) + (e2 * d1);  
        es_den = d1 * d2;  

        ep_num = e1 * e2;  
        ep_den = d1 * d2;  

        System.out.println("Sum of fractions: " + es_num + "/" + es_den);
        System.out.println("Product of fractions: " + ep_num + "/" + ep_den);

        myObj.close();
    }
}
