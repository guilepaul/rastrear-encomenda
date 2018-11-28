package com.gplog.rastreio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gplog.rastreio.model.Local;
import com.gplog.rastreio.repository.Locais;

@CrossOrigin("*")
@RestController
@RequestMapping("/locais")
public class LocaisResource {
	
	@Autowired
	private Locais locais; //repositorio
	
	@GetMapping //metodo sere invocado qd houver uma req GET em /locais
	public List<Local> listar() {
		return locais.findAll();
	}

}
