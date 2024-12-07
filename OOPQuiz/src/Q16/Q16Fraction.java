package Q16;

public class Q16Fraction {


    //initialize numerator and denominator
    private int numerator;
    private int denominator;
    
    //constructor to set numerator and denominator, and to set condition so that denominator isnt zero
    public Q16Fraction(int numerator, int denominator){
        this.numerator = numerator;
        if(denominator == 0){
            System.out.println("denominator cant be zero");
        }
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }


    //to print the numerator and denominator in strings after we set the new numerator and denominator
    public String toString(){
        return numerator + "/" + denominator;
    }


    //function to get sum of numerator and denominator
    public Q16Fraction getSum(Q16Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Q16Fraction(newNumerator, newDenominator);
    }

    //function to get product of numerator and denominator
    public Q16Fraction getProduct(Q16Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Q16Fraction(newNumerator, newDenominator);
    }

}
