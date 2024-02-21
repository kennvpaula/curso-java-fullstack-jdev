package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); //Painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	public TelaTimeThread() {
		
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridbagConstraints = new GridBagConstraints(); //Controlador de posicionamento de componentes
		gridbagConstraints.gridx = 0;
		gridbagConstraints.gridy = 0;
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridbagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridbagConstraints.gridy++;
		jPanel.add(mostraTempo, gridbagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridbagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridbagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridbagConstraints.gridy++;
		jPanel.add(mostraTempo2, gridbagConstraints);
		
		
		
		
		
		
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true); //torna a tela visível para o usuário e sempre será o último comando
		
	}
	

}
