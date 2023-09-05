package senacdw.gabriel.henrique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senacdw.gabriel.henrique.model.entity.Produto;
import senacdw.gabriel.henrique.model.seletor.ProdutoSeletor;
import senacdw.gabriel.henrique.service.ProdutoService;

@RestController
@RequestMapping(path = "/api/produtos")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:5500"}, maxAge = 3600)
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public List<Produto> consultarTodos()
	{
		return produtoService.buscaTodos();
	}
	
	@PostMapping("/comFiltro")
	public List<Produto> comFiltro(@RequestBody ProdutoSeletor seletor)
	{
		return produtoService.comFiltro(seletor);
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
