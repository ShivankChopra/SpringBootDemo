package Demo.User.Impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import Demo.User.User;
import Demo.User.UserDao;

@Repository
public class UserDaoFakeImpl implements UserDao{

	private static Map<Integer, User> users;
	
	static{
		users = new HashMap<Integer, User>();
		users.put(1, new User(1, "Shivank Chopra", "shivankchopra017@gmail.com"));
		users.put(2, new User(2, "Anirudh Chopra", "anirudhchopra011@gmail.com"));
		users.put(3, new User(3, "Ridu Chopra", "riduchopra077@gmail.com"));
	}
	
	public Collection<User> getAllUsers() {
		return users.values();
	}

	public User getUserById(int id) {
		if(!users.containsKey(id)){
			System.out.println("User with id " + id + " not found");
			return null;
		}
		else
			return users.get(id);
	}

	public void deleteUserById(int id) {
		if(users.containsKey(id)){
			users.remove(id);
		}
		else
			System.out.println("User with id " + id + " not found");
	}

	public void updateUserById(User user) {
		if(users.containsKey(user.getId())){
			User u = users.get(user.getId());
			u.setEmail(user.getEmail());
			u.setName(user.getName());
		}
		else
			System.out.println("User with id " + user.getId() + " not found");
	}

	public void addUser(User user) {
		if(!users.containsKey(user.getId())){
			users.put(user.getId(), user);
		}
	}
	
}