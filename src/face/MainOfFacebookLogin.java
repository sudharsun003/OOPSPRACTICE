package face;

import java.util.Scanner;

public class MainOfFacebookLogin 
{
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	FacebookLogin f=new FacebookLogin();
	System.out.println("1.LOGIN PHONENUMBER\t2.LOGIN EMAIL");
	System.out.println("PLEASE MAKE A CHOICE");
	int choice=scn.nextInt();
	switch(choice)
	{
	case 1: System.out.println("ENTER THE PHONENUMBER");
	        long phonenumber=scn.nextLong();
	        System.out.println("ENTERR THE PASSWORD1");
	        String password1=scn.next();
	        f.login(phonenumber, password1);
	
	case 2:System.out.println("ENTER THE EMAIL");
	       String email=scn.next();
	       System.out.println("ENTER PASSWORD2");
	       String password2=scn.next();
	       f.login(email, password2);
	       
	 break ;
	 default : System.out.println("INVALID CHOICE");
			 
	}
}
}
