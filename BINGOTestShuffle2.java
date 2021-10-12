import java.util.Scanner;

class BINGOTestShuffle2
{	
	static int letter;
	
	static int bCounter = 0;
	static int iCounter = 0;
	static int nCounter = 0;
	static int gCounter = 0;
	static int oCounter = 0;
	
	static int[] bBalls = new int[15];
	static int[] iBalls = new int[15];
	static int[] nBalls = new int[15];
	static int[] gBalls = new int[15];
	static int[] oBalls = new int[15];
	
	static int[] bRevealed = new int[15];
	static int[] iRevealed = new int[15];
	static int[] nRevealed = new int[15];
	static int[] gRevealed = new int[15];
	static int[] oRevealed = new int[15];
	
	
	static int retry = 1;
	
	
	public static void main(String[] args)
	{
		intro();
		
		ballGenerator();
		
		letterChosen();
		
		numberChoiceFilter();
			
			
		
	}
	public static void intro()
	{
		System.out.println("**************************");
		System.out.println("     WELCOME TO BINGO     ");
		System.out.println("**************************");
		
		System.out.println();
		
		System.out.println("CLICK ENTER TO START BINGO....");
		enter();
		
	}
	
	public static void ballGenerator()
	{
		for (int i = 0; i < bBalls.length; i++)
		{
			bBalls[i] = (int)(Math.random() * 15 + 1);
		}
		
		for (int i = 0; i < iBalls.length; i++)
		{
			iBalls[i] = (int)(Math.random() * 17 + 15);
		}
		
		for (int i = 0; i < nBalls.length; i++)
		{
			nBalls[i] = (int)(Math.random() * 3 + 1);
		}
		
		for (int i = 0; i < gBalls.length; i++)
		{
			gBalls[i] = (int)(Math.random() * 15 + 1);
		}
		
		for (int i = 0; i < oBalls.length; i++)
		{
			oBalls[i] = (int)(Math.random() * 15 + 1);
		}
	}
	
	
	
	
	
	public static void letterChosen()
	{
		boolean valid = false;
		while(valid = false)
		{
			letter = (int)(Math.random() * 5 + 1);
			
			if(letter == 1 && bCounter >= 15)
			{
				valid = false;
			}
			else if(letter == 2 && iCounter >= 15)
			{
				valid = false;
			}
			else if(letter == 3 && nCounter >= 15)
			{
				valid = false;
			}
			else if(letter == 4 && bCounter >= 15)
			{
				valid = false;
			}
			else if(letter == 5 && bCounter >= 15)
			{
				valid = false;
			}
			else
			{
				valid = true;
			}
		}
	}
		
	public static void numberChoiceFilter()
	{
		if(letter == 1)
		{
			bRevealed[bCounter] = bBalls[bCounter];
		
			System.out.println("CURRENT BALL: B" + bRevealed[bCounter]);
		
			bCounter++;
		}
		else if(letter == 2)
		{
			iRevealed[iCounter] = iBalls[iCounter];
		
			System.out.println("CURRENT BALL: I" + iRevealed[iCounter]);
			
			iCounter++;
		}
		else if(letter == 3)
		{
			nRevealed[nCounter] = nBalls[nCounter];
		
			System.out.println("CURRENT BALL:N" + nRevealed[iCounter]);
			
			nCounter++;
		}
		else if(letter == 4)
		{
			gRevealed[gCounter] = gBalls[gCounter];
		
			System.out.println("CURRENT BALL: G" + gRevealed[gCounter]);
			
			gCounter++;
		}
		else if(letter == 5)
		{
			oRevealed[oCounter] = oBalls[oCounter];
		
			System.out.println("CURRENT BALL: O" + oRevealed[oCounter]);
			
			oCounter++;
		}
		
	}
	
	public static void bPile()
	{
		bRevealed[bCounter] = bBalls[bCounter];
		
		System.out.println("CURRENT BALL: B" + bRevealed[bCounter]);
		
		bCounter++;
		
	}
	public static void iPile()
	{
		iRevealed[iCounter] = iBalls[iCounter];
		
		System.out.println("CURRENT BALL: I" + iRevealed[iCounter]);
		
		iCounter++;
		
	}
	public static void nPile()
	{
		nRevealed[nCounter] = nBalls[nCounter];
		
		System.out.println("CURRENT BALL:N" + nRevealed[iCounter]);
		
		nCounter++;
		
	}
	public static void gPile()
	{
		gRevealed[gCounter] = gBalls[gCounter];
		
		System.out.println("CURRENT BALL: G" + gRevealed[gCounter]);
		
		gCounter++;
		
	}
	public static void oPile()
	{
		oRevealed[oCounter] = oBalls[oCounter];
		
		System.out.println("CURRENT BALL: O" + oRevealed[oCounter]);
		
		oCounter++;
		
	}
	
	
	
	
	
	
	
	
	
	public static void enter()
	{
		Scanner in = new Scanner(System.in);
		in.nextLine();
	}
	
	public static int retry()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("If you would like to try again press 1, if not press 2");
		retry = in.nextInt();
		
		return retry;
		
	}
	public static void scroll()
	{
		for(int i = 0; i < 60; i++)
		{
			System.out.println();
		}
	}
}

// put the numbers in an array; if element = zero go again
