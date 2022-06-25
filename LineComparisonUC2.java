package com.bridgelabz.lineofcomparison;
//As a fan of geometry, I want to check equality of two lines
public class LineComparisonUC2 {
    public static void main(String[] args) {
        Equals eq = new Equals();
        eq.calculateLength();
        eq.checkEquals();
    }
}
class Equals extends Length{
    public void checkEquals(){
        String s1 = String.valueOf(distance1);
        String s2 = String.valueOf(distance2);
        if (s1.equals(s2)) {
            System.out.println("Line 1 and Line 2 are equal");
        }else System.out.println("Line 1 and Line 2 are unequal");
    }
}