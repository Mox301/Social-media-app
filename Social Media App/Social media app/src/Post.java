import java.util.*;

/**
 * This is Post class, and its job is to create an instance of the Post class that in Group class, Pages class, User class and HomePage class 
 * in the social media app.
 *
 * @author Moemen Mohamed
 */
public class Post {
    private String text;
    private int numOfLikes;
    private int numOfComments;
    private ArrayList<String> comments = new ArrayList<String>();
    private java.util.Date dateOfCreation;
	
    /**
     * Constructor for the objects of class Post
     * 
     * @param  text - the post text
     */
    public Post(String text) {
    	dateOfCreation = new java.util.Date();
    	this.text = text;
    }
	
    /**
     * this method print the string that stored in text data field
     */
    public void getText() {
    	System.out.println(this.text);
    }
	
    /**
     * This method return the date of creation for the object of class Post as string
     */
    public String showDateOfCreation() {
    	return dateOfCreation.toString();
    }
	
    /**
     * Getter method for numOfLikes data field
     * 
     * @return  numOfLikes - the number of likes in the object of class Post
     */
    public int getNumberOfLikes() {
    	return numOfLikes;
    }
	
    /**
     * Getter method for numOfComments data field
     * 
     * @return  numOfComments - the number of comments in the object of class Post
     */
    public int getNumberOfComments() {
    	return numOfComments;
    }
	
    /**
     * This method add comments (text) in the ArrayList called "comments" and increases the numOfCommets data field by 1
     * 
     * @param  text - the text of comment
     */
    public void commentOnPost(String text) {
    	comments.add(text);
		numOfComments++;
    }
	
    /**
     * This method add one to the numOfLikes data field
     */
    public void likePost() {
    	numOfLikes++; 
    }
	
    /**
     * Getter method of the comments ArrayList
     * 
     * @return  comments - ArrayList of the comments for the object of class Post
     */
    public ArrayList<String> getCommentsList() {
    	return comments;
    }
}