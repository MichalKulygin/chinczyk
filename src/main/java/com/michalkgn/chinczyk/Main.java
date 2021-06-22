package com.michalkgn.chinczyk;

/**
 * Main
 *
 * @CreatedBy MKgn
 */
class Main {
    public static void main(String[] args) {
        new Game(
                new Board(100),
                new Dice(6))
                .run();
    }
}
