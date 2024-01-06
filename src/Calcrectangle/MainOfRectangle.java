package Calcrectangle;

import java.util.Scanner;

public class MainOfRectangle 
{
 public static void main(String[] args) 
 {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the value of length");
	double length=scn.nextDouble();
	System.out.println("enter the value of breath");
	double breath=scn.nextDouble();
	Rectangle r=new Rectangle();
	r.print(length, breath);
}
}
