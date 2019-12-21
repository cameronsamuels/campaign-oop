// Cameron Samuels

public class District extends State {

	
	
	/* Variables */
	private int district;
	
	
	
	/** Constructs a new District variable to be used to hold information regarding a
	 * division of a position in public office.
	 * @param state the two-letter abbreviation for the state
	 * @param district the number for the district
	**/
	public District(String state, int district) {
		super(state);
		setDistrict(district);
	}
	
	
	
	/** Determines whether the district equals a provided district */
	public boolean equals(Object obj) {
		
		if (obj instanceof District == false)
			return false;
		
		District provided = (District)obj;
		
		return provided.getState().equals(getState()) &&
			provided.getDistrict() == getDistrict();
		
	}
	
	public boolean contains(Object obj) {
		return equals(obj);
	}
	
	
	
	/* Set methods */
	
	/** Sets the division's district to its number
	 * @throws IllegalArgumentException if district is less than 1
	**/
	private void setDistrict(int x) {
		
		if (x < 1)
			throw new IllegalArgumentException("District cannot be less than 1");
		
		district = x;
		
	}
	
	
	
	/* Get methods */
	
	public int getDistrict() {
		return district;
	}
	
	public String toString() {
		return getState() + "-" + getDistrict();
	}
	
	
	
}
