package domain;

public class Student extends Thread{
    private WhiteBoard whiteBoard;
    private String name;

    public Student(WhiteBoard whiteBoard, String name) {
        this.whiteBoard = whiteBoard;
        this.name = name;
    }

    @Override
    public void run() {
        this.whiteBoard.attendance();

        for (int i=0; i<50; i++){
            System.out.println(this.name+" is reading "+whiteBoard.read());
            System.out.flush(); //Para que se impriman en orden, por las dudas.
        }
    }
}
