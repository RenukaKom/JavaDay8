package com.bridgelabz.lineofcomparison;
//As a fan of geometry, I want to compare two lines
public class LineComparisonUC3 {
    public static void main(String[] args) {
        Compare cmp = new Compare();
        cmp.calculateLength();
        cmp.toCompare();
    }
}
class Compare extends Length{
    public void toCompare(){
        String s1 = String.valueOf(distance1);
        String s2 = String.valueOf(distance2);
        if(s1.compareTo(s2) == 0){
            System.out.println("line 1 and line 2 are equal");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("line 1 is greater than line 2");
        }else {
            System.out.println("line 2 is greater than line 1");
        }

    }
}
