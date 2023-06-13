package ex2_example;

import javax.swing.*;

public class HumanPlayer extends Player{


    public HumanPlayer(Symbol[][] arr, Symbol symbol) {
       super(arr, symbol);
    }

    public void makeStep(String text){
        String coords = JOptionPane.showInputDialog(null,
                text + "\nEnter cell coorditanes:");
        String[] data = coords.split(" ");
        int row = Integer.parseInt(data[0]);
        int col = Integer.parseInt(data[1]);
        arr[row][col] = symbol;
    }
}
