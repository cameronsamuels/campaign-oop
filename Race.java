import java.util.Date;

public class Race {

	
	
	/* Variables */
	
	private Position position;
	private Division division;
	
	private Date primaryElection;
	private Date generalElection;
	private Date runoffElection;
	
	private int numCandidates;
	
	
	
	/** Constructs a new Race variable to be used to hold information regarding a
	 * race for a position of public office in a particular division.
	**/
	public Race(Position position, Division division) {
		setPosition(position);
		setDivision(division);
	}
	
	
	
	public boolean equals(Object obj) {
		
		if (obj instanceof Race == false)
			return false;
		
		Race provided = (Race)obj;
		
		return provided.getPosition().equals(getPosition()) &&
				provided.getDivision().equals(getDivision());
		
	}
	
	
	
	/* Set methods */
	
	private void setPosition(Position x) {
		position = x;
	}
	
	private void setDivision(Division x) {
		division = x;
	}
	
	public void setPrimaryElection(Date x) {
		primaryElection = x;
	}
	
	public void setGeneralElection(Date x) {
		generalElection = x;
	}
	
	public void setRunoffElection(Date x) {
		runoffElection = x;
	}
	
	public void setNumCandidates(int x) {
		
		if (x < 0)
			throw new IllegalArgumentException("Number of candidates cannot be less than 0");
		
		numCandidates = x;
		
	}
	
	
	
	/* Get methods */
	
	public Position getPosition() {
		return position;
	}
	
	public Division getDivision() {
		return division;
	}
	
	public Date getPrimaryElection() {
		return primaryElection;
	}
	
	public Date getGeneralElection() {
		return generalElection;
	}
	
	public Date getRunoffElection() {
		return runoffElection;
	}
	
	public int getNumCandidates() {
		return numCandidates;
	}
	
	public String toString() {
		return getPosition().toString() + "of " + getDivision().toString();
	}
	
	
	
}
