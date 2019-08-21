package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.demo.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, String>{
	Categorie findByCat(String categorie);

}
