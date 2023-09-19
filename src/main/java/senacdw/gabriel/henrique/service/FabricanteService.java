package senacdw.gabriel.henrique.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senacdw.gabriel.henrique.model.entity.Fabricante;
import senacdw.gabriel.henrique.model.repository.FabricanteRepository;

@Service
public class FabricanteService {

	@Autowired
	private FabricanteRepository fabricanteRepository;
	
	public List<Fabricante> buscarTodos() {
		return fabricanteRepository.findAll();
	}
	
	public Fabricante inserir(Fabricante fabricante) {
		return fabricanteRepository.save(fabricante);
	}

}
