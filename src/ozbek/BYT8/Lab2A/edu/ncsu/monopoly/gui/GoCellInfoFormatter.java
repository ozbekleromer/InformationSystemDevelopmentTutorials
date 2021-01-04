package ozbek.BYT8.Lab2A.edu.ncsu.monopoly.gui;


import ozbek.BYT8.Lab2A.edu.ncsu.monopoly.Cell;

public class GoCellInfoFormatter implements CellInfoFormatter {
    
    public static final String GO_CELL_LABEL = "<html><b>Go</b></html>";
    
    public String format(Cell cell) {
        return GO_CELL_LABEL;
    }
}
