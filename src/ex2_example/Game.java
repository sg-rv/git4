package ex2_example;

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

    //Bad method:
//    public void startGame() {
//        String input = JOptionPane.showInputDialog(null,
//                "1. Человек vs Человек\n" +
//                        "2. Человек vs Компьютер\n" +
//                        "3. Компьютер vs Компьютер");
//        if (input == null) return;
//        switch (input) {
//            case "1" -> {
//                int step = 0;
//                while (true) {
//                    String coords = JOptionPane.showInputDialog(null,
//                            toString() + "\nEnter cell coorditanes:");
//                    String[] data = coords.split(" ");
//                    int row = Integer.parseInt(data[0]);
//                    int col = Integer.parseInt(data[1]);
//                    if (step % 2 == 0) {
//                        arr[row][col] = Symbol.X;
//                    } else {
//                        arr[row][col] = Symbol.O;
//                    }
//                    step++;
//                }
//            }
//            case "2" -> {
//                int step = 0;
//                Random rnd = new Random();
//                while (true) {
//                    int row = 0;
//                    int col = 0;
//                    if (step % 2 == 0) {
//                        String coords = JOptionPane.showInputDialog(null,
//                                toString() + "\nEnter cell coorditanes:");
//                        String[] data = coords.split(" ");
//                        row = Integer.parseInt(data[0]);
//                        col = Integer.parseInt(data[1]);
//                    }else{
//                        row = rnd.nextInt(0,arr.length);
//                        col = rnd.nextInt(0,arr.length);
//                    }
//                    if (step % 2 == 0) {
//                        arr[row][col] = Symbol.X;
//                    } else {
//                        arr[row][col] = Symbol.O;
//                    }
//                    step++;
//                }
//            }
//            case "3" -> {
//
//            }
//
//        }
//    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
            ;
        }
        return sb.toString();
    }
}


