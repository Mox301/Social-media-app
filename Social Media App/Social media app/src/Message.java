/**
 * This is Message class, This is AboutUser class, and its job is to create an instance of the Message class that used in the chat between
 * the users in the social media app.
 *
 * @author Moemen Mohamed
 */
public class Message {
    private java.util.Date date;
    private String to, from;
    private String text;
	
    /**
     * Constructor for the object of class Message
     * 
     * @param  from - email of the first user (sender),
     *         to - email of the second user,
     *         text - message that will send
     */
    public Message (String from, String to, String text) {
    	date = new java.util.Date();
    	this.from = from;
    	this.to = to;
    	this.text = text;
    }
	
    /**
     * This method return date of sending this message as string
     * 
     * @return  date.toString - method that return date as string
     */
    public String ShowTime() {
    	return date.toString();
    }

    /**
     * Getter method for date data field
     * 
     * return java.util.Date - date of sending this message as object of class java.util.Date
     */
    public java.util.Date getTime() {
    	return date;
    }
    
    /**
     * Getter method for the "from" data field ( getter sender email )
     * 
     * @return  from - sender email
     */
    public String getFrom() {
    	return from;
    }
    
    /**
     * Getter method for the "to" data field
     * 
     * @return  to - the email of accepter
     */
    public String getTo() {
    	return to;
    }
    
    /**
     * Getter method for the text of the message
     * 
     * return  text - the message 
     */
    public String getText() {
    	return text;
    }
}