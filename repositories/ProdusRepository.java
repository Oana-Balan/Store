package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.demo.entities.Produs;

public interface ProdusRepository extends JpaRepository<Produs, Integer>{
	Produs findById(int id_produs);
}

