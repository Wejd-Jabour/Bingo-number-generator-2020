/**This program is used to generate all 75 standard BINGO numbers and randomly display them.
 * Each number is unique and there are no repeated numbers. The numbers are displayed one at
 * a time and saved into a section that shows all the previously revealed balls. At the end 
 * you get the option to restart the code or end the code. If the code is restarted, the 
 * numbers are shuffled again and displayed in a different order.
 * 
 * @author W. Jabour
 */

import java.util.Scanner;

class BINGO
{	
	//This is used in the letterChosen method to save the letter
	static int letter;
	
	//These are the counters that keep track of how many numbers of each letter has been displayed
	static int bCounter = 0;
	static int iCounter = 0;
	static int nCounter = 0;
	static int gCounter = 0;
	static int oCounter = 0;
	
	//These are the arrays containing the numbers for each letter in order before they are shuffled
	static int[] bBalls = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	static int[] iBalls = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
	static int[] nBalls = {31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
	static int[] gBalls = {46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60};
	static int[] oBalls = {61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75};
	
	//These start new arrays used to display the revealed numbers
	static int[] bRevealed = new int[15];
	static int[] iRevealed = new int[15];
	static int[] nRevealed = new int[15];
	static int[] gRevealed = new int[15];
	static int[] oRevealed = new int[15];
	
	//This is used to loop and restart BINGO
	static int restart = 1;
	
	
	public static void main(String[] args)
	{
		intro();
		numberShuffle();
		
		while(restart == 1)
		{
			ballsRevealed();
			letterChosen();
			numberChoice();
			restart();
		}	
	}
	
	//This prints a message saying "WELCOME TO BINGO" 
	
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
	
	//This method runs several metheods that shuffle the order of the balls in each letter
	
	public static void numberShuffle()
	{
		shuffleBBalls(bBalls);
		shuffleIBalls(iBalls);
		shuffleNBalls(nBalls);
		shuffleGBalls(gBalls);
		shuffleOBalls(oBalls);
	}
	
	//This shuffles the numbers for the B balls
	
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
	
	//This shuffles the numbers for the I balls
		
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
	
	//This shuffles the numbers for the N balls
	
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
	
	//This shuffles the numbers for the G balls
	
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
	
	//This shuffles the numbers for the O balls
	
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
	
	/**This method will show all the balls that have been revealed
	 * It also separates the nembers to their designated letter group
	 */
	
	public static void ballsRevealed()
	{
		System.out.println("***************************************************************************");
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

		System.out.println("***************************************************************************");
		System.out.println();
	}
	
	/**This method gives a random number from 1-5, each number corresponds with a letter from BINGO
	 * This method also checks to see if all the balls of a letter have been revealed
	 * If they have that number and letter become invalid.
	 */
		
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
		
	/**This method runs after getting a letter, it goes through the array for the letter returning the ball number
	 * The number returned is based on a counter for the letter used in the arrays with the shuffled. Each counter 
	 * starts at 0, returning the number at index 0, then the counter gets increased by 1.
	 * Once the number is received,  using the counter as an index, this method saves it into its designated revealed 
	 * group that is then displayed when the method is called.
	 */

	public static void numberChoice()
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
	
	//This method is used in the retry code to reset the counters
	
	public static void counterReset()
	{
		
		bCounter = 0;
		iCounter = 0;
		nCounter = 0;
		gCounter = 0;
		oCounter = 0;
	}
	
	//This method is used to stop the code until ENTER is hit and then the next number is revealed
	 
	public static void enter()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("CLICK ENTER FOR THE NEXT BALL ....");
		in.nextLine();
	}
	
	/**This method only runs when all the counters for the letters reach the end.
	 * It asks the player if they would like BINGO to run again, or if they want to exit
	 * If yes is inputed, the counters get reseted and the numbers get shuffled again.
	 */
	
	public static void restart()
	{
		Scanner in = new Scanner(System.in);
		if(bCounter == 15 && iCounter == 15 && nCounter == 15 && gCounter == 15 && oCounter == 15)
		{
			System.out.println("Would you like to restart BINGO?");
			System.out.println(" If Yes press 1");
			System.out.println(" If No/Exit press 2");
			System.out.println();
			restart = in.nextInt();
				
			if(restart == 1)
			{
				counterReset();				
				
				numberShuffle();
						
				scroll();
				
			}
			else if(restart == 2)
			{
				scroll();
				System.out.println("**********");
				System.out.println("THE END!");
				System.out.println("**********");
			}
		}
	}
		
	//This method is used to clear the board	
	
	public static void scroll()
	{
		for(int i = 0; i < 60; i++)
		{
			System.out.println();
		}
	}

}
