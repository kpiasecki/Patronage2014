package zut.wi.kpiasecki.common.model;

public class User {

	private Integer id;
	private String username;
	private String email;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public User()
	{
		//this.id = (long) 0;
		//this.username = "";
		//this.email = "";
	}
	
	public void updateUser(Integer id, String username, String email)
	{
		this.id = id;
		this.username = username;
		this.email = email;
	}
	
}
