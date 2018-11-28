package com.gplog.rastreio.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gplog.rastreio.model.Encomenda;
import com.gplog.rastreio.repository.Encomendas;
import com.gplog.rastreio.repository.Locais;

@Service
public class EncomendaService {
	
	@Autowired
	private Encomendas encomendas;
	
	@Autowired
	private Locais locais;
	
	public Encomenda adicionar(Encomenda encomenda) {
		encomenda.setPostagem(LocalDateTime.now());
		encomenda.getSteps().forEach(i -> {
			i.setEncomenda(encomenda);
			i.setLocal(locais.findById(i.getLocal().getId()).get());
		});
		
		return encomendas.save(encomenda);
		
	}

}
