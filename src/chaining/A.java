package chaining;

public class A 
{
 public A()
 {
	 System.out.println("HI A");
 }
 public A(int x)
 {
	 this();
	 System.out.println(x);
 }
 public A(int x,double y,String s)
 {
	 this(100);
	 System.out.println(x);
	 System.out.println(y);
	 System.out.println(s);
 }
 public A(double z,String b)
 {
	 System.out.println(z);
 }
 public A(String y)
 {
	 this(13,"venkatesh");
 }
 
}
