package zut.wi.kpiasecki.common.model;

public class HelloMessage {
	
	String message;
	
	public void setMessage(String name) {
		this.message = name;
	}
	
	public String getMessage() {
		String result;
		result = "Hello, " + message + "!";
		return result;
	}
}
