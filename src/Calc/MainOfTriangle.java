package Calc;

import java.util.Scanner;

public class MainOfTriangle 
{
  public static void main(String[] args) 
  {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the value of base");
	double base=scn.nextDouble();
	System.out.println("enter the value of height");
	double height=scn.nextDouble();
	Triangle t1=new Triangle();
	t1.print(base, height);
}
	}
