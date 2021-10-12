import java.util.Scanner;

class BINGOTestShuffle
{	
	static int letter;
	
	static int bCounter = 0;
	static int iCounter = 0;
	static int nCounter = 0;
	static int gCounter = 0;
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
		
		numberShuffle();
		
		while(retry == 1)
		{
			
			ballsRevealed();
			
			letterChosen();
			
			numberChoiceFilter();
			
			retry();
		}
			
			
		
	}
	
	
	
	
	public static void intro()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("**************************");
		System.out.println("     WELCOME TO BINGO     ");
		System.out.println("**************************");
		
		System.out.println();
		
		System.out.println("CLICK ENTER TO START BINGO....");
		in.nextLine();
		
		scroll();
		
	}
	
	
	
	
	public static void numberShuffle()
	{
		shuffleBBalls(bBalls);
		shuffleIBalls(iBalls);
		shuffleNBalls(nBalls);
		shuffleGBalls(gBalls);
		shuffleOBalls(oBalls);
	}
	public static int[] shuffleBBalls(int[] array)
	{
		int repeat = array.length * 2;
		
		for (int i = 0; i < repeat; i++)
		{
			int indexOne = (int)(Math.random() * (array.length ));
			int indexTwo = (int)(Math.random() * (array.length ));
			
			int shuffleOne = array[indexOne];
			int shuffleTwo = array[indexTwo];
			
			
			array[indexOne] = shuffleTwo;
			array[indexTwo] = shuffleOne;
		}
		return array;
	}
	public static int[] shuffleIBalls(int[] array)
	{
		int repeat = array.length * 2;
		
		for (int i = 0; i < repeat; i++)
		{
			int indexOne = (int)(Math.random() * (array.length ));
			int indexTwo = (int)(Math.random() * (array.length ));
			
			int shuffleOne = array[indexOne];
			int shuffleTwo = array[indexTwo];
			
			
			array[indexOne] = shuffleTwo;
			array[indexTwo] = shuffleOne;
		}
		return array;
	}
	public static int[] shuffleNBalls(int[] array)
	{
		int repeat = array.length * 2;
		
		for (int i = 0; i < repeat; i++)
		{
			int indexOne = (int)(Math.random() * (array.length ));
			int indexTwo = (int)(Math.random() * (array.length ));
			
			int shuffleOne = array[indexOne];
			int shuffleTwo = array[indexTwo];
			
			
			array[indexOne] = shuffleTwo;
			array[indexTwo] = shuffleOne;
		}
		return array;
	}
	public static int[] shuffleGBalls(int[] array)
	{
		int repeat = array.length * 2;
		
		for (int i = 0; i < repeat; i++)
		{
			int indexOne = (int)(Math.random() * (array.length ));
			int indexTwo = (int)(Math.random() * (array.length ));
			
			int shuffleOne = array[indexOne];
			int shuffleTwo = array[indexTwo];
			
			
			array[indexOne] = shuffleTwo;
			array[indexTwo] = shuffleOne;
		}
		return array;
	}
	public static int[] shuffleOBalls(int[] array)
	{
		int repeat = array.length * 2;
		
		for (int i = 0; i < repeat; i++)
		{
			int indexOne = (int)(Math.random() * (array.length ));
			int indexTwo = (int)(Math.random() * (array.length ));
			
			int shuffleOne = array[indexOne];
			int shuffleTwo = array[indexTwo];
			
			
			array[indexOne] = shuffleTwo;
			array[indexTwo] = shuffleOne;
		}
		return array;
	}
	
	
	public static void ballsRevealed()
	{
		System.out.println("*************************");
		System.out.println("BALLS REVEALED");
		
		System.out.print("B: ");
		for(int i = 0; i < bCounter ; i++)
		{
			System.out.print(bRevealed[i] + "   ");
		}
		System.out.println();
		
		System.out.print("I: ");
		for(int i = 0; i < iCounter ; i++)
		{
			System.out.print(iRevealed[i] + "   ");
		}
		System.out.println();
		
		System.out.print("N: ");
		for(int i = 0; i < nCounter ; i++)
		{
			System.out.print(nRevealed[i] + "   ");
		}
		System.out.println();
		
		System.out.print("G: ");
		for(int i = 0; i < gCounter ; i++)
		{
			System.out.print(gRevealed[i] + "   ");
		}
		System.out.println();
		
		System.out.print("O: ");
		for(int i = 0; i < oCounter ; i++)
		{
			System.out.print(oRevealed[i] + "   ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		

	}
	
	
	
	
	public static void letterChosen()
	{
		int valid = 1;
		while (valid == 1)
		{
			letter = (int)(Math.random() * 5 + 1);
			
			if(letter == 1 && bCounter < 15)
			{
				valid++;
			}
			else if(letter == 1 && bCounter == 15)
			{
				valid = 1;
			}
			else if(letter == 2 && iCounter < 15)
			{
				valid++;
			}
			else if(letter == 2 && iCounter == 15)
			{
				valid = 1;
			}
			else if(letter == 3 && nCounter < 15)
			{
				valid++;
			}
			else if(letter == 3 && nCounter == 15)
			{
				valid = 1;
			}
			else if(letter == 4 && gCounter < 15)
			{
				valid++;
			}
			else if(letter == 4 && gCounter == 15)
			{
				valid = 1;
			}
			else if(letter == 5 && oCounter < 15)
			{
				valid++;
			}
			else if(letter == 5 && oCounter == 15)
			{
				valid = 1;
			}
		}
	}
		
	public static void numberChoiceFilter()
	{
		if(letter == 1 && bCounter < 15)
		{
			bRevealed[bCounter] = bBalls[bCounter];
		
			System.out.println("CURRENT BALL: B " + bRevealed[bCounter]);
		
			bCounter++;
		}
		else if(letter == 2 && iCounter < 15)
		{
			iRevealed[iCounter] = iBalls[iCounter];
		
			System.out.println("CURRENT BALL: I " + iRevealed[iCounter]);
			
			iCounter++;
		}
		else if(letter == 3 && nCounter < 15)
		{
			nRevealed[nCounter] = nBalls[nCounter];
		
			System.out.println("CURRENT BALL:N " + nRevealed[nCounter]);
			
			nCounter++;
		}
		else if(letter == 4 && gCounter < 15)
		{
			gRevealed[gCounter] = gBalls[gCounter];
		
			System.out.println("CURRENT BALL: G " + gRevealed[gCounter]);
			
			gCounter++;
		}
		else if(letter == 5 && oCounter < 15)
		{
			oRevealed[oCounter] = oBalls[oCounter];
		
			System.out.println("CURRENT BALL: O " + oRevealed[oCounter]);
			
			oCounter++;
		}
		
		System.out.println();
		
		enter();
			
		scroll();
	}
	
	
	
	
	
	
	
	
	public static void counterReset()
	{
		
		int bCounter = 0;
		int iCounter = 0;
		int nCounter = 0;
		int gCounter = 0;
		int oCounter = 0;
	}
	
	public static void enter()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("CLICK ENTER FOR THE NEXT BALL ....");
		in.nextLine();
	}
	
	public static void retry()
	{
		Scanner in = new Scanner(System.in);
		if(bCounter  == 15 && iCounter  == 15 && nCounter  == 15 && gCounter  == 15 && oCounter  == 15)
		{
			System.out.println("If you would like to go again press 1, if not press 2");
			retry = in.nextInt();
				
			if(retry == 1)
			{
				
				enter();
				
				counterReset();				
						
				scroll();
				
			}
			else if(retry == 2)
			{
				System.out.println("THE END!");
			}
		}
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
