import java.util.*;

public class DormitoryManager {
    private final int capacity;
    private final String name;

    public DormitoryManager(int capacity, String name){
        this.capacity=capacity;
        this.name=name;
    }

    private ArrayList<Dorm> d = new ArrayList<>();

    public void addDorm(int no, int cap){
        if(d.size()<capacity){
            Dorm dorm= new Dorm(no,cap);
            d.add(dorm);
        }
    }

    public Dorm findRoom(int no){
        for (Dorm dorm : d) {
            if (dorm.getNumber() == no) {
                return dorm;
            }
        }
        return null;
    }

    public void assignStudent(Student st){
        int searched=st.getRoom();
        Dorm found=findRoom(searched);
        if(found!=null && found.getOccupancy()<found.getCapacity()){
            found.addStudent(st);
        }
    }

    public void availableRooms(){
        System.out.println("Available rooms are:");
        for(Dorm dorm: d){
            if(dorm.getOccupancy()<dorm.getCapacity()){
                int n=dorm.getCapacity()-dorm.getOccupancy();
                System.out.println("Room " + dorm.getNumber() + " with " + n + " place(s)");
            }
        }
    }

    public void moveStudent(Student st,int oldNo, int newNo){
        Dorm dOld=findRoom(oldNo);
        Dorm dNew=findRoom(newNo);
        if(dOld!=null && dNew!=null){
            if(dNew.getOccupancy()<dNew.getCapacity()){
                dNew.addStudent(st);
                dOld.removeStudent(st);
                st.setRoom(newNo);
            }
        }
    }

    public String toString(){
        String aux="";
        aux+="Dormitory name: " + this.name + "\n";
        for (Dorm dorm : d) {
            aux += dorm.toString();
        }
        return aux;
    }
}
