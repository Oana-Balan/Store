package spring.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.demo.dto.*;
import spring.demo.entities.*;
import spring.demo.repositories.*;
import spring.demo.errorhandler.ResourceNotFoundException;

@Service
public class AdminService {
	@Autowired
	private ProdusRepository prodRepository;
	
	@Autowired
	private CategorieRepository catRepository;
	
	public void createProd(ProdusDTO prodDTO){
		Produs prod = new Produs();
		prod.setNume(prodDTO.getNume());
		prod.setPret(prodDTO.getPret());
		prod.setCategorie(prodDTO.getCategorie());
		prodRepository.save(prod);
		
	}
	
	public void createCat(CategorieDTO catDTO){
		Categorie cat = new Categorie();
		cat.setCategorie(catDTO.getCategorie());
		catRepository.save(cat);
		}
	
	public ProdusDTO findByIdProd(int id_produs){
		Produs prod = prodRepository.findById(id_produs);
		if(prod == null){
			throw new ResourceNotFoundException(Produs.class.getSimpleName());
		}
		ProdusDTO dto = new ProdusDTO.Builder()
					.id(prod.getId())
					.nume(prod.getNume())
					.pret(prod.getPret())
					.categorie(prod.getCategorie())
					.create();
		return dto;
	}
	
	public void deleteProd(int id_produs){
		ProdusDTO dto = findByIdProd(id_produs);
		prodRepository.delete(dto.getId());
	}
	
	public CategorieDTO findByIdCat(String categorie_produs){
		Categorie cat = catRepository.findByCat(categorie_produs);
		if(cat == null){
			throw new ResourceNotFoundException(Produs.class.getSimpleName());
		}
		CategorieDTO dto = new CategorieDTO.Builder()
				.categorie(cat.getCategorie())
				.create();
		
		return dto;
	}
	
	public void deleteCat(String categorie_produs){
		CategorieDTO dto = findByIdCat(categorie_produs);
		catRepository.delete(dto.getCategorie());
		
	}
}
