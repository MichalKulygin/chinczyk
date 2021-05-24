package chinczyk;

import java.util.Random;

/**
 * Dice
 *
 * @CreatedBy MKgn
 */
class Dice implements RandomNumber {
    private final int diceMaxNumber;
    private final Random random = new Random();

    Dice(int diceMaxNumber) {
        this.diceMaxNumber = diceMaxNumber;
    }

    @Override
    public int getNumber() {
        return random.nextInt(diceMaxNumber) + 1;
    }
}
