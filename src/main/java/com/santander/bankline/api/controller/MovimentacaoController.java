package com.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santander.bankline.api.dto.NovaMovimentacao;
import com.santander.bankline.api.model.Movimentacao;
import com.santander.bankline.api.repository.MovimentacaoRepository;
import com.santander.bankline.api.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository movimentacaoRepository;
	
	@Autowired
	private MovimentacaoService movimentacaoService;
	
	//Metodo retorna correntistas
	@GetMapping
	public List<Movimentacao> findAll(){
		return movimentacaoRepository.findAll();

	}
	
	//Metodo adiciona correntista
	@PostMapping
	private void save(@RequestBody NovaMovimentacao movimentacao) {	
		movimentacaoService.saveNewMovimentacao(movimentacao);
	}
	
}
