// Data structures
import java.util.ArrayList;
import java.util.List;

// I/O
import java.util.Scanner;

public class Solution {
	
	public static int n = -1;
	public static String ans = "null";
	
	public static void main(String[] args) {
			
			
			// Controlling for user input/automated input
			Scanner scanner;
			if(args.length > 0) { 
				scanner = new Scanner(args[0]);
			} 
			else {			
				scanner = new Scanner(System.in);
			}
			
			Solution.n = scanner.nextInt();
			List<Integer> building = new ArrayList<Integer>();
			List<Integer> minCosts = new ArrayList<Integer>();
			
			for(int i=0; i<Solution.n; i++) 
				building.add(scanner.nextInt());
			
			// For each floor, compute the cost of placing the coffee machine there
			// and coming from other floors. For that we use cost = 2*n_employees*(|i-k|) 
			// where i is the current floor and k is where the coffee machine is placed at a given iteration.			
			int globalMin = 1<<29;
			for(int k=1; k<=building.size(); k++) {
				
				int totalCost = 0;
				
				for(int i=0; i<building.size(); i++)
					totalCost += 2*building.get(i)*(Math.abs(i+1-k));
				
				minCosts.add(totalCost);
				
				if(totalCost<globalMin)
					globalMin = totalCost;
				
			}
			
			String floorsToUse = "";
			for(int i=0; i<minCosts.size(); i++) {
				
				int cost = minCosts.get(i);
				if(cost == globalMin)
					floorsToUse += Integer.toString(i+1) + " ";
				
			
			}
			
			// Removing last space unnecessarily added
			floorsToUse = floorsToUse.stripTrailing();
			Solution.ans = (Integer.toString(globalMin) + "\n" + floorsToUse + "\n");
			

			System.out.println(Solution.ans);

			
	}
}
