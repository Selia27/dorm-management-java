import java.util.*;

public class Dorm {
    private int number;
    private int capacity;

    public Dorm(int number,int capacity){
        this.number=number;
        this.capacity=capacity;
    }

    private ArrayList<Student> s = new ArrayList<>();

    public void addStudent(Student st){
        if(s.size()<capacity) {
            s.add(st);
        }
        else System.out.println("This room is full!");
    }

    public String toString(){
        String aux="";
        aux+="Room capacity: " + this.capacity + "\n";
        for (Student student : s) {
            aux += student.toString();
        }
        return aux;
    }
}
