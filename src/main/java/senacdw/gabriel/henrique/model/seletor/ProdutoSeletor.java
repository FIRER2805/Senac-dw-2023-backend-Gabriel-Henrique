package senacdw.gabriel.henrique.model.seletor;

import java.time.LocalDateTime;

public class ProdutoSeletor {
	private String nome;
	private Double valorMaximo;
	private Double pesoInicial;
	private Double pesoMaximo;
	private LocalDateTime dataCadastroInicial;
	private LocalDateTime dataCadastroMaximo;
	private String cnpjFabricante;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValorMaximo() {
		return valorMaximo;
	}
	public void setValorMaximo(Double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}
	public Double getPesoInicial() {
		return pesoInicial;
	}
	public void setPesoInicial(Double pesoInicial) {
		this.pesoInicial = pesoInicial;
	}
	public Double getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	public LocalDateTime getDataCadastroInicial() {
		return dataCadastroInicial;
	}
	public void setDataCadastroInicial(LocalDateTime dataCadastroInicial) {
		this.dataCadastroInicial = dataCadastroInicial;
	}
	public LocalDateTime getDataCadastroMaximo() {
		return dataCadastroMaximo;
	}
	public void setDataCadastroMaximo(LocalDateTime dataCadastroMaximo) {
		this.dataCadastroMaximo = dataCadastroMaximo;
	}
	public String getCnpjFabricante() {
		return cnpjFabricante;
	}
	public void setCnpjFabricante(String cnpjFabricante) {
		this.cnpjFabricante = cnpjFabricante;
	}
}
