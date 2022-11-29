import domain.Student;
import domain.Teacher;
import domain.WhiteBoard;

public class MultiThreading {
    public static void main(String[] args){
        WhiteBoard whiteBoard = new WhiteBoard();
        Teacher teacher = new Teacher(whiteBoard);
        Student student1 = new Student(whiteBoard, "Michell");
        Student student2 = new Student(whiteBoard, "Harry");
        Student student3 = new Student(whiteBoard, "George");

        teacher.start();
        student1.start();
        student2.start();
        student3.start();
    }
}
