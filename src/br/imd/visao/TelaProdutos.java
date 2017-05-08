package br.imd.visao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.imd.controle.Banco;
import br.imd.modelo.Cliente;
import br.imd.modelo.Produto;

public class TelaProdutos extends JInternalFrame implements ActionListener{
	Banco bc;
	
	// r�tulos
	JLabel lcodProduto = new JLabel("Codigo:");
	JLabel ldescProduto = new JLabel("Descricao:");
	JLabel lunidade = new JLabel("Unidade:");
					
	// campos
	JTextField tcodProduto = new JTextField();
	JTextField tdescProduto = new JTextField();
	JTextField tunidade = new JTextField();
					
	// bot�es
	JButton b1 = new JButton("Submeter");
	JButton b2 = new JButton("Limpar");
	JButton b3 = new JButton("Listar");

	public TelaProdutos(String str){
		super(str,false,true);
				
		Container ct = this.getContentPane();
		ct.setLayout(null);
					
		// coordenadas
		lcodProduto.setBounds(10,10,100,30);
		tcodProduto.setBounds(55,10,280,25);
		ldescProduto.setBounds(10,40,100,30);
		tdescProduto.setBounds(55,40,22,25);
		lunidade.setBounds(10,70,100,30);
		tunidade.setBounds(55,70,100,25);

		// idem
		b1.setBounds(10 ,140,100,30);
		b2.setBounds(120,140,100,30);
		b3.setBounds(230,140,100,30);
						
		// adicionando componentes
		ct.add(lcodProduto);
		ct.add(tcodProduto);
		ct.add(ldescProduto);
		ct.add(tdescProduto);
		ct.add(lunidade);
		ct.add(tunidade);
		ct.add(b1);
		ct.add(b2);
		ct.add(b3);
				
		// evento dos bot�es
		b1.addActionListener(this);		
		b2.addActionListener(this);
		b3.addActionListener(this);
				
		// especifica��es do formul�rio
		setSize(350,230);
		setTitle(str);
				
		bc = new Banco();
	}
			
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1){
			Produto produto = new Produto(tcodProduto.getText(),tdescProduto.getText(), tunidade.getText());
			bc.inserirProduto(produto);
			
			tcodProduto.setText("");
			tdescProduto.setText("");
			tunidade.setText("");
		}
		else if(e.getSource() == b2){
			tcodProduto.setText("");
			tdescProduto.setText("");
			tunidade.setText("");
		}
		else if (e.getSource() == b3){
			tcodProduto.setText("");
			tdescProduto.setText("");
			tunidade.setText("");
			System.out.println("****************************************");
		}
	}
}
