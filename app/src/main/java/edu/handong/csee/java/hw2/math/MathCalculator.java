package edu.handong.csee.java.hw2.math;

/**This is class of MathCalculator that has one field and methods for math calculator functions */
public class MathCalculator {

    private String name;

    /** This Method set name string of MathCalculator instances with the Driver Name written by the user */
    public void setName(String a){
        this.name=a;
    }
    /** This method returns the driver Name that is already set by setName method*/
    public String getName() {
        return name;
    }  
    /** This method returns the biggger integer number out of int a and int b */
    public int getMax(int a, int b) {
        if (a>b) return a;
        else return b;
    }
    /** This method returns the smaller integer number out of int a and int b */
    public int getMin(int a, int b) {
        if (a<b) return a;
        else return b;
    }
    /** This method returns the absolute value of int a */
    public int getAbs(int a) {
        if (a>=0) return a;
        else return a*-1;
    }
    /** This method returns the sum of int a and int b */
    public int getSum(int a, int b) {
        return a+b;
    }
    /** This method returns the difference of int a and int b */
    public int getDiff(int a, int b) {
        return a-b;
    }
    /** This method returns the product of int a and int b */
    public int getProduct(int a, int b) {
        return a*b;
    }
    /** This method returns the quotient value of int a divided by int b*/
    public int getQuotient(int a, int b) {
        if (b==0) return 0;
        else return a/b;
    }
    /** This method returns the remainder value of int a divided by int b*/
    public int getRemainder(int a, int b) {
        if (b==0) return a;
        else return a%b;
    }
    /** This method returns int a to the power of int b */
    public int getPower(int a, int b) {
        if (a==0) return 0;
        if (b==0 || a==1) return 1;
        if (b>0) {
            if (b==1) return a;
            return a*getPower(a, b-1);
        }
        else {
            int c=getAbs(b);
            if (b==1) return a;
            int d=a*getPower(a, c-1);
            return 1/d;
        }
    }
    /** This method returns factorial of argument */
    public int getFactorial(int a) {
        if (a==0) return 1;
        if (a>0) {
            if (a<2) return a;
            else return a*getFactorial(a-1);
        }
        else {
            if (a==-1) return -1;
            else return a*getFactorial(a+1);
        }
    }
    /** This method returns the greatest common divisor of int a and int b*/
    public int getGcd(int a, int b) {
        if (a<0) a=getAbs(a);
        if (b<0) b=getAbs(b);
        int tmp, n;
        if (a==0 || b==0) return 0;
        if(a<b){
            tmp = a;
            a = b;
            b = tmp;
        } 
        while(b!=0){
            n = a%b;
            a = b;
            b = n;
        }
        return a;
    }
    /** This method returns the least common multiple of int a and int b */
    public int getLcm(int a, int b) {
        int c=getGcd(a, b);
        if (c==0) return 0;
        else return getAbs(a*b/c);
    }
    /** This method returns the square root value of int a */
    public int getSquare(int a) {
        return a*a;
    }
}