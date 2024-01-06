package abstrac;

import java.util.Scanner;

public class MainOfAnimal 
{
  public static void main(String[] args) 
  {
	Scanner scn=new Scanner(System.in);
	Animal.open();
	System.out.println("1.Lion\t2.Cat\t3.Dog");
	int choice=scn.nextInt();
	switch(choice)
	{
	case 1 : Loin l1=new Loin();
	         l1.sound();
	         Animal.close();
	         break;
	 
	case 2 : Cat c1=new Cat();
	         c1.sound();
	         Animal.close();
	         break;
	         
	case 3 : Dog d1=new Dog();
	         d1.sound();
	         Animal.close();
	         break;
	  
	default : System.out.println("INALID CHOICE");
		      
	}
  }
}
