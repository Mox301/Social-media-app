import java.util.*;
/**
 * This is Groups class, and its job is to create an instance of the Groups class that used in the social media app.
 *
 * @author Moemen Mohamed
 */

public class Groups {
    private String groupName;
    private String groupDescription;
    private java.util.Date dateOfCreation;
    private String admin;
    private int numOfRecommendions;
    private ArrayList<User> members = new ArrayList<User>();
    private ArrayList<Post> posts = new ArrayList<Post>();
    
    /**
     * Constructor for objects of class Groups
     * 
     * @param name, description, firstName and lastName
     */
    public Groups(String name, String description, String firstName, String lastName) {
        dateOfCreation = new java.util.Date();
        this.groupName = name;
        this.groupDescription = description;
        admin = firstName + " " + lastName;
    }

    /**
     * Getter method for posts data field
     *
     * @return  posts - ArrayList for objects of class Post ( return posts of the group )
     */
    public ArrayList<Post> getGroupPosts() {
		return posts;
    }
    
    /**
     * Add the object of class Post to the ArrayList called "posts" that store the objects of class Post 
     * 
     * @param  post - object of class Post
     */
    public void addNewPostToGroupPostsList(Post post) {
    	posts.add(post);
    } 
    
    /**
     * Getter method for members data field
     * 
     * @return  members - ArrayList of objects of class User ( return all members of the group )
     */
    public ArrayList<User> getMembers() {
    	return members;
    }
    
    /**
     * Add the object of class User to the ArrayList called "members" that store the objects of class User ( add member to the group )
     * 
     * @ param  user - object of class User
     */
    public void addMember(User user) {
    	members.add(user);
    }
    
    /**
     * Remove the object of class User from the ArrayList called "members" that store the objects of class User ( remove member from the group )
     * 
     * @param  user - object of class User
     */
    public void removeMember(User user) {
    	members.remove(user);
    }
    
    /**
     * Visualize the information's about admin and members of the group, Informations like the name and number of friends of the member 
     */
    public void showGroupMembers() {
    	for(int i = 0; i < members.size(); i++) {
    		System.out.println(members.get(i).getFirstName() + " " + members.get(i).getLastName());
    		System.out.println("number of friends is "+ members.get(i).getNumberOfFriends());
    		System.out.println();
    	}
    }
    
    /**
     * Getter method for the name of admin of the group
     * 
     * @return  admin - name of the admin of the group
     */
    public String showGroupAdmin() {
    	return admin;
    }
    
    /**
     * Getter method for the name of the group
     * 
     * @return  groupName - name of the group
     */
    public String getNameOfGroup() {
    	return groupName;
    }
	
    /**
     * Setter method for the name of the group
     * 
     * @param name - new name for the group
     */
    public void setNameOfGroup(String name) {
    	groupName = name;
    }
	
    /**
     * Getter method for the description of the group
     * 
     * @return groupDescription - description of the group
     */
    public String getGroupDescription() {
    	return groupDescription;
    }
    
    /**
     * Setter method for the description of the group
     * 
     * @param  description - new description for the group
     */
    public void setGroupDescription(String description) {
    	groupDescription = description;
    }
    
    /**
     * Getter method for the number of recommendations for the object of class Group
     * 
     * @return numOfRecommendations - number of recommendations for the object of class Group
     */
    public int getNumberOfRecommedations() {
    	return numOfRecommendions;
    }
	
    /**
     * Increating the number of recommendations in the object of class Group by one.
     */
    public void addRecommendation() {
    	numOfRecommendions++;
    }
}