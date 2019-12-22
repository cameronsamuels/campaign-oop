// Cameron Samuels

import java.util.Date;

public class Campaign {
	
	
	
	/* Variables */
	
	private Candidate candidate;
	private Race race;
	
	private int winNumber;
	
	private Date launchDate;
	private Date suspenseDate;
	
	private String website;
	private String twitter;
	private String facebook;
	private String instagram;
	
	
	
	/** Constructs a new Campaign variable to be used to hold information regarding a
	 * campaign in a race for public office.
	**/
	public Campaign(Candidate candidate, Race race) {
		setCandidate(candidate);
		setRace(race);
	}
	
	public Campaign(String candidate, Race race) {
		this(new Candidate(candidate), race);
	}
	
	
	
	/* Set methods */
	
	private void setCandidate(Candidate x) {
		candidate = x;
	}
	
	private void setRace(Race x) {
		race = x;
	}
	
	/** Sets the campaign's win number to its minimum number of votes to win
	 * @throws IllegalArgumentException if win number is less than 0
	 */
	public void setWinNumber(int x) {
		
		if (x < 1)
			throw new IllegalArgumentException("Win number cannot be less than 0");
		
		winNumber = x;
		
	}
	
	public void setLaunchDate(Date x) {
		launchDate = x;
	}
	
	public void setSuspenseDate(Date x) {
		suspenseDate = x;
	}
	
	/** Sets the campaign's website
	 * @throws IllegalArgumentException if input is not a website
	 */
	public void setWebsite(String x) {
		
		if (x != null && !x.contains("http"))
			throw new IllegalArgumentException("Input is not a website");
		
		website = x;
		
	}
	
	/** Sets the campaign's twitter handle
	 * @throws IllegalArgumentException if input is not a twitter handle
	 */
	public void setTwitter(String x) {
		
		if (x != null && x.charAt(0) != '@')
			throw new IllegalArgumentException("Input is not a twitter handle");
		
		twitter = x;
		
	}
	
	public void setFacebook(String x) {
		facebook = x;
	}
	
	public void setInstagram(String x) {
		instagram = x;
	}
	
	
	
	/* Get methods */
	
	public Candidate getCandidate() {
		return candidate;
	}
	
	public Race getRace() {
		return race;
	}
	
	public Position getPosition() {
		return getRace().getPosition();
	}
	
	public Division getDivision() {
		return getRace().getDivision();
	}
	
	public int getWinNumber() {
		return winNumber;
	}
	
	public Date getLaunchDate() {
		return launchDate;
	}
	
	public Date getSuspenseDate() {
		return suspenseDate;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public String getTwitter() {
		return twitter;
	}
	
	public String getFacebook() {
		return facebook;
	}
	
	public String getInstagram() {
		return instagram;
	}
	
	public String toString() {
		return getCandidate().toString() +
			" for " + getRace().toString();
	}
	
	
	
}
