package ozbek.BYT8.Lab2A.edu.ncsu.monopoly.gui;


import ozbek.BYT8.Lab2A.edu.ncsu.monopoly.Cell;

public class GotoJailCellInfoFormatter implements CellInfoFormatter {

    public static final String GOTO_JAIL_LABEL = "<html><b>Go to Jail</b></html>";

    public String format(Cell cell) {
    	return GOTO_JAIL_LABEL;
	}
}
