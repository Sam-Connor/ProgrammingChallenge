package ProgrammingChallenge2;

import java.util.ArrayList;

import ProgrammingChallenge1.Biscuit;
import ProgrammingChallenge1.Box;

public class challenge2 {

	//copy of programmingChallenge1
	
	static ArrayList<Box> boxArray = new ArrayList<Box>();
	static ArrayList<Biscuit> biscuitArray = new ArrayList<Biscuit>();
	static ArrayList<Double> boxWeightArray = new ArrayList<Double>();
	static int numOfBoxes = 5; //n
	//double biscuitsTotalWeight = 1000;
	static int numOfBiscuits = 10; //k
	double remainingBiscuitsAverageWeight;
	
	public static void main(String[] args) {
	
		
		arrayListInitialisation();
		
		sortBiscuits();		
		
		printBoxes();
		
		statistics();
		
		
	}
	public static void arrayListInitialisation()
	{
		for (int i = 0; i < numOfBoxes; i++)
		{
			Box b = new Box(0);
			boxArray.add(b);			
		}
		
		
		for (int i = 0; i < numOfBiscuits; i++)
		{				
					Biscuit c = new Biscuit(Math.random());
					biscuitArray.add(c);					
		}
	}
	
	public static void printBoxes()
	{

		for (Box box : boxArray)
		{
			System.out.println(box.getWeightOfBox());
		}
		
	}
	
	public static void sortBiscuits()
	{
		
		for (int i = 0; i < boxArray.size(); i++) 
		{
			boxArray.get(i).setWeightOfBox(biscuitArray.get(i).getWeightOfBiscuit());
			System.out.println("Box: " + (i+1) + " weights: " + boxArray.get(i).getWeightOfBox() );
		}
		
		
		for (int i = boxArray.size() -1; i < biscuitArray.size(); i++) 
		{
			
			double smallestBox = boxArray.get(0).getWeightOfBox();
			int smallestBoxIndex = 0;
			
			for (int j = 0; j < boxArray.size(); j++) 
			{
				
				if(boxArray.get(j).getWeightOfBox() < smallestBox)
				{
					smallestBox = boxArray.get(j).getWeightOfBox();
					smallestBoxIndex = j;
				}	
			}
			
			boxArray.get(smallestBoxIndex).setWeightOfBox(boxArray.get(smallestBoxIndex).getWeightOfBox() + biscuitArray.get(i).getWeightOfBiscuit());
		}
		
	}
	
	public static void statistics()
	{
		double total = 0;
		double average = 0;
		
		for (Box box : boxArray) {
			 total += box.getWeightOfBox();
			 boxWeightArray.add(box.getWeightOfBox());
		}
		
		average = total / boxArray.size();
		
		System.out.println("The average weight is: " + average);
				
		
	}

}





