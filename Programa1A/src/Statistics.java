// Data structures
import java.util.List;

public class Statistics {
	
	private List<Integer> intData;
	private double m_mean;
	private double m_stDeviation;
	
	public Statistics(List<Integer> data) { 
		intData = data;
		m_mean = -1;
		m_stDeviation = -1;
	}
	
	
	// On the methods below, the first query costs O(n) and subsequent ones O(1)
	private void setMean(double m) { m_mean = m; }
	private void setStDeviation(double stdDev) { m_stDeviation = stdDev; }
	
	public double getMean() { 
		if (m_mean == -1)
			calculateMean();
		return m_mean; 
	}
	public double getStDeviation() {
		if (m_stDeviation == -1) 
			calculateStDeviation();
		return m_stDeviation;
	}
	
	
	/* -------------- COMPUTING METHODS -------------- */
	private void calculateMean() {
		
		double n = intData.size();
		double sum = 0.0;
		
		for(int num : intData)
			sum += num;
		
		double mean = sum/n;
		setMean(mean);
	}
	
	private void calculateStDeviation() {
		
		double mean = getMean();
		double sum = 0;
		double n = intData.size();
		
		for(int num : intData)
			sum += Math.pow(num-mean, 2);
		sum /= n*1.0;
		double stDeviation = Math.sqrt(sum);
		setStDeviation(stDeviation);
		
		return;
	}

}
