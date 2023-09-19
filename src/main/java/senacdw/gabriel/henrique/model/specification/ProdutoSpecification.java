package senacdw.gabriel.henrique.model.specification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Predicate;
import senacdw.gabriel.henrique.model.entity.Produto;
import senacdw.gabriel.henrique.model.seletor.ProdutoSeletor;

public class ProdutoSpecification {
	
	public static Specification<Produto> comFiltros(ProdutoSeletor seletor)
	{
		List<Predicate> predicates = new ArrayList<>();
		return (root, query, cb) -> {
			if(seletor.getNome() != null)
				predicates.add(cb.like(root.get("nome"),"%" + seletor.getNome() + "%"));
			
			if(seletor.getPesoInicial() != null && seletor.getPesoMaximo() != null)
				predicates.add(cb.between(root.get("peso"), seletor.getPesoInicial(), seletor.getPesoMaximo()));
			
			if(seletor.getValorMaximo() != null)
				predicates.add(cb.lessThanOrEqualTo(root.get("valor"), seletor.getValorMaximo()));
			
			//WHERE f.cnpj = '123456789...'
			if(seletor.getCnpjFabricante() != null && !seletor.getCnpjFabricante().isBlank())
				predicates.add(cb.equal(root.join("fabricanteDoProduto").get("cnpj"), seletor.getCnpjFabricante()));
			
			if(seletor.getDataCadastroInicial() != null && seletor.getDataCadastroMaximo() != null)
				predicates.add(cb.between(root.get("dataCadastro"), seletor.getDataCadastroInicial(), seletor.getDataCadastroMaximo()));
			
			return cb.and(predicates.toArray(new Predicate[0]));
		};
	}
}
