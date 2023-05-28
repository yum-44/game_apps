package omikuji_game;

import java.util.Random;
import java.util.Scanner;

public class Omikuji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] omikujiResults = {
                "大吉",
                "中吉",
                "小吉",
                "吉",
                "凶",
                "大凶"
        };

        //System.out.println("おみくじを引きますか？（Enterキーを押してください）");
        //scanner.nextLine();

        int randomIndex = random.nextInt(omikujiResults.length);
        String result = omikujiResults[randomIndex];

        System.out.println("結果は... " + result + "です！");
    }
}

