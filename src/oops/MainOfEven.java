package oops;

import java.util.Scanner;

public class MainOfEven 
{
  public static void main(String[] args) 
  {
	Scanner scn=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=scn.nextInt();
	Even.print(n);
}
}
