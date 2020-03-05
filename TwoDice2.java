// Chapter 5 - Game Zone 4

public class TwoDice2
{
	public static void main(String[] args)
	{
		// objects 
		Die firstDie = new Die();
		Die secondDie = new Die();
		
		// variables and constants
		int value1 = firstDie.getValue();
		int value2 = secondDie.getValue();
		String msg;
		
		// calculation phase
		if(value1 == value2)
		{
			msg = "The dice are a match!";
		}
		else
		{
			if(value1 > value2)
			{
				msg = "First die roll is greater.";
			}
			else
			{
				msg = "Second die roll is greater.";
			}
		}
		
		// output phase
		System.out.println();
		System.out.println("First die roll is: " + value1);
		System.out.println("Second die roll is: " + value2);
		System.out.println(msg);
		
	}
}