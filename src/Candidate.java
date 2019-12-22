// Cameron Samuels

public class Candidate {
	
	
	
	/* Variables */
	private String name;
	private Position currentPosition;
	private int age;
	private String gender;
	
	
	
	/** Constructs a new Candidate object to hold information regarding
	 * a candidate running in a campaign for public office.
	 * @param name the name of the candidate
	 * @param currentPosition a position of public office they currently hold, or null
	 */
	public Candidate(String name, Position currentPosition) {
		setName(name);
		setCurrentPosition(currentPosition);
	}
	
	public Candidate(String name) {
		this(name, null);
	}
	
	
	
	/* Get methods */
	
	public String getName() {
		
		String prefix = getCurrentPosition().getPrefix();
		
		if (prefix == null)
			return name;
		else
			return prefix + " " + name;
		
	}
	
	public Position getCurrentPosition() {
		return currentPosition;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	
	/* Set methods */
	
	/** Sets the name of the candidate
	 * @throws IllegalArgumentException if the name is null
	 */
	private void setName(String x) {
		
		if (x == null)
			throw new IllegalArgumentException("Name cannot be null");
		
		name = x;
		
	}
	
	private void setCurrentPosition(Position x) {
		currentPosition = x;
	}
	
	/** Sets the age of the candidate
	 * @throws IllegalArgumentException if the age is less than 0
	 */
	public void setAge(int x) {
		
		if (x < 0)
			throw new IllegalArgumentException("Age cannot be less than 0");
		
		age = x;

	}
	
	public void setGender(String x) {
		gender = x;
	}
	
	
	
}
