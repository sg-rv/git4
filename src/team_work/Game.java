package team_work;

import javax.swing.*;

public class Game {
    private Symbol[][] arr = new Symbol[3][3];
    public Game() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Symbol.EMPTY;
            }
        }
    }
    //Good method:
    public void startGame() {
        String input = JOptionPane.showInputDialog(null,
                "1. Человек vs Человек\n");
        if (input == null) return;
        Player player1=null;
        Player player2=null;
        if ("1".equals(input)) {
            player1 = new HumanPlayer(arr, Symbol.X);
            player2 = new HumanPlayer(arr, Symbol.O);
        }
        int step = 0;
        while (true) {
            if (step % 2 == 0) {
                player1.makeStep(toString());
            } else {
                player2.makeStep(toString());
            }
            step++;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Symbol[] symbols : arr) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(symbols[j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}


