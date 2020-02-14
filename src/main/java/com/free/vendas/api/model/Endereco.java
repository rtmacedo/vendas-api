package com.free.vendas.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
@Table(name="endereco")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@NotNull
	private Long cep;
	
	@NotNull
	@OneToOne
	private Cidade cidade;
	
	@NotNull
	@OneToOne
	private Estado estado;
	
	@NotNull
	private String bairro;
	
	@NotNull
	private String rua;
	
	@NotNull
	private String numero;
	
	private String complemento;
	
	private String referencia;
	
	@NotBlank
	private String descricao;
}
