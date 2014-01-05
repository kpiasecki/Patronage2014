package zut.wi.kpiasecki.common.model;

import java.util.HashMap;

public class UserService extends User{

	private static HashMap <Integer, User> users = new HashMap <Integer, User>();
	private static Integer currentId;
	
	public UserService()
	{
		
	}
	
	public User getUser(Integer id)
	{
		User user = users.get(id);
		return user;
	}
	
	public HashMap<Integer,User> getAllUsers()
	{
		return users;
	}
	
	public MessageService addUser(User user)
	{
		//Integer y = new Integer(1);
		//this.setCurrentId(this.getCurrentId().intValue() + 1);
		//Integer idx = this.getCurrentId();
		//if(currentId == null)
			//currentId = new Integer(0);
		//Integer idx = currentId.intValue() + 1;
		
		this.incrementId();
		Integer idx = currentId;
		
		user.setId(idx);
		users.put(idx, user);
		
		MessageService message = new MessageService();
		message.setMessage(idx, "added");
		return message;
	}
	
	public MessageService deleteUser(int id)
	{
		users.remove(id);
		MessageService message = new MessageService();
		message.setMessage(id, "deleted");
		return message;		
	}
	
	public MessageService updateUser(int id, User user)
	{
		user.setId(id);
		
		users.put(id, user);
		
		MessageService message = new MessageService();
		message.setMessage(id, "updated");
		return message;		
	}

	public void incrementId()
	{
		if(currentId == null)
		{
			Integer var = new Integer(0);
			currentId = var;
		}
		currentId = Integer.valueOf(currentId.intValue() + 1);
	}
	
}
