package com.michalkgn.chinczyk;

/**
 * Player
 *
 * @CreatedBy MKgn
 */
class Player {
    private final String name;
    private final Dice dice;
    private int actField;

    public Player(String name, Dice dice) {
        this.name = name;
        this.dice = dice;
    }

    public String getName() {
        return name;
    }

    public int getActField() {
        return actField;
    }

    public void setActField(int actField) {
        this.actField = actField;
    }

    public int throwDice() {
        return this.dice.getNumber();
    }
}
