package br.com.jota.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.jota.calc.modelo.Memoria;
import br.com.jota.calc.modelo.MemoriaObservador;



@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().AdicionarObservador(this);
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.white);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10,  25));
		add(label);

	}
	@Override
	public void valorAlterado(String novoValor) {

		label.setText(novoValor);
		
	}
}
