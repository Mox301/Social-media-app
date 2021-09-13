import java.util.*;
/**
 * This is Page class, and its job is to create an instance of the Page class that used in the social media app.
 *
 * @author Moemen Mohamed
 */
public class Page {
	private String pageName, pageDescription, admin;
	private int numberOfFollowers, numOfRecommendations;
	private java.util.Date dateOfCreation;
	private ArrayList<Post> posts = new ArrayList<Post>();
	
	/** 
	 * Constructor for the object of class Page 
	 * 
	 * @param pageName - name of the page,
	 *        pageDescription - discription of the page,
	 *        firstName - first name of the page,
	 *        lastName - last name of the page
	 */
	public Page(String pageName, String pageDescription, String firstName, String lastName) {
        dateOfCreation = new java.util.Date();
		this.pageName = pageName;
		this.pageDescription = pageDescription;
		this.admin = firstName + " " + lastName;
	}
	
	/**
	 * Getter method for the pageName data field
	 * 
	 * @return  pageName - the name of the page
	 */
	public String getPageName() {
		return pageName;
	}
	
	/**
	 * Setter method for the pageName data field
	 * 
	 * @param  name - the new name of the page
	 */
	public void setPageName(String name) {
		pageName = name;
	}
	
	/**
	 * Getter method for the pageDescription data field
	 * 
	 * @return  pageDescription - the page description
	 */
	public String getPageDescription() {
		return pageDescription;
	}
	
	/**
	 * Setter method for pageDescription data field
	 * 
	 * @param  description - the new description of the page
	 */
	public void setPageDescription(String description) {
		pageDescription = description;
	}
	
	/**
	 * Getter method for numberOfFollowers data field
	 * 
	 * @return numberOfFollowers - the number of follower for the object of class Page
	 */
	public int getNumberOfFollower() {
		return numberOfFollowers;
	}
	
	/**
	 * Increating the number of followers in the object of class Page by one.
	 */
	public void addFollower() {
        numberOfFollowers++;
	}
	
	/**
	 * Getter method for numOfRecomendation data field
	 * 
	 * @return  numOfRecommendation - the number of remcommedations for the object of class Page
	 */
	public int getNumberOfRecommendation() {
		return numOfRecommendations;
	}
	
	/**
	 * Increating the number of recommandations in the object of class Page by one.
	 */
	public void addRecommedation() {
		numOfRecommendations++;
	}
	
	/**
	 * Getter method for posts data field.
	 * 
	 * @return  posts - ArrayList that store the objects of class Post in it
	 */
	public ArrayList<Post> getPagePosts() {
		return posts;
	}
	
	/**
	 * Add object of class Post into ArrayList called "posts" that store posts of the object of class Page
	 * 
	 * @param  post - object of class Post
	 */
	public void addNewPostToPagePostsList(Post post) {
		posts.add(post);
	}

}
