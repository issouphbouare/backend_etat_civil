package com.fst.backend_etat_civil.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String code;
	private String nom;
	private String autre;
	
	@OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Cercle> cercles;
	
}
