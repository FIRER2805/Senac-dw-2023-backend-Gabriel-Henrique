package senacdw.gabriel.henrique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senacdw.gabriel.henrique.model.entity.Fabricante;
import senacdw.gabriel.henrique.service.FabricanteService;

@RestController
@RequestMapping(path = "/api/fabricantes")
public class FabricanteController {
	
	@Autowired
	private FabricanteService fabricanteService;
	
	@GetMapping
	public List<Fabricante> consultarTodos()
	{
		return fabricanteService.buscarTodos();
	}
}
