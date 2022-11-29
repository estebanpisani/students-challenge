package domain;

public class Teacher extends Thread{
    private WhiteBoard whiteBoard;

    @Override
    public void run() {
        for (int i=0; i<50; i++){
            whiteBoard.write(String.valueOf(i));
        }
    }
}
