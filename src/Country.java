// Cameron Samuels

public class Country extends Division {
	
	
	
	/* Variables */
	private String country;
	
	
	
	/** Constructs a new Country object for federal divisions
	 * and to act as a catch-all for non-US divisions.
	**/
	public Country(String country) {
		setCountry(country);
	}
	
	
	
	/* Set methods */
	
	/** Sets the name of the country in the division for the race
	 * @throws IllegalArgumentException if input is null
	**/
	private void setCountry(String x) {
		
		if (country == null)
			throw new IllegalArgumentException("Country cannot be null");
		
		country = x;
		
	}
	
	
	
	/* Get methods */
	
	public String getCountry() {
		return country;
	}
	
	public String toString() {
		return getCountry();
	}
	
	
	
}
