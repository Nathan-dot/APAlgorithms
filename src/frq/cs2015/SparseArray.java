package frq.cs2015;

import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;
    public SparseArray() {
        entries = new ArrayList<SparseArrayEntry>();
    }
    public int getNumRows() {
        return numRows;
    }
    public int getNumCols() {
        return numCols;
    }
    public int getValueAt(int row, int col) {
        for(int i = 0; i < entries.size(); i++) {
            if(entries.get(i).getRow() == row && entries.get(i).getCol() == col) {
                entries.get(i).getValue();
            }
        }
        return 0;
    }
    public void removeColumn(int col) {
        for(int i = 0; i < entries.size(); i++) {
            if(entries.get(i).getCol() == col) {
                entries.remove(i);
                i--;
                // when removing from ArrayList but the rest of the elements will be shifted left
            }
            else if(entries.get(i).getCol() > col) {
                entries.set(i, new SparseArrayEntry(entries.get(i).getRow(), entries.get(i).getCol() - 1, entries.get(i).getValue()));
            }
        }
        this.numCols--;
    }
}
