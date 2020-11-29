// IO
import java.util.Scanner;

// Data structures
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
	static private int N,K;
	static private List<Integer> competitors;
	static private List<Integer> selectedCompetitors;
	static public String ans = "null";

	public static void main(String[] args) {
		
		
		// Building control data/variables
		Scanner scanner = new Scanner(args[0]);
		//Scanner scanner = new Scanner(System.in);
		
		Solution.N = scanner.nextInt();
		// Fixing border cases
		while(N<1 || N>10000) {
			System.out.println("O número de competidores deve estar entre 1 e 10000.");
			Solution.N = scanner.nextInt();
		}
		Solution.K = scanner.nextInt();
		while(K<1 || K>N) {
			System.out.println("O número de vagas deve estar entre 1 e o número de competidores.");
			Solution.K = scanner.nextInt();
		}
		
		Solution.competitors = new ArrayList<Integer>();
		Solution.selectedCompetitors = new ArrayList<Integer>();
		
		// Reading N scores
		int i = 0;
		while(i++ < N && scanner.hasNext()) {
			int score = scanner.nextInt();
			if(score < 1 || score > 10000) {
				System.out.println("As pontuações devem ser um número de 1 a 1000");
				--i;
				continue;
			}
			competitors.add(score);
		}
		scanner.close();

		if(competitors.size() != N) {
			System.out.println("Número incorreto de competidores fornecido. Encerrando o programa");
			return;
		}
		
		// Computing the results for all the competitors
		Statistics allCompetitors = new Statistics(competitors);
		double mean = allCompetitors.getMean();
		double stDev = allCompetitors.getStDeviation();
		
		// Selecting the K bests ones
		int newK = Solution.select(K);
		Statistics selected = new Statistics(selectedCompetitors);
		double selMean = selected.getMean();
		double selStDev = selected.getStDeviation();
		String ans = String.format("%d\n"
				+ "%.2f\n"
				+ "%.2f\n"
				+ "%.2f\n"
				+ "%.2f\n"
				, newK, selStDev, selMean, stDev, mean);
		
		Solution.ans = ans.replace(",", ".");
		System.out.println(Solution.ans);
		
	}
	
	static private int select(int K) {
		
		Collections.sort(competitors, Collections.reverseOrder());
		int i = 0;
		while(i<K) {
			selectedCompetitors.add(competitors.get(i));
			i++;
		}
		
		// Checking for draws
		if(i<N) {

			int a = competitors.get(i-1);
			int b = competitors.get(i);
			
			while(a==b) {
				selectedCompetitors.add(b);
				i++;
				if(i>=N) break;
				b = competitors.get(i);
			}
		}
		
		return i;
	}

}
