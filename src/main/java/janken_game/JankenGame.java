package janken_game;

import java.util.Random;
import java.util.Scanner;

public class JankenGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] handOptions = { "グー", "チョキ", "パー" };

        System.out.println("じゃんけんゲームを開始します！");
        System.out.println("手を選んでください（0: グー, 1: チョキ, 2: パー）:");
        int playerHand = scanner.nextInt();

        if (playerHand < 0 || playerHand > 2) {
            System.out.println("無効な手です。ゲームを終了します。");
            return;
        }

        int computerHand = random.nextInt(3);

        System.out.println("あなたの手: " + handOptions[playerHand]);
        System.out.println("コンピュータの手: " + handOptions[computerHand]);

        if (playerHand == computerHand) {
            System.out.println("引き分けです！");
        } else if ((playerHand == 0 && computerHand == 1)
                || (playerHand == 1 && computerHand == 2)
                || (playerHand == 2 && computerHand == 0)) {
            System.out.println("あなたの勝ちです！");
        } else {
            System.out.println("あなたの負けです！");
        }
    }
}
