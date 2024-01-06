package SumOdd;

public class SumOdd 
{
	public static void print(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
           if(i%2!=0)
           {
        	   sum=sum+i;
        	   }
           }
		System.out.println(sum);
		}
	}