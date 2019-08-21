package spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import spring.demo.dto.*;
import spring.demo.services.*;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/insertProduct", method = RequestMethod.POST)
	public String insertP(@ModelAttribute("produs") ProdusDTO prodDTO){
		adminService.createProd(prodDTO);
		return "Insert succeed!";
	}
	
	@RequestMapping(value = "/deleteProduct/{id_produs}")
	public String deleteP(@PathVariable("id_produs") int id_produs){
		adminService.deleteProd(id_produs);
		return "Delete succeed!";
	}
	
	@RequestMapping(value = "/insertCategory", method = RequestMethod.POST)
	public String insertC(@ModelAttribute("categorie") CategorieDTO catDTO){
		adminService.createCat(catDTO);
		return "Insert succeed!";
	}
	
	@RequestMapping(value = "/deleteCategory/{categorie_produs}")
	public String deleteC(@PathVariable("categorie_produs") String categorie_produs){
		adminService.deleteCat(categorie_produs);
		return "Delete succeed!";
	}
	
}
