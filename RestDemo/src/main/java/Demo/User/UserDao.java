package Demo.User;

import java.util.Collection;

public interface UserDao{
	
	public Collection<User> getAllUsers();
	
	public User getUserById(int id);
	
	public void deleteUserById(int id);
	
	public void updateUserById(User user);
	
	public void addUser(User user);
}