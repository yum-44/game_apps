package bingo_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoNumberGenerator {
    private List<Integer> numbers;
    private Random random;

    public BingoNumberGenerator() {
        numbers = new ArrayList<>();
        random = new Random();

        // 1から75までの数字を用意
        for (int i = 1; i <= 75; i++) {
            numbers.add(i);
        }
    }

    public int generateNumber() {
        int index = random.nextInt(numbers.size());
        return numbers.remove(index);
    }

    public static void main(String[] args) {
        BingoNumberGenerator generator = new BingoNumberGenerator();
        int number = generator.generateNumber();
        System.out.println("ビンゴの数字: " + number);
    }
}