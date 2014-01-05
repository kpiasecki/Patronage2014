package zut.wi.kpiasecki.common.model;

public class MessageService {

	String message;
	
	public void setMessage(Integer id, String operation)
	{
		if(operation.equals("added"))
			this.message = "New user with id: " + id + " was " + operation + " successfully!";
		else
			this.message = "User with id: " + id + " was " + operation + " successfully!";
	}
	
	public String getMessage()
	{
		return this.message;
	}
}
