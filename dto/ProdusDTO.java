package spring.demo.dto;

import spring.demo.dto.ProdusDTO;
import spring.demo.entities.Categorie;

public class ProdusDTO {
	private Integer id;
	private String nume;
	private Integer pret;
	private Categorie categorie;
	
	public ProdusDTO(){
		
	}

	public ProdusDTO(Integer id, String nume, Integer pret, Categorie categorie) {
		super();
		this.id = id;
		this.nume = nume;
		this.pret = pret;
		this.categorie = categorie;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Integer getPret() {
		return pret;
	}

	public void setPret(Integer pret) {
		this.pret = pret;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public static class Builder{
		private Integer nestedid;
		private String nestednume;
		private Integer nestedpret;
		private Categorie nestedcategorie;
		
		public Builder id(int id){
			this.nestedid = id;
			return this;
		}
		
		public Builder nume(String nume){
			this.nestednume = nume;
			return this;
		}
		
		public Builder pret(int pret){
			this.nestedpret = pret;
			return this;
		}
		
		public Builder categorie(Categorie categorie){
			this.nestedcategorie = categorie;
			return this;
		}
		
		public ProdusDTO create(){
			return new ProdusDTO(nestedid, nestednume, nestedpret, nestedcategorie);
		}
	}

}
