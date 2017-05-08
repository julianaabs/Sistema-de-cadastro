package br.imd.modelo;

public class Fornecedor {

	private String codigoFornecedor;
	private String nomeFornecedor;
	private String cnpjFornecedor;
	
	public Fornecedor(String codigoFornecedor, String nomeFornecedor, String cnpjFornecedor){}
	
	public void setCodigoFornecedor(String codigoFornecedor){
		this.codigoFornecedor = codigoFornecedor;
	}
	
	public String getCodigoFornecedor(){
		return codigoFornecedor;
	}
	
	public void setNomeFornecedor(String nomeFornecedor){
		this.nomeFornecedor = nomeFornecedor;
	}
	
	public String getNomeFornecedor(){
		return nomeFornecedor;
	}
	
	public void setCnpjFornecedor(String cnpjFornecedor){
		this.cnpjFornecedor = cnpjFornecedor;
	}
	
	public String getCnpjFornecedor(){
		return cnpjFornecedor;
	}
}
