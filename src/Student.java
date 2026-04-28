public class Student {
    private String name;
    private int room;
    private String college;

    public Student(String name,int room,String college){
        this.name=name;
        this.room=room;
        this.college=college;
    }

    public String toString(){
        String aux="";
        aux+="Student: " + this.name + "\n";
        aux+="Dorm number: " + this.room + "\n";
        aux+="College: " + this.college + "\n\n";
        return aux;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
