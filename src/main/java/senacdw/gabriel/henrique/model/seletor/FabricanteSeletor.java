package senacdw.gabriel.henrique.model.seletor;

public class FabricanteSeletor {
	private String nome;
	private String cnpj;
	
	public FabricanteSeletor(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public FabricanteSeletor() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
