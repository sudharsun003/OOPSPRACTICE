package bike;

public class MainOfBike
{
public static void main(String[] args) 
{
	Bike.brand="TVS";
	Bike b1=new Bike();
    b1.name="SCOOTY";
    b1.price=12000.15;
    b1.color="blue";
    System.out.println("--------------------");
    System.out.println("BIKE 1 INFORMATION");
    System.out.println("--------------------");
    System.out.println("NAME:"+" "+b1.name);
    System.out.println("PRICE:"+" "+b1.price);
    System.out.println("COLOR:"+" "+b1.color);
    System.out.println("BRAND:"+" "+Bike.brand);
    
    Bike b2=new Bike();
    b2.name="DEO";
    b2.price=18000.18;
    b2.color="BLACK";
    System.out.println("--------------------");
    System.out.println("BIKE 2 INFORMATION");
    System.out.println("--------------------");
    System.out.println("NAME:"+" "+b2.name);
    System.out.println("PRICE:"+" "+b2.price);
    System.out.println("COLOR:"+" "+b2.color);
    System.out.println("BRAND:"+" "+Bike.brand);
}
}
