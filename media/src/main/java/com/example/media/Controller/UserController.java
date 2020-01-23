package com.example.media.Controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.media.Model.News;
import com.example.media.Model.User;
import com.example.media.Repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	 private UserRepository  userep;
	
	 
	@GetMapping("/getAllUser")
	  public List<User> getAllUsers() {
		  		  
	    return userep.findAll();
	  }
	  
	@GetMapping("/{id}")
	  public User getUserById(@PathVariable("id") ObjectId id) {
	    return userep.findByid(id);
	  }
	  
	  @PostMapping("/addUser")
	 
		 
	  public String save(@RequestBody User user) {
		  userep.save(user);
		 
	  
		  userep.save(user);
		  return user.getId();
	  }
	  @DeleteMapping("/{id}")
	    public String delete(@PathVariable ObjectId id) {
	        User user = userep.findByid(id);
	        userep.delete(user);

	        return "news deleted";
	    }
	 
	  @PutMapping("/{id}")
	  public void updateById(@PathVariable("id") ObjectId id, @Valid @RequestBody User user) {
	    user.setId(id);
	    userep.save(user);
	  }
}
