package letterprinting;

public class Guru 
{
	public static void main(String[] args) throws InterruptedException  
	{
		for (int row=1;row<=5;row++)
		{
			for (int col=1;col<=5;col++)
			{
				if ((row==1&&col!=1)||((row!=1&&row!=5)&&col==1)||(row==(5/2)+1&&col!=2)||((col!=1&&col!=4)&&row==5)||(col==(5/2)+1&&row!=2)||(row!=2&&col==5)) 
				{
					Thread.sleep(400);
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("");
		for (int row=1;row<=5;row++)
		{
			for (int col=1;col<=5;col++)
			{
				if (col==1&&row!=5||row==5&&col!=1&&col!=5||col==5&&row!=5) 
				{
					Thread.sleep(400);
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (int row=1;row<=7;row++)
		{
			for (int col=1;col<=5;col++)
			{
				if (col==1&&row>=1||row==1&&col!=5||row==(7/2)+1&&col!=5||col==5&&row!=1&&row!=(7/2)+1) 
				{
					Thread.sleep(400);
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (int row=1;row<=5;row++)
		{
			for (int col=1;col<=5;col++)
			{
				if (col==1&&row!=5||row==5&&col!=1&&col!=5||col==5&&row!=5) 
				{
					Thread.sleep(400);
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}
