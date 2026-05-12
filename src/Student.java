public class Student {
    private final String name;
    private int room;
    private final String college;

    public Student(String name,int room,String college){
        this.name=name;
        this.room=room;
        this.college=college;
    }

    public String toString(){
        String aux="";
        aux+="\nStudent: " + this.name + "\n";
        aux+="Dorm number: " + this.room + "\n";
        aux+="College: " + this.college + "\n\n";
        return aux;
    }

    public int getRoom() {
        return room;
    }

    //setting the room for when (if) the student will move
    public void setRoom(int room) {
        this.room = room;
    }


}
