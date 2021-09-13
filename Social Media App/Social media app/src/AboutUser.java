/**
 * This is AboutUser class, and its job is to create an instance of the AboutUser class that used to save on it the public informations of the User
 * object in the social media app.
 *
 * @author Moemen Mohamed
 */
public class AboutUser {
    private String workExperience = "";
    private String education = "";
    private String relationship = "";
    private String city = "";

    /**
     * no-args constructor for objects of class AboutUser
     */
    public AboutUser() {}

    /**
     * overloading constructor for objects of class AboutUser
     * 
     * @param  workExperience - work experience of the user,
     *         education - education of the user,
     *         relationship - relationship of the user,
     *         city - city that the user live in
     */
    public AboutUser(String workExperience, String education, String relationship, String city) {
    	this.workExperience = workExperience;
    	this.education = education;
    	this.relationship = relationship;
    	this.city = city;
    }
    
    /**
     * Setter method for workExperience data field
     * 
     * @param  work - the new work of the user
     */
    public void editWorkExperience(String work) {
    	workExperience = work;
    }
    
    /**
     * Setter method for education data field
     * 
     * @param  newEducation
     */	
    public void editEducation(String newEducation) {
    	education = newEducation; 
    }
	
    /**
     * Setter method for relationship data field
     * 
     * @param  newRelationship
     */
    public void editRelationship(String newRelationship) {
    	relationship = newRelationship;
    }
    
    /**
     * Setter method for city data field
     * 
     * @param  newCity
     */
    public void editCity(String newCity) {
    	city = newCity;
    }
    
    /**
     * Getter method for workExperience data field
     * 
     * @return  workExperience - work experience of the User object
     */
    public String getWorkExperience() {
    	return workExperience;
    }
	
    /**
     * Getter method for education data field
     * 
     * @return education - the education of the User object
     */
    public String getEducation() {
    	return education;
    }
	
    /**
     * Getter method for relationship data field
     * 
     * @return relationship - the relationship of the User object
     */
    public String getRelationShip() {
    	return relationship;
    }
	
    /**
     * Getter method for the city data field
     * 
     * @return city
     */
    public String getCity() {
    	return city;
    }
    
    /**
     * Overrided toString method to visualize the User object informations
     * 
     * @return  informations of User object
     */
    public String aboutToString() {
		return "Work Experience is " + workExperience + "\nEducation is " + education + "\nRelationship " + relationship +
				"\nCity Lived in " + city;
	}
}