
package Model;

public class Number {
    int numerator;
    int denominator;

    public Number(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public Number (int number){
        this.numerator = number;
        this.denominator = 1;
    }
    
    public Number (long number){
        //falta
    }
    
    public Number (double number){
        //falta
    }

    public Number add (Number number){
        return null;
    }
    
    public Number multiply (Number factorA, Number factorB){
        return null;
    }
    
    public Number divide (Number dividend, Number divisor){
        return null;
    }
}
