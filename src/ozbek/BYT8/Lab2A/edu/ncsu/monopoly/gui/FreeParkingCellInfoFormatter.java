package ozbek.BYT8.Lab2A.edu.ncsu.monopoly.gui;

import ozbek.BYT8.Lab2A.edu.ncsu.monopoly.Cell;

public class FreeParkingCellInfoFormatter implements CellInfoFormatter {
    
    public static final String FP_CELL_LABEL = "<html><b>Free Parking</b></html>";
    
    public String format(Cell cell) {
        return FP_CELL_LABEL;
    }
}
