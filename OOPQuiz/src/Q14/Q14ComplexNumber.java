package Q14;

public class Q14ComplexNumber {

    /*
     * for this problem i first set integer values for real and imaginary numbers
     * and i then initalize them in the constructor below
     * 
     * i then added functions to calculate the complex numbers such ass adding, subtracting,
     * and multiplying.
     * 
     * for all of these functions, they all take the values of real and imaginary numbers from
     * the constructor
     * 
     * for the addition function it adds up the first real number with the second real number
     * and adds the first imaginary number with the second imaginary number.
     * 
     * same thing goes with subtraction
     * 
     * it's a bit different with multiplication, but it basically uses the pattern below
     * (a + bi) * (c + di) = (a * c - b * d) + (a * d + b * c)i
     * 
     * 
     */

    private int real, imag;

    public Q14ComplexNumber(int real, int imag) {
        this.real = real;  
        this.imag = imag;  
    }

    public static Q14ComplexNumber add(Q14ComplexNumber n1, Q14ComplexNumber n2) {
        Q14ComplexNumber res = new Q14ComplexNumber(0, 0);
        res.real = n1.real + n2.real;
        res.imag = n1.imag + n2.imag;
        return res;
    }

    public static Q14ComplexNumber sub(Q14ComplexNumber n1, Q14ComplexNumber n2) {
        Q14ComplexNumber res = new Q14ComplexNumber(0, 0);
        res.real = n1.real - n2.real;
        res.imag = n1.imag - n2.imag;
        return res;
    }

    public static Q14ComplexNumber mult(Q14ComplexNumber n1, Q14ComplexNumber n2) {
        Q14ComplexNumber res = new Q14ComplexNumber(0, 0);
        res.real = (n1.real * n2.real) - (n1.imag * n2.imag); // (ac - bd)
        res.imag = (n1.real * n2.imag) + (n1.imag * n2.real); // (ad + bc)
        return res;
    }

    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}
