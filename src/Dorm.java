import java.util.*;

public class Dorm {
    private final int number;
    private final int capacity;
    private int occupancy;

    public Dorm(int number,int capacity){
        this.number=number;
        this.capacity=capacity;
    }

    private ArrayList<Student> s = new ArrayList<>();

    public void addStudent(Student st){
        if(s.size()<capacity) {
            s.add(st);
            occupancy=occupancy+1;
        }
        else System.out.println("This room is full!");
    }

    public String toString(){
        String aux="";
        aux+="Number: " + this.number + "\n";
        aux+="Room capacity: " + this.capacity + "\n";
        aux+="Room occupancy: " + this.occupancy + "\n";
        for (Student student : s) {
            aux += student.toString();
        }
        aux+="\n";
        return aux;
    }

    public int getNumber(){
        return this.number;
    }

    public void removeStudent(Student st){
        s.remove(st);
    }

    public int getOccupancy(){ return occupancy;}
    public int getCapacity(){return capacity;}
}
