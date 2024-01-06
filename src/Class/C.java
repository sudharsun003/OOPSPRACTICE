package Class;

public class C 
{
 public static void main(String[] args) 
 {
	System.out.println("main starts");
	A a1=new A();
	System.out.println(a1.a);
	a1.print();
	B b1=new B();
	System.out.println(b1.b);
    b1.display();
    System.out.println("main ends");
}
}
