import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 * This is the Systems class, its contains the main method and all objects and data stored in the member variables of this class. From this class
 * we can add User object in the system and remove it from the system and alot more that this action.
 *
 * @author Moemen Mohamed
 */
public class Systems {
    /**
     * Data fields or member variables work as Database for the all type for objects in the system ( User, HomePage, AboutUser, Message, Groups,
     * and Page objects ) for each user.
     */
    static ArrayList<User> allUsersInDataBase = new ArrayList<User>();
    static ArrayList<HomePage> usersHomePages = new ArrayList<HomePage>();
    static ArrayList<AboutUser> aboutUsers = new ArrayList<AboutUser>();
    static ArrayList<Message> allMessages = new ArrayList<Message>();
    static ArrayList<Groups> groupsDataBase = new ArrayList<Groups>();
    static ArrayList<Page> pagesDataBase = new ArrayList<Page>();
	
    /**
     * Main method call on it the logView method (the start of the project)
     */
    public static void main(String[] args) {
    	logView();
    }
    
    /**
     * This method will add User and his HomePage and AboutUser in the same time at the system
     * 
     * @param  user - object of class User,
     *         homePage - object of class HomePage,
     *         about - object of class AboutUser that stored on it public informations like (eduaction, relationship and so on..)
     */
    public static void addUser(User user, HomePage homePage, AboutUser about) {
    	allUsersInDataBase.add(user);
    	usersHomePages.add(homePage);
    	aboutUsers.add(about);
    }
	
    /**
     * This metod will remove User and his HomePage and AboutUser in the same time from the system
     * 
     * @param  user - object of class User
     */
    public static void removeUser(User user) {
    	int indexOfUser = allUsersInDataBase.indexOf(user);
    	allUsersInDataBase.remove(user);
		usersHomePages.remove(indexOfUser);
		aboutUsers.remove(indexOfUser);
    }

    /**
     * Getter method for allUsersInDataBase list
     * 
     * @return  allUsersInDataBase - ArrayList that store all User objects in the system
     */
    public static ArrayList<User> getAllUsers() {
    	return allUsersInDataBase;
    }
	
    /**
     * Getter method for usersHomePages list 
     * 
     * @return usersHomePages - ArrayList that store all HomePages objects in the system
     */
    public static ArrayList<HomePage> getHomePages() {
    	return usersHomePages;
    }
	
    /**
     * Getter method for aboutUsers list
     * 
     * @return  aboutUser - ArrayList that store all AboutUsers objects in the system
     */
    public static ArrayList<AboutUser> getAboutUsers() {
    	return aboutUsers;
    }
	
    /**
     * Getter for allMessage list. This method return all messages of all user of the system
     * 
     * @return  allMessages - ArrayList that store all Messages objects in the system
     */
    public static ArrayList<Message> getAllMessages() {
		return allMessages;
    }
    
    /**
     * This method will add Message object to the ArrayList of Messages in the system
     * 
     * Note: Message object store on it the sender email and the accepter email
     * 
     * @param  message - object of class Message
     */
    public static void addMessageToMessagesDataBase(Message message) {
    	allMessages.add(message);
    }
    
    /**
     * Getter method for groupsDataBase list. This list store all Groups objects that created in the system
     * 
     * @return  groupsDataBase - ArrayList that store all Groups objects in the system
     */
    public static ArrayList<Groups> getAllGroups() {
		return groupsDataBase;
    }
	
    /**
     * This method will add Group object into the ArrayList that store on it all Groups objects in the system
     * 
     * @param  group - object of class Group
     */
    public static void AddGroupToDataBase(Groups group) {
    	groupsDataBase.add(group);
    }
    
    /**
     * This method will remove Group object from the ArrayList that store on it all Groups objects in the system
     * 
     * @param  group - object of class Group
     */
    public static void removeGroupFromDataBase(Groups group) {
    	groupsDataBase.remove(group);
    }
	
    /**
     * Getter method for pagesDataBase list. This list store all Pages objects that created in the system
     * 
     * @return  pagesDataBase - ArrayList that store all Pages objects in the system
     */
    public static ArrayList<Page> getAllPages() {
    	return pagesDataBase;
    }
    
    /**
     * This method will add Page object into the ArrayList that store on it all Pages objects in the system
     * 
     * @param  page - object of class Page
     */
    public static void AddToPagesDataBase(Page page) {
    	pagesDataBase.add(page);
    }
    
    /**
     * This method will remove Page object from the ArrayList that store on it all Pages objects in the system
     * 
     * @param  page - object of class Page
     */
    public static void removePagesFromDataBase(Page page) {
    	pagesDataBase.remove(page);
    }

    /**
     * This method will take the email and password of user and check if this email found on tha ArrayList of Users objects if email found then
     * will check the password validation else the method will print "This email and password not found in the system.".
     * If the email found and the password is valid then will the HomePage object of user.
     * 
     * @param  email - email of user,
     *         password - password of user
     */
    public static void signIn(String email, String password) {
    	boolean foundInDataBase = false;
		for(int i = 0; i < allUsersInDataBase.size(); i++) {
			if(email.equalsIgnoreCase(allUsersInDataBase.get(i).getEmail()) && password.equals(allUsersInDataBase.get(i).getPassword())) {
				HomePage userHomePage = getHomePages().get(i);
				userHomePage.homePageView();
				foundInDataBase = true;
			}
		}
		if(foundInDataBase == false) {
			System.out.println("This email and password not found in the system.");
			logView();
		}
    }
	
    /**
     * This method will ask the user to enter first name, last name, email, password, phone number and gender then
     * the method will call the validations methods for each requirment after check the validation the method will 
     * create new User object that takes this requirments (first name, last name, ... ) then store this User object 
     * into allUsersInDataBase list. After that the method will create an HomePage object, and AboutUser object and 
     * store those objects in usersHomePages and aboutUsers.
     */
    public static void signUp() {
    	Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter your first name: ");
		String firstName = nameValidation();
		System.out.print("Enter your last name: ");
		String lastName = nameValidation();
		System.out.print("Enter your email: ");
		String email = emailValidation();
		System.out.print("Enter your password: ");
		String password = console.next();
		System.out.print("Enter your phone number: ");
		String phoneNumber = phoneNumberValidation();
		System.out.print("Choose your gender (M or F): ");
		String gender = genderValidation();
		
        System.out.println();
		
        if(isEmailAndPhoneNumberFoundInDataBase(email, phoneNumber) == false) {
            User user = new User(firstName, lastName, email, password, phoneNumber, gender);
            HomePage userHome = new HomePage(user);
            AboutUser aboutUser = new AboutUser();
            allUsersInDataBase.add(user);
            aboutUsers.add(aboutUser);
            usersHomePages.add(userHome);
            usersHomePages.get(allUsersInDataBase.size()-1).homePageView();
		} else {
            System.out.println("Sorry this email and phone number is already used. So please enter your data again.");
            logView();
		}
    }
	
    /**
     * This method will visulize the SignIn and SignUp methods
     */
    public static void logView() {
    	Scanner console = new Scanner(System.in);
		System.out.println("------------------ Social Media APP ------------------");
		System.out.println();
        System.out.println("1) SignIn.");
    	System.out.println("2) SignUp. ");
        System.out.println("3) Exit. ");
    	System.out.println();
    	System.out.print("Enter what you want to do (1, 2 or Exit): ");
		String choice = console.next();
		System.out.println();
		if(choice.equals("1")) {
            System.out.println("------------------ SignIn ------------------");
            System.out.println();
            System.out.print("Enter Your Email: ");
	    	String email = console.next();
	    	System.out.print("Enter Your Password: ");
	    	String password = console.next();
	    	signIn(email, password);
		} else if(choice.equals("2")) {
	    	System.out.println("------------------ SignUp ------------------");
	    	signUp();
		} else if(choice.equalsIgnoreCase("Exit") || choice.equals("3")) {
	    	System.out.println("Thank you for using Social Media APP.");
		} else {
	    	System.out.println("InValid Choice. So Please Enter What You Want Again. ");
	    	System.out.println();
	    	logView();
		}
    }
	
	
    /**
     * Email validation method.
     */
    public static String emailValidation() {
    	Scanner console = new Scanner(System.in);
		String email = console.next();
		int indexOfAt = 0, indexOfDot = 0;

        // to count  index of @ and index of dot (.)
		for (int i = 0; i < email.length() ; i++) {  
            if (email.charAt(i) == '@') {
            	indexOfAt = i;
            }
            if (email.charAt(i) == '.') {
            	indexOfDot = i;
            }
		}	

		boolean flag = false;
		if (indexOfAt != 0 && indexOfDot != 0 && indexOfAt+1 < indexOfDot && indexOfAt != email.length()-1 && indexOfDot != email.length()-1) {
			flag = true;
            return email;
		}
	
		String email3 = null;
		while (flag == false) {
			System.out.print("**Please Enter The Email Again :- ");
            String email2 = console.next();
	    	int indexOfAt2 = 0, indexOfDot2 = 0;
	    
	    	// to count the index of the (@) and the index of the (.) for the new email that the user entered
	    	for (int i = 0; i < email2.length() ; i++) {  
	    	if (email2.charAt(i) == '@') {
				indexOfAt2 = i;
			}
			if (email2.charAt(i) == '.') {
		    	indexOfDot2 = i;
			}
            	}

            if (indexOfAt2 != 0 && indexOfDot2 != 0 && indexOfAt2+1 < indexOfDot2 && indexOfAt2 != email2.length()-1 && indexOfDot2 != email2.length()-1) {
            	flag = true;
            	email3 = email2;
            	break;
            }
		}
		return email3;
    }
    
    /**
     * Name validation method
     */
    public static String nameValidation() {
    	Scanner console = new Scanner(System.in);
		String name = console.next();

		boolean flag = false;
		for (int i = 0; i < name.length() ; i++) {
			if ((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			return name;
		}
		
		String name3 = null;
		while (flag == false) {
        	System.out.print("**Please enter the name again :- ");
    		String name2 = console.next();

    		for (int i = 0; i < name2.length() ; i++) {
				if ((name2.charAt(i) >= 'a' && name2.charAt(i) <= 'z') || (name2.charAt(i) >= 'A' && name2.charAt(i) <= 'Z')) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				name3 = name2;
			}
		}
	
		return name3;
    }
    
    /**
     * Phone Number validation method.
     * 
     * Note: this method work to validate the Egyption phone numbers only
     */
    public static String phoneNumberValidation() {
    	Scanner console = new Scanner(System.in);
		String number = console.next();
		
		// count the number of digits
		int digitsOfTheFirstCheck = 0;
		for (int i = 0; i < number.length(); i++) {
			digitsOfTheFirstCheck++;
		}	

		boolean flag = false;
		if (((digitsOfTheFirstCheck == 11) && (number.charAt(0) == '0') && (number.charAt(1) == '1') && 
			(number.charAt(2) == '0' || number.charAt(2) == '1' || number.charAt(2) == '2' || number.charAt(2) == '5') && 
			(number.charAt(3) >= '0' && number.charAt(3) <= '9') && (number.charAt(4) >= '0' && number.charAt(4) <= '9') && 
			(number.charAt(5) >= '0' && number.charAt(5) <= '9') && (number.charAt(6) >= '0' && number.charAt(6) <= '9') && 
			(number.charAt(7) >= '0' && number.charAt(7) <= '9') && (number.charAt(8) >= '0' && number.charAt(8) <= '9') && 
			(number.charAt(9) >= '0' && number.charAt(9) <= '9') && (number.charAt(10) >= '0' && number.charAt(10) <= '9'))) {
			
			flag = true;
		}

		while (flag == false) {
            System.out.print("**You entered wrong mobile number so please enter the mobile again :- ");
            number = console.next();

            // count the number of digits
            int digitsOfTheSecondCheck = 0;
            for (int i = 0; i < number.length() ; i++) {
            	digitsOfTheSecondCheck++;
            }

            if (((digitsOfTheSecondCheck == 11) && (number.charAt(0) == '0') && (number.charAt(1) == '1') && 
            		(number.charAt(2) == '0' || number.charAt(2) == '1' || number.charAt(2) == '2' || number.charAt(2) == '5') && 
            		(number.charAt(3) >= '0' && number.charAt(3) <= '9') && (number.charAt(4) >= '0' && number.charAt(4) <= '9') && 
            		(number.charAt(5) >= '0' && number.charAt(5) <= '9') && (number.charAt(6) >= '0' && number.charAt(6) <= '9') && 
            		(number.charAt(7) >= '0' && number.charAt(7) <= '9') && (number.charAt(8) >= '0' && number.charAt(8) <= '9') && 
            		(number.charAt(9) >= '0' && number.charAt(9) <= '9') && (number.charAt(10) >= '0' && number.charAt(10) <= '9'))) {
			
            	flag = true;
              	break;
            }	
		}
		return number;
    }

    /**
     * Gender validation method.
     */
    public static String genderValidation() {
    	Scanner console = new Scanner(System.in);
    	String gender = console.next();
    	boolean flag = true;
    	if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
    		return gender;
    	} else {
    		flag = false;
    	}
    	String gender2 = null;
    	while (flag == false) {
    		System.out.print("**Please enter your gender again :- ");
    		String gender3 = console.next();

    		if(gender3.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
    			flag = true;
    			gender2 = gender3;
    			break;
    		}
    	}
    	return gender2;
    }

    /**
     * This method will check if the email and phone numbers store in the system or not.
     * 
     * @return  flag
     */
	public static boolean isEmailAndPhoneNumberFoundInDataBase(String email, String phoneNumber) {
		boolean flag = false;
		for(int i = 0; i < allUsersInDataBase.size(); i++) {
			if(allUsersInDataBase.get(i).getEmail().equals(email)  || allUsersInDataBase.get(i).getPhoneNumber().equals(phoneNumber)) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;
	}
}
