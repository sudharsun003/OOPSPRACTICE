package faculity;

public class MainOfFaculity
{
 public static void main(String[] args) 
 {
	Faculity.cname="ZOHO";
	Faculity f=new Faculity();
	f.name="SUDHARSUN";
	f.salary=35000;
	System.out.println("-----------------------");
	System.out.println("FACULITY 1 INFORMATION");
	System.out.println("------------------------");
	System.out.println("NAME:"+" "+f.name);
	System.out.println("SALARY:"+" "+f.salary);
	System.out.println("CNAME:"+" "+Faculity.cname);
	
	Faculity f1=new Faculity();
	f1.name="DEEPAK";
	f1.salary=35000;
	System.out.println("-----------------------");
	System.out.println("FACULITY 2 INFORMATION");
	System.out.println("--------------------------");
	System.out.println("NAME:"+" "+f1.name);
	System.out.println("SALARY:"+" "+f1.salary);
	System.out.println("CNAME:"+" "+Faculity.cname);
}
}
