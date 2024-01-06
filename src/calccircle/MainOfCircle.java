package calccircle;

import java.util.Scanner;

public class MainOfCircle 
{
 public static void main(String[] args) 
 {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the value of radius");
	double radius=scn.nextDouble();
	Circle c=new Circle();
	c.print(radius);
}
}
