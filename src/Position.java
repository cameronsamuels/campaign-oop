// Cameron Samuels

public class Position {
	
	
	
	/* Variables */
	private String title;
	private String prefix;
	
	
	
	/** Constructs a new Position variable to be used to hold information regarding a
	 * position in public office.
	 * @param title the name of the position
	 * @param prefix the abbreviation of the position used in a name
	**/
	public Position(String title, String prefix) {
		setTitle(title);
		setPrefix(prefix);
	}
	
	
	
	/* Set methods */
	
	/** Sets the title of the position
	 * @throws IllegalArgumentException if title is null
	**/
	private void setTitle(String x) {
		
		if (x == null)
			throw new IllegalArgumentException("Title cannot be null");
		
		title = x;
	}
	
	/** Sets the prefix of the position's title
	 * @throws IllegalArgumentException if prefix is null
	**/
	private void setPrefix(String x) {
		
		if (x == null)
			throw new IllegalArgumentException("Prefix cannot be null");
		
		prefix = x;
		
	}
	
	
	
	/* Get methods */
	
	public String getTitle() {
		return title;
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	
	
}
