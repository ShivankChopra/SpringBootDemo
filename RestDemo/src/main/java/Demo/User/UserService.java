package Demo.User;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
	
	@Autowired
	UserDao userDao;
	
	public Collection<User> getAllUsers(){
		return userDao.getAllUsers();
	}
	
	public User getUserById(Integer id){
		return userDao.getUserById(id);
	}
	
    public void deleteUserById(Integer id){
		userDao.deleteUserById(id);
	}
    
    public void updateUserById(User user){
    	userDao.updateUserById(user);
    }
    
    public void addUser(User user){
    	userDao.addUser(user);
    }    
    
}