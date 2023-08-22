package senacdw.gabriel.henrique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import senacdw.gabriel.henrique.model.entity.Produto;
import senacdw.gabriel.henrique.model.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;

	@Transactional
	public List<Produto> buscaTodos() 
	{
		return produtoRepository.findAll();
	}

	@Transactional
	public Produto consultarPorId(long id) 
	{
		return produtoRepository.findById(id).get();
	}

	@Transactional
	public Produto inserir(Produto produto) 
	{
		return produtoRepository.save(produto);
	}

	@Transactional
	public Produto atualizar(Produto produto) 
	{
		return produtoRepository.save(produto);
	}
	
	@Transactional
	public void deletar(Produto produto)
	{
		produtoRepository.delete(produto);
	}
}
