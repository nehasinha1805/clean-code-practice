package main.java.chapter2;

import java.util.ArrayList;
import java.util.List;

/*
* Say that we’re working in a mine sweeper game.
* We find that the board is a list of cells called theList. Let’s rename that to gameBoard.
* Each cell on the board is represented by a simple array. We further find that the zeroth
* subscript is the location of a status value and that a status value of 4 means “flagged.”
* */
public class GoodCodeExample {

    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<>();
        for(int[] cell : gameBoard) {
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        }
        return flaggedCells;
    }

}
