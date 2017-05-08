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
import br.imd.modelo.Fornecedor;

public class TelaFornecedor extends JInternalFrame implements ActionListener{
	Banco bc;
	
	// r�tulos
	JLabel lcodFornecedor = new JLabel("Codigo:");
	JLabel lnome = new JLabel("Nome:");
	JLabel lcnpj = new JLabel("CNPJ:");
				
	// campos
	JTextField tcodFornecedor = new JTextField();
	JTextField tnome = new JTextField();
	JTextField tcnpj = new JTextField();
				
	// bot�es
	JButton b1 = new JButton("Submeter");
	JButton b2 = new JButton("Limpar");
	JButton b3 = new JButton("Listar");

	public TelaFornecedor(String str)  {
		super(str,false,true);
			
		Container ct = this.getContentPane();
		ct.setLayout(null);
			
		// coordenadas
		lcodFornecedor.setBounds(10,10,100,30);
		tcodFornecedor.setBounds(55,10,280,25);
		lnome.setBounds(10,40,100,30);
		tnome.setBounds(55,40,22,25);
		lcnpj.setBounds(10,70,100,30);
		tcnpj.setBounds(55,70,100,25);

		// idem
		b1.setBounds(10 ,140,100,30);
		b2.setBounds(120,140,100,30);
		b3.setBounds(230,140,100,30);
					
		// adicionando componentes
		ct.add(lcodFornecedor);
		ct.add(tcodFornecedor);
		ct.add(lnome);
		ct.add(tnome);
		ct.add(lcnpj);
		ct.add(tcnpj);
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
			Fornecedor fornecedor = new Fornecedor(tcodFornecedor.getText(),tnome.getText(), tcnpj.getText());
			bc.inserirFornecedor(fornecedor);
			
			tcodFornecedor.setText("");
			tnome.setText("");
			tcnpj.setText("");
		}
		else if(e.getSource() == b2){
			tcodFornecedor.setText("");
			tnome.setText("");
			tcnpj.setText("");
		}
		else if (e.getSource() == b3){
			tcodFornecedor.setText("");
			tnome.setText("");
			tcnpj.setText("");
			System.out.println("****************************************");
		}
	}
}
