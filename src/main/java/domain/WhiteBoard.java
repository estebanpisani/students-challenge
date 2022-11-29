package domain;

public class WhiteBoard {

    private String text;
    private int numberOfStudents;
    private int count = 0;

    synchronized public void write(String text){
        this.text = text;
        System.out.println("Teacher writes "+text);
    }
    synchronized public String read(){
        System.out.println("Student reads "+this.text);
        return this.text;
    }
    synchronized public void attendance(){
        this.numberOfStudents++;
    }
}
