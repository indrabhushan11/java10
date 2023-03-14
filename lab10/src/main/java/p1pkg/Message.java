package p1pkg;


public class Message {

	int id;
	String message;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message(int id, String message) {
		this.id = id;
		this.message = message;
	}

	public Message() {
		// TODO Auto-generated constructor stub
	}

}

