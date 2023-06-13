package ex2_example;

import java.util.Random;

public class ComputerPlayer extends Player{


    public ComputerPlayer(Symbol[][] arr, Symbol symbol) {
       super(arr, symbol);
    }

    public void makeStep(String text){
        Random rnd = new Random();

       
        int row = rnd.nextInt(0,arr.length);
        int col = rnd.nextInt(0,arr.length);
        arr[row][col] = symbol;

    }
}
