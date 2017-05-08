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

public class TelaCliente extends JInternalFrame implements ActionListener{
	
	Banco bc;
	
	// r�tulos
	JLabel lid = new JLabel("ID:");
	JLabel lnome = new JLabel("Nome:");
	JLabel lnasc = new JLabel("Nascimento:");
	JLabel lcpf = new JLabel("CPF:");
			
	// campos
	JTextField tid = new JTextField();
	JTextField tnome = new JTextField();
	JTextField tnasc = new JTextField();
	JTextField tcpf = new JTextField();
			
	// bot�es
	JButton b1 = new JButton("Submeter");
	JButton b2 = new JButton("Limpar");
	JButton b3 = new JButton("Listar");

	public TelaCliente(String str)  {
		super(str,false,true);
		
		Container ct = this.getContentPane();
		ct.setLayout(null);
			
		// coordenadas
		lid.setBounds(10,10,100,30);
		tid.setBounds(55,10,280,25);
		lnome.setBounds(10,40,100,30);
		tnome.setBounds(55,40,280,25);
		lnasc.setBounds(10,70,100,30);
		tnasc.setBounds(55,70,280,25);
		lcpf.setBounds(10,100,100,30);
		tcpf.setBounds(55,100,280,25);

		// idem
		b1.setBounds(10 ,140,100,30);
		b2.setBounds(120,140,100,30);
		b3.setBounds(230,140,100,30);
				
		// adicionando componentes
		ct.add(lid);
		ct.add(tid);
		ct.add(lnome);
		ct.add(tnome);
		ct.add(lnasc);
		ct.add(tnasc);
		ct.add(lcpf);
		ct.add(tcpf);
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
			Cliente cliente = new Cliente(tid.getText(),tnome.getText(), tnasc.getText(), tcpf.getText());
			bc.inserirCliente(cliente);
			
			tid.setText("");
			tnome.setText("");
			tnasc.setText("");
			tcpf.setText("");
		}
		else if(e.getSource() == b2){
			tid.setText("");
			tnome.setText("");
			tnasc.setText("");
			tcpf.setText("");
		}
		else if (e.getSource() == b3){
			tid.setText("");
			tnome.setText("");
			tnasc.setText("");
			tcpf.setText("");
			System.out.println("****************************************");
		}
	}
}