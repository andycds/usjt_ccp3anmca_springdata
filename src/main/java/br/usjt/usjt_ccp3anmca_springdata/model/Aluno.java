package br.usjt.usjt_ccp3anmca_springdata.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//na Entity Aluno
@NamedQuery(name = "Aluno.buscarPeloNomeEPeloEmail",
query = "SELECT a FROM Aluno a WHERE nome = :nome AND email = :email")

@Entity
@Table(name = "tb_aluno")
@Getter @Setter @ToString
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String fone;
	
	private String email;
}