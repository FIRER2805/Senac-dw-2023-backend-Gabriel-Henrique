package senacdw.gabriel.henrique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senacdw.gabriel.henrique.model.entity.Produto;
import senacdw.gabriel.henrique.model.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> buscaTodos()
	{
		return produtoRepository.findAll();
	}
}
