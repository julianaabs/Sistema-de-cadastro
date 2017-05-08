package br.imd.visao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame implements ActionListener{
	
	JDesktopPane dtp = new JDesktopPane();
	
	JMenuBar mnbar = new JMenuBar();	
	JMenu fileMenu = new JMenu("Cadastros");
	JMenu fileRels = new JMenu("Relatórios");
	JMenu exitMenu = new JMenu("Sair");
	JMenuItem mItem1 = new JMenuItem("Clientes");
	JMenuItem mItem2 = new JMenuItem("Fornecedores");
	JMenuItem mItem3 = new JMenuItem("Produtos");
	JMenuItem mItem4 = new JMenuItem("Sair");

		 		
	public TelaPrincipal(){
		Container ct = this.getContentPane();
		ct.setLayout(new BorderLayout());
		
		setJMenuBar(mnbar);
		mnbar.add(fileMenu);
		mnbar.add(fileRels);
		mnbar.add(exitMenu);

		fileMenu.add(mItem1);
		fileMenu.add(mItem2);
		fileMenu.add(mItem3);
		exitMenu.add(mItem4);
		
		ct.add(BorderLayout.CENTER, dtp);
		
		setSize(800,600);
		setResizable(false);
		setTitle("Sistema de Controle de Vendas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// eventos
		mItem1.addActionListener(this);	
		mItem2.addActionListener(this);
		mItem3.addActionListener(this);
		mItem4.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
	                setVisible(false);
	                System.exit(0);
	            }
	        });
		}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mItem1){
			TelaCliente tlCliente = new TelaCliente("Clientes");
			dtp.add(tlCliente);
			tlCliente.setVisible(true);
		}
		if (e.getSource() == mItem2){
			TelaFornecedor tlFornecedor = new TelaFornecedor("Fornecedores");
			dtp.add(tlFornecedor);
			tlFornecedor.setVisible(true);
		}
		if(e.getSource() == mItem3){
			TelaProdutos tlProdutos = new TelaProdutos("Produtos");
			dtp.add(tlProdutos);
			tlProdutos.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		TelaPrincipal telaPai = new TelaPrincipal();
		telaPai.setVisible(true);
	}
}
