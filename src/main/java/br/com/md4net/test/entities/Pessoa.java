package br.com.md4net.test.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(length = 30, nullable = false, unique = true)
	private String nome;
	
	@Column(precision = 3, scale = 2)
	private BigDecimal altura;

}
