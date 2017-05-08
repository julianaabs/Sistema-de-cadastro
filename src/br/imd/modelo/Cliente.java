package br.imd.modelo;

public class Cliente {
	
	private String idCliente;
	private String nome;
	private String data_nasc;
	private String cpf;
	
	public Cliente(String idCliente, String nome, String data_nasc, String cpf){}
	
	public void setidCliente(String idCliente){
		this.idCliente = idCliente;
	}
	
	public String getidCliente(){
		return idCliente;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setDataNasc(String data_nasc){
		this.data_nasc = data_nasc;
	}
	
	public String getDataNasc(){
		return data_nasc;
	}
	
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	
	public String getCPF(){
		return cpf;
	}

}
