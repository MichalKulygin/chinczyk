package com.michalkgn.chinczyk;

/**
 * Game
 *
 * @CreatedBy MKgn
 */
class Game {

    private final Board board;
    private final Dice dice;
    private Player winner = null;

    public Game(Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
    }

    public void run() {

        Player player1 = new Player("1", dice);
        Player player2 = new Player("2", dice);

        do {
            move(player1);
            move(player2);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (this.winner == null);

    }

    private void move(Player player) {
        int howManyFieldsMove = player.throwDice();
        if (player.getActField() + howManyFieldsMove == this.board.getNumberOfFields()) {
            System.out.println();
            System.out.println("player " + player.getName() + " WON!");
            this.winner = player;
        }
        if (player.getActField() + howManyFieldsMove < this.board.getNumberOfFields()) {
            player.setActField(player.getActField() + howManyFieldsMove);
        }
        if (this.winner == null) {
            System.out.println();
            board.printBoard(player);
        }
    }
}

