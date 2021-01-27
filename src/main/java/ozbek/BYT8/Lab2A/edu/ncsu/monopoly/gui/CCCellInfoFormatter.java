package ozbek.BYT8.Lab2A.edu.ncsu.monopoly.gui;

import ozbek.BYT8.Lab2A.edu.ncsu.monopoly.Cell;

public class CCCellInfoFormatter implements CellInfoFormatter {

    @Override
    public String format(Cell cell) {
        return "<html><font color='white'><b>" + cell.getName() + "</b></font></html>";
    }
}
