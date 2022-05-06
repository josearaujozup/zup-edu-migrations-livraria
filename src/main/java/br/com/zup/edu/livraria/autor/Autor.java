package br.com.zup.edu.livraria.autor;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String email;
	
	private LocalDate dataNascimento;
	
	private String biografia;
	
	private LocalDate dataCriacao;

	public Autor() {
	}
	
	
}
