package domain;

public class WhiteBoard {

    private String text;
    private int numberOfStudents = 0;
    private int count = 0;

    synchronized public void write(String text){
        while(count!=0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            this.text = text;
            System.out.println("Teacher writes " + text);
            this.count = this.numberOfStudents;
            notifyAll();
    }
    synchronized public String read(){
        while (count==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.count--;
        if(count==0) {
            notify();
        }
        return this.text;
    }
    synchronized public void attendance(){
        this.numberOfStudents++;
    }
}
