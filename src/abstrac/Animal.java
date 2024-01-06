package abstrac;

public abstract class Animal 
{
 public static void open()
 {
	System.out.println("HI OPEN"); 
 }
 abstract public void sound();
 public static void close()
 {
	 System.out.println("BYE CLOSE");
 }
}
