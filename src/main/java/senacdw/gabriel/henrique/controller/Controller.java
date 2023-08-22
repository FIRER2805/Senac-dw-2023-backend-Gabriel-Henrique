package senacdw.gabriel.henrique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Produto> consultarTodos() 
	{
		return produtoService.buscaTodos();
	}

	@GetMapping("/{id}")
	public Produto consultarPorId(@PathVariable String id) 
	{
		return produtoService.consultarPorId(Long.parseLong(id));
	}

	@PostMapping("/inserir")
	public Produto inserirProduto(@RequestBody Produto produto) 
	{
		return produtoService.inserir(produto);
	}
	
	@PutMapping("/atualizar")
	public Produto atualizarProduto(@RequestBody Produto produto)
	{
		return produtoService.atualizar(produto);
	}
	
	@DeleteMapping("/deletar")
	public String deletarProduto(@RequestBody Produto produto)
	{
		produtoService.deletar(produto);
		return "deletado com sucesso!";
	}
	
}
