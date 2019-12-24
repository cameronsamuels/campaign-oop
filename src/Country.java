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
	
	
	
	public boolean equals(Object obj) {
		
		if (obj instanceof Country == false)
			return false;
		
		Country provided = (Country)obj;
		
		if (provided.getCountry().equals(getCountry()))
			return true;
		
		return false;
		
	}
	
	
	/** Determines whether the country contains a provided division */
	public boolean contains(Object obj) {
		
		if (obj instanceof Country)
			return equals(obj);
		
		if (getCountry().equals("US")) {
			if (obj instanceof State || obj instanceof District) {
				String state = ((State)obj).getState();
				for (String i : State.STATES)
					if (i.equals(state))
						return true;
			}
		}
		
		return false;
		
	}
	
	
	
	/* Set methods */
	
	/** Sets the name of the country in the division for the race
	 * @throws IllegalArgumentException if input is null
	**/
	private void setCountry(String x) {
		
		if (x == null)
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
