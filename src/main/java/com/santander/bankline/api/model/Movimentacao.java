package com.santander.bankline.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Movimentacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = ("data_movimentacao"))
	private LocalDateTime dataHora;
	
	private String descricao;
	private Double valor;
	
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipo tipo;
}


