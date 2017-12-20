package Demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public @ResponseBody String greet(){
		return "This shit works!";
	}
}