package spring.demo.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.demo.dto.*;
import spring.demo.entities.*;
import spring.demo.repositories.*;

@Service
public class UserService {
	@Autowired
	private ProdusRepository prodRepository;
	
	@Autowired
	private CategorieRepository catRepository;
	
	public List<ProdusDTO> findAllProd(){
		List<Produs> produse = prodRepository.findAll();
		List<ProdusDTO> toReturn = new ArrayList<ProdusDTO>();
		for(Produs prod : produse){
			ProdusDTO dto = new ProdusDTO.Builder()
					.id(prod.getId())
					.nume(prod.getNume())
					.pret(prod.getId())
					.categorie(prod.getCategorie())
					.create();
			toReturn.add(dto);
		}
		return toReturn;
	}
	
	public List<CategorieDTO> findAllCat(){
		List<Categorie> categori = catRepository.findAll();
		List<CategorieDTO> toReturn = new ArrayList<CategorieDTO>();
		for(Categorie cat : categori){
			CategorieDTO dto = new CategorieDTO.Builder()
					.categorie(cat.getCategorie())
					.create();
			toReturn.add(dto);
		}
		return toReturn;
	}
	
}
