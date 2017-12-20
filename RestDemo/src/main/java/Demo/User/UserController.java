package Demo.User;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController{
	
	@Autowired
	UserService us;
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	public Collection<User> getAllUsers(){
		return this.us.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public User getUserById(@PathVariable("id") int id){
		return this.us.getUserById(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable("id") int id){
		this.us.deleteUserById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody User user){
		this.us.updateUserById(user);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void add(@RequestBody User user){
		this.us.addUser(user);
	}
}