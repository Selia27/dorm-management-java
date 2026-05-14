import java.util.*;

class Main {
    public static void main(String []args){
            Scanner read=new Scanner(System.in);
            DormitoryManager m= new DormitoryManager(10, "C13");
            boolean keep=true;
            while(keep){
                  System.out.println("-- MENU --");
                  System.out.println("1. Add a room");
                  System.out.println("2. Show the residents");
                  System.out.println("3. Show a room");
                  System.out.println("0. Exit");
                  System.out.println("Choose an option:");
            }



            /*DormitoryManager m= new DormitoryManager(10, "C13");
            m.addDorm(133,2);
            m.addDorm(138,2);
            m.addDorm(134,2);
            m.addDorm(135,2);
            Student s1=new Student("Selia Marcu",133,"AC");
            Student s2=new Student("Alexia Iovanel",133,"AC");
            Student s3=new Student("Mihaela Ianachi",133,"AC");
            m.assignStudent(s1);
            m.assignStudent(s2);
            m.moveStudent(s2,133,138);
            m.assignStudent(s3);
            System.out.println(m);
            m.availableRooms();*/
        }
}
