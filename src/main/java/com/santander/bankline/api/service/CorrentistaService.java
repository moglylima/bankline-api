package com.santander.bankline.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.bankline.api.dto.NovoCorrentista;
import com.santander.bankline.api.model.Conta;
import com.santander.bankline.api.model.Correntista;
import com.santander.bankline.api.repository.CorrentistaRepository;

@Service
public class CorrentistaService {
	
	@Autowired
	private CorrentistaRepository correntistaRepository; 
		
	public void saveCorrentista(NovoCorrentista novoCorrentista) {	
		//Criando correntista
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		//Criando dados da conta
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());		
		correntista.setConta(conta);
		
		//Adicionando finalmente
		correntistaRepository.save(correntista);
		

	}
}
