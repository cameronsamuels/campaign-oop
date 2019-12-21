// Cameron Samuels

public abstract class Division {
	
	
	
	/* Varaibles */
	private int population;
	private int numVoters;
	
	
	
	/* Set methods */
	
	/** Sets the population in the division for the race
	 * @throws IllegalArgumentException if population is less than 0
	**/
	public void setPopulation(int x) {
		
		if (x < 0)
			throw new IllegalArgumentException("Population cannot be less than 0");
		
		population = x;
		
	}
	
	/** Sets the number of eligible voters in the division for the race
	 * @throws IllegalArgumentException if number of voters is less than 0
	**/
	public void setNumVoters(int x) {
		
		if (x < 0)
			throw new IllegalArgumentException("Number of voters cannot be less than 0");
		
		numVoters = x;
		
	}
	
	
	
	/* Get methods */
	
	public int getPopulation() {
		return population;
	}
	
	public int getNumVoters() {
		return numVoters;
	}
	
	
	
}
