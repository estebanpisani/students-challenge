package domain;

public class Student extends Thread{
    private WhiteBoard whiteBoard;

    public Student(WhiteBoard whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    @Override
    public void run() {
        for (int i=0; i<50; i++){
            System.out.println("Student reads "+whiteBoard.read());
        }
    }
}
