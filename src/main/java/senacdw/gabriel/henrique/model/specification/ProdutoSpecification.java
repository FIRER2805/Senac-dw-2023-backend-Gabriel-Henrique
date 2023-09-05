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
			
			return cb.and(predicates.toArray(new Predicate[0]));
		};
	}

}
