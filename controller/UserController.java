package spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.demo.dto.ProdusDTO;
import spring.demo.services.UserService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/allProducts", method = RequestMethod.GET)
	public List<ProdusDTO> getAllProd(){
		return userService.findAllProd();
	}
	
	
}
