package spring.demo.entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "produs")
public class Produs implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nume;
	private Integer pret;
	private Categorie categorie;
	
	public Produs() {
	}


	public Produs(Integer id, String nume, Integer pret, Categorie categorie) {
		super();
		this.id = id;
		this.nume = nume;
		this.pret = pret;
		this.categorie = categorie;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nume", nullable = false, length = 200)
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	@Column(name = "pret", nullable = false, length = 10)
	public Integer getPret() {
		return pret;
	}


	public void setPret(Integer pret) {
		this.pret = pret;
	}
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="categorie", nullable = false)
	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
}

