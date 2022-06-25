package com.bridgelabz.lineofcomparison;
//Use Java ObjectOriented Programming Concepts of Line and Point as well as equals and compareTo methods.
public class  LineComparisonUC4 {
    public static void main(String[] args) {
        Line1 test1 = new Line1();
        test1.calculateLength();
        test1.printEquals();
        test1.checkEquals();
        Line2 test2 = new Line2();
        test2.printCompare();
        test2.toCompare();
    }
}
class Line1 extends Equals {
    public void printEquals(){
        System.out.println("Check line are Equal: ");
    }
}
class Line2 extends Compare {
    public void printCompare(){
        System.out.println("Check which line is Greater:");
    }
}

