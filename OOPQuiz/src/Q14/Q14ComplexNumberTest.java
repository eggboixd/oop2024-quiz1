package Q14;

import java.util.Scanner;

public class Q14ComplexNumberTest {
    /*
     * 
     * for this part i used a scanner function in java in order to get inputs for the real and imaginary parts for the first and second complex number
     * 
     */

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        int r1 = myObj.nextInt();
        int i1 = myObj.nextInt();

        //initialize the class first
        Q14ComplexNumber num1 = new Q14ComplexNumber(r1, i1);

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        int r2 = myObj.nextInt();
        int i2 = myObj.nextInt();
        Q14ComplexNumber num2 = new Q14ComplexNumber(r2, i2);


        //after we get the values we put it into the functions that we have already made in the previous class
        Q14ComplexNumber addRes = Q14ComplexNumber.add(num1, num2);
        Q14ComplexNumber subRes = Q14ComplexNumber.sub(num1, num2);
        Q14ComplexNumber multRes = Q14ComplexNumber.mult(num1, num2);


        //we then print out the values for each function using the java print function
        System.out.println("Addition Result: ");
        addRes.display();

        System.out.println("Subtraction Result: ");
        subRes.display();

        System.out.println("Multiplication Result: ");
        multRes.display();

        myObj.close();
    }
}
