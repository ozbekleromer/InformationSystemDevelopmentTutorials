package ozbek.BYT8.Lab2A.edu.ncsu.monopoly.gui;

import ozbek.BYT8.Lab2A.edu.ncsu.monopoly.GameMaster;

import java.awt.GridLayout;

import javax.swing.JPanel;


public class InfoPanel extends JPanel {
	public void displayInfo() {
		GameMaster master = GameMaster.instance();
		setLayout(new GridLayout(1, master.getNumberOfPlayers()));
		for (int i = 0; i< master.getNumberOfPlayers(); i++){
			PlayerPanel panel = new PlayerPanel(master.getPlayer(i));
			add(panel);
			panel.displayInfo();
		}
	}
}
