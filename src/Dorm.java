import java.util.*;

public class Dorm {
    private final int number;
    private final int capacity;

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
        aux+="Number: " + this.number + "\n";
        aux+="Room capacity: " + this.capacity + "\n";
        aux+="Room occupancy: " + s.size() + "\n";
        for (Student st : s) {
            aux += st.toString();
        }
        aux+="\n";
        return aux;
    }

    public Student getStudent(String name, String college){
        for (Student st: s){
            if(st.getName().equals(name) && st.getCollege().equals(college)){
                return st;
            }
        }
        return null;
    }

    public int getNumber(){
        return this.number;
    }

    public void removeStudent(Student st){
        s.remove(st);
    }

    public int getOccupancy(){ return s.size();}
    public int getCapacity(){return capacity;}
}
