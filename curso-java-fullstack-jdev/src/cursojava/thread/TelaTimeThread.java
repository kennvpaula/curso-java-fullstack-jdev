package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes

	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Add Lista");
	private JButton jButton2 = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaTimeThread() {

		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gridbagConstraints = new GridBagConstraints(); // Controlador de posicionamento de
																			// componentes
		gridbagConstraints.gridx = 0;
		gridbagConstraints.gridy = 0;
		gridbagConstraints.gridwidth = 2;
		gridbagConstraints.insets = new Insets(5, 10, 5, 5);
		gridbagConstraints.anchor = GridBagConstraints.WEST;

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

		// *****************************************************************

		gridbagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridbagConstraints.gridy++;
		jPanel.add(jButton, gridbagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridbagConstraints.gridx++;
		jPanel.add(jButton2, gridbagConstraints);

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {// Executa o clique no botão
				
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				for(int qtd = 0; qtd < 100; qtd++) { //simulando 100 envios em massa
				
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText() + " - " + (qtd + 1) );
				
				fila.add(filaThread);
				
				}

			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;

			}
		});
		
		fila.start();
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true); // torna a tela visível para o usuário e sempre será o último comando

	}

}
