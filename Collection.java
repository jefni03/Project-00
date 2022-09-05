/* 	
// AUTHOR: Jeffrey Ni
 * 
 */
// FILENAME: Collection.java
// SPECIFICATION: methods for Assignment 6 which includes adding, removing from, finding largest, etc...
// FOR: CS 1400 - ASSIGNMENT #6
// TIME SPENT: 60min
//*/

public class Collection 
{
	// private instance variables for Collection class 
	private int count;
	private int[] numArray;

	// constructor for Collection class 
	public Collection(int arraySize)
	{
		numArray = new int[arraySize];
		count = 0;
	}
	
	// search method returns index of number being searched 
	private int search (int searchingNum)
	{
		for(int i = 0; i < numArray.length; i++)
		{
			if(numArray[i] == searchingNum)
				return i;
		}
			return -1;
	}
	
	// adds number to array 
	public boolean add(int numberToAdd)
	{
		if((search(numberToAdd) != numberToAdd))
		{
			if(!(count < numArray.length))
			{
				doubleArray();
			}
			numArray[count] = numberToAdd;
			count ++;
			return true;
		}
		return false; 

	}
	
	// removes user input number from array 
	public boolean remove(int numberToRemove)
	{
		if(search(numberToRemove) != -1)
		{
			for(int i = search(numberToRemove); i < count - 1; i++)
			{
				numArray[i] = numArray[i + 1];
				
			}
			count --;
			return true;
		}
		return false;
	
	}
	
	// private method to double array size 
	private void doubleArray()
	{
		int[] newArray = new int[numArray.length * 2];
		for(int i = 0; i < numArray.length; i++)
			newArray[i] = numArray[i];
		numArray = newArray; 
	}
	
	// returns largest number in array 
	public int findLargest()
	{
		int largest = numArray[0];
		for(int i = 0; i < count; i++)
		{
			if(numArray[i] > largest)
				largest = numArray[i];
		}
		return largest; 
	}
	
	// computes and returns average of values in array 
	public double computeAvg()
	{
		int sum = 0;
		for(int i = 0; i < count; i++)
		{
			sum += numArray[i];
		}
		return ((double) sum )/ count; 
	}
	
	// returns count of positive integers in array 
	public int countPositives()
	{
		int countPos = 0;
		for(int i = 0; i < numArray.length; i++)
		{
			if(numArray[i] > 0)
				countPos++;
		}
		return countPos;
	}
	
	// puts together array in a clear format 
	public String toString()
	{
		   String result = "{";
	       for (int i = 0; i < count; i++)
	       {
	           if (i == 0)
	               result = result + numArray[i];
	           else
	               result = result + "," + numArray[i];
	       }
	       result = result + "}";
	       return result;
	   }
}

