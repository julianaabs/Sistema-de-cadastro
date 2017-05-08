package br.imd.controle;

import java.util.ArrayList;
import br.imd.modelo.Cliente;
import br.imd.modelo.Fornecedor;
import br.imd.modelo.Produto;
import br.imd.visao.TelaPrincipal;
import br.imd.visao.TelaCliente;
import br.imd.visao.TelaFornecedor;
import br.imd.visao.TelaProdutos;

public class Banco {
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void inserirCliente(Cliente c){
		clientes.add(c);
	}
	
	public void inserirFornecedor(Fornecedor f){
		fornecedores.add(f);
	}
	
	public void inserirProduto(Produto p){
		produtos.add(p);
	}
}
