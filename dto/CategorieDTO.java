package spring.demo.dto;

import spring.demo.dto.CategorieDTO;

public class CategorieDTO {
	private String categorie;
	
	public CategorieDTO(){
			
		}

		public CategorieDTO(String categorie) {
			super();
			this.categorie = categorie;
		}
		
		public String getCategorie() {
			return categorie;
		}

		public void setCategorie(String categorie) {
			this.categorie = categorie;
		}
		
		public static class Builder{
			private String nestedcategorie;
			
			public Builder categorie(String categorie){
				this.nestedcategorie = categorie;
				return this;
			}
			
			public CategorieDTO create(){
				return new CategorieDTO(nestedcategorie);
			}
		}
}
