package br.imd.modelo;

public class Produto {
	
	private String codProduto;
	private String descricaoProduto;
	private String unidadeProduto;
	
	public Produto(String codProduto, String descricaoProduto, String unidadeProduto){}
	
	public void setCodigoProduto(String codProduto){
		this.codProduto = codProduto;
	}
	
	public String getCodigoProduto(){
		return codProduto;
	}
	
	public void setDescricaoProduto(String descricaoProduto){
		this.descricaoProduto = descricaoProduto;
	}
	
	public String getDescricaoProduto(){
		return descricaoProduto;
	}
	
	public void setUnidadeProduto(String unidadeProduto){
		this.unidadeProduto = unidadeProduto;
	}
	
	public String getUnidadeProduto(){
		return unidadeProduto;
	}
	
}
