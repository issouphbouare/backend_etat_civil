package com.fst.backend_etat_civil.model;

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
public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String rue;
	private String porte;
	private String autre;
	
	@ManyToOne
	private Vqf vqf;
	
	@OneToMany(mappedBy = "adresse", cascade = CascadeType.ALL)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Citoyen> citoyens;

}
