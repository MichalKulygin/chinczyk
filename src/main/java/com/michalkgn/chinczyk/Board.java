package com.michalkgn.chinczyk;

/**
 * Board
 *
 * @CreatedBy MKgn
 */
class Board {
    private int numberOfFields;

    public Board(int numberOfFields) {
        this.numberOfFields = numberOfFields;
    }

    public int getNumberOfFields() {
        return numberOfFields;
    }

    public void printBoard(Player player) {

        for (int i = 1; i <= this.numberOfFields; i++) {
            if (i == 1) {
                System.out.print("S");
            } else if (i != player.getActField() && i != this.numberOfFields) {
                System.out.print("_");
            } else if (i == this.numberOfFields) {
                System.out.print("F");
            } else {
                System.out.print(player.getName());
            }
        }
    }
}
