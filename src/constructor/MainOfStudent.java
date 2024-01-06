package constructor;

public class MainOfStudent 
{
  public static void main(String[] args) 
  {
	Student s1=new Student(1,"SUDHARSUN",456);
	System.out.println("ID--->"+s1.id);
	System.out.println("NAME--->"+s1.name);
	System.out.println("MARKS--->"+s1.marks);
	
	Student s2=new Student(2,"VENKATESH",425);
	System.out.println("ID--->"+s2.id);
	System.out.println("NAME--->"+s2.name);
	System.out.println("MARKS--->"+s2.marks);
	
	Student s3=new Student(3,"DEEPAK",419);
	System.out.println("ID--->"+s3.id);
	System.out.println("NAME--->"+s3.name);
	System.out.println("MARKS--->"+s3.marks);
}
}
