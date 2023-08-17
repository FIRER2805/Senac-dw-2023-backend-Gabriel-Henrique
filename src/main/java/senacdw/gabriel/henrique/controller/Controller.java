package senacdw.gabriel.henrique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senacdw.gabriel.henrique.model.entity.Produto;
import senacdw.gabriel.henrique.service.ProdutoService;

@RestController
@RequestMapping(path = "/api/produtos")
public class Controller {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> consultarTodos(){
		return produtoService.buscaTodos();
	}
	
}
