// Cameron Samuels

public class State extends Division {
	
	
	
	/* Constants */
	public static final String[] STATES = {
		"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA",
		"HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD",
		"ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH",
		"NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC",
		"SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"
	};
	
	
	
	/* Variables */
	private String state;
	
	
	
	/** Constructs a new State variable to be used to hold information regarding a
	 * division of a position in public office.
	 * @param state the two-letter abbreviation for the state
	**/
	public State(String state) {
		setState(state);
	}
	
	
	
	/** Determines whether the state contains a provided district
	 * @returns true if the state contains the provided district
	**/
	public boolean contains(Object obj) {
		
		if (obj instanceof District == false)
			return equals(obj);
		
		District district = (District)obj;
		
		if (district.getState().equals(getState()))
			return true;
		
		return false;
		
	}
	
	
	
	/** Determines whether the state equals a provided state */
	public boolean equals(Object obj) {
		
		if (obj instanceof State == false)
			return false;
		
		State provided = (State)obj;
		return provided.getState().equals(getState());
		
	}
	
	
	
	/* Set methods */
	
	/** Sets the division's state to its two-letter abbreviation
	 * @throws IllegalArgumentException if input is null
	 * @throws IllegalArgumentException if input does not match required format
	 * @throws IllegalArgumentException if the state does not exist
	**/
	private void setState(String x) {
		
		if (x == null)
			throw new IllegalArgumentException("State cannot be null");
			
		if (x.length() != 2)
			throw new IllegalArgumentException("State must be representated in its two letter abbreviation");
		
		for (String i : STATES) {
			if (x.equals(i)) {
				state = x;
				return;
			}
		}
		
		throw new IllegalArgumentException("State does not exist");
		
	}
	
	
	
	/* Get methods */
	
	public String getState() {
		return state;
	}
	
	public String toString() {
		return getState();
	}
	
	
	
}
