import java.util.Scanner;

class BINGOTest1
{	
	static int letter;
	
	static int bCounter = 0;
	static int iCounter = 0;
	static int nCounter = 0;
	static int gcounter = 0;
	static int oCounter = 0;
	
	static int[] bBalls = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	static int[] iBalls = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
	static int[] nBalls = {31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
	static int[] gBalls = {46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60};
	static int[] oBalls = {61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75};
	
	static int[] bRevealed = new int[15];
	static int[] iRevealed = new int[15];
	static int[] nRevealed = new int[15];
	static int[] gRevealed = new int[15];
	static int[] oRevealed = new int[15];
	
	
	static int retry = 1;
	
	
	public static void main(String[] args)
	{
		intro();
		
		while(retry == 1)
		{
			
			letterChosen();
			
			numberChoiceFilter();
			
			//display
			
			retry();
		}
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
	
	public static void ballreset()
	{
		
	}
	public static void ballsRevealed(String[] bBalls)
	{
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
			bPile(bBalls);
		}
		else if(letter == 2)
		{
			iPile();
		}
		else if(letter == 3)
		{
			nPile();
		}
		else if(letter == 4)
		{
			gPile();
		}
		else if(letter == 5)
		{
			oPile();
		}
		
	}
	
	public static void iPile(int[] iArray)
	{
		
		int index = (int)(Math.random() * 15);
		
		iRevealed[iCounter] = iArray[index];
		
		System.out.println("CURRENT BALL: I" + iRevealed[iCounter]);
		
		
	}
	public static void nPile(int[] nArray)
	{
		
		int index = (int)(Math.random() * 15);
		
		nRevealed[nCounter] = nArray[index];
		
		System.out.println("CURRENT BALL: N" + nRevealed[nCounter]);
		
		
	}
	public static void bPile(int[] bArray)
	{
		
		int index = (int)(Math.random() * 15);
		
		bRevealed[bCounter] = bArray[index];
		
		System.out.println("CURRENT BALL: B" + bRevealed[bCounter]);
		
		
	}
	public static void bPile(int[] bArray)
	{
		
		int index = (int)(Math.random() * 15);
		
		bRevealed[bCounter] = bArray[index];
		
		System.out.println("CURRENT BALL: B" + bRevealed[bCounter]);
		
		
	}
	public static void bPile(int[] bArray)
	{
		
		int index = (int)(Math.random() * 15);
		
		bRevealed[bCounter] = bArray[index];
		
		System.out.println("CURRENT BALL: B" + bRevealed[bCounter]);
		
		
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
