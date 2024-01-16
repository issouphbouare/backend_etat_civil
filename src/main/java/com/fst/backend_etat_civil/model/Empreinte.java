package com.fst.backend_etat_civil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data  
@AllArgsConstructor 
@NoArgsConstructor 
@ToString
public class Empreinte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String nomDoigt;
	private String empreinteDoigt;

	
	@ManyToOne
	private Citoyen citoyen;
}
