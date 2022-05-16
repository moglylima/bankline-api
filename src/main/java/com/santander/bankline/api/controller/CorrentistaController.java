package com.santander.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santander.bankline.api.dto.NovoCorrentista;
import com.santander.bankline.api.model.Correntista;
import com.santander.bankline.api.repository.CorrentistaRepository;
import com.santander.bankline.api.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	
	@Autowired
	private CorrentistaService correntistaService;
	
	//Metodo retorna correntistas
	@GetMapping
	public List<Correntista> findAll(){
		return correntistaRepository.findAll();
	}
	
	//Metodo adiciona correntista
	@PostMapping
	private void saveNewCorrentista(@RequestBody NovoCorrentista correntista) {	
		correntistaService.saveCorrentista(correntista);
	}
	
}
