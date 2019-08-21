package spring.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "categorie")
public class Categorie implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String categorie;
	
	public Categorie() {
		
	}
	
	public Categorie(String categorie) {
		super();
		this.categorie = categorie;
	}
	
	@Id
	@Column(name = "categorie", nullable = false, length = 200)
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}	
}
