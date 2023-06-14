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
    public void startGame() {
        String input = JOptionPane.showInputDialog(null,
                "1. Человек vs Человек\n" +
                        "2. Человек vs Компьютер\n" +
                        "3. Компьютер vs Компьютер");
        if (input == null) return;
        Player player1=null;
        Player player2=null;
        switch (input) {
            case "1" -> {
                player1 = new HumanPlayer(arr, Symbol.X);
                player2 = new HumanPlayer(arr, Symbol.O);
            }
            case "2" -> {
                player1 = new HumanPlayer(arr, Symbol.X);
                player2 = new ComputerPlayer(arr, Symbol.O);
            }
            case "3" -> {
                player1 = new ComputerPlayer(arr, Symbol.X);
                player2 = new ComputerPlayer(arr, Symbol.O);
            }
        }
        int step = 0;
        while (true) {
            if (step % 2 == 0) {
                player1.makeStep(toString());
                if(player1.getClass() == ComputerPlayer.class){
                    JOptionPane.showMessageDialog(null, toString());
                }
            } else {
                player2.makeStep(toString());
                if(player2.getClass() == ComputerPlayer.class){
                    JOptionPane.showMessageDialog(null, toString());
                }
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


