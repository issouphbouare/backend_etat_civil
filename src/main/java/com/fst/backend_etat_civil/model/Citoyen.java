package com.fst.backend_etat_civil.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data  
@AllArgsConstructor 
@NoArgsConstructor 
@ToString
public class Citoyen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String niciv;
	private String prenom;
	private String nom;
	private String telephone;
	private String genre;
	private String profession;
	private String situationMatrimoniale;
	private Date dateNaissance;
	private String portrait;
	
	private String prenomPere;
	private String professionPere;
	
	private String nomMere;
	private String prenomMere;
	private String professionMere;
	
	@ManyToOne
	private Vqf lieuNaissance;
	
	@ManyToOne
	private Adresse adresse;
	
	@ManyToOne
	private Agent agent;
	
	@OneToMany(mappedBy = "citoyen", cascade = CascadeType.ALL)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Document> documents;
	
	@OneToMany(mappedBy = "citoyen", cascade = CascadeType.ALL)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Justificatif> justificatifs;
	
	@OneToMany(mappedBy = "citoyen", cascade = CascadeType.ALL)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Empreinte> empreintes;
	
	


}
