package com.gplog.rastreio.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gplog.rastreio.model.Cliente;
import com.gplog.rastreio.repository.Clientes;

@CrossOrigin("*")
@RestController
@RequestMapping("/clientes")
public class ClientesResource {
	
	@Autowired
	private Clientes clientes; //repositorio
	
	@GetMapping //metodo sere invocado qd houver uma req GET em /clientes
	public List<Cliente> listar() {
		return clientes.findAll();
	}

}
