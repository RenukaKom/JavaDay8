package com.bridgelabz.lineofcomparison;
//As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates
// using the Cartesian system, So that I can calculate its length.
import java.util.Scanner;
public class LineComparisonUC1 {
    public static void main(String[] args) {
        Length len = new Length();
        len.calculateLength();
    }
}
class Length{
    static double distance1,distance2;
    public void calculateLength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the co-ordinates of line 1 for point x");
        double x1= sc.nextInt();
        double x2= sc.nextInt();
        System.out.println("enter the co-ordinates of line 1 for point y");
        double y1= sc.nextDouble();
        double y2= sc.nextDouble();
        Scanner line2 = new Scanner(System.in);
        System.out.println("enter the co-ordinates of line 2 for point x");
        double p1= line2.nextInt();
        double p2= line2.nextInt();
        System.out.println("enter the co-ordinates of line 2 for point y");
        double q1= line2.nextDouble();
        double q2= line2.nextDouble();
        distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        distance2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
        System.out.println("distance between two co-ordinates of line 1 is : " + distance1);
        System.out.println("distance between two co-ordinates of line 2 is : " + distance2);

    }
}