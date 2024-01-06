package sql;

import java.util.Scanner;

public class MainOfDataBase 
{
 public static void main(String[] args) 
 {
	 while(true) 
	 {
	Scanner scn=new Scanner(System.in);
	System.out.println("1.oracle\n2.mysql\n3.mssql");
	int choice=scn.nextInt();
	switch(choice)
	{
	case 1 : Oracle o=new Oracle();
	         o.connect();
	         o.disconnect();
	         break;
	
	case 2 : MySql m1=new MySql();
	        m1.connect();
	        m1.disconnect();
	        break;
	   
	case 3 : MsSql m2=new MsSql();
	         m2.connect();
	         m2.disconnect();
	         break;
	         
	default : System.out.println("INVALID OPTION");   
	 }
	}
}
}
