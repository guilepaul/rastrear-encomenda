package com.gplog.rastreio.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gplog.rastreio.model.Encomenda;
import com.gplog.rastreio.repository.Encomendas;
import com.gplog.rastreio.service.EncomendaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/encomendas")
public class EncomendasResource {
	
	@Autowired
	private Encomendas encomendas; //repositorio
	
	@Autowired
	private EncomendaService encomendaService;
	
	@GetMapping //metodo sere invocado qd houver uma req GET em /encomendas
	public List<Encomenda> listar() {
		return encomendas.findAll();
	}
	
	@PostMapping
	public Encomenda adicionar(@RequestBody @Valid Encomenda encomenda) {
		return encomendaService.adicionar(encomenda);
	}

}
