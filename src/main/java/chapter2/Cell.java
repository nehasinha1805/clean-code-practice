package main.java.chapter2;

public class Cell {
    int[] cell;

    // intention-revealing function to hide the magic numbers from the getFlaggedCells method
    public boolean isFlagged() {
        return cell[STATUS_VALUE] == FLAGGED;
    }
}
