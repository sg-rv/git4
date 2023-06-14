package team_work;

public class ComputerPlayer extends Player {


    public ComputerPlayer(Symbol[][] arr, Symbol symbol) {
       super(arr, symbol);
    }

    public void makeStep(String text){
        //TODO
         Random rnd = new Random();

       
        int row = rnd.nextInt(0,arr.length);
        int col = rnd.nextInt(0,arr.length);
        arr[row][col] = symbol;
    }
}
