import java.util.*;

class Main {
    public static void main(String []args){
            Scanner read=new Scanner(System.in);
            DormitoryManager m= new DormitoryManager(10, "C13");
            boolean run =true;
            while(run){
                System.out.println("-- MENU --");
                System.out.println("1. Add a room");
                System.out.println("2. Add a new student");
                System.out.println("3. Move a student");
                System.out.println("4. Show available rooms");
                System.out.println("5. Display all dormitory status");
                System.out.println("0. Exit");
                System.out.println("--------------------------------");
                System.out.println("Choose an option:");

                //reading from input
                int op=read.nextInt();
                read.nextLine(); //this is for the newline that the buffer of the reader leaves in it

                int room;
                String name, college;
                switch (op){
                    case 0 : {
                        run=false;
                        m.export("dorm_status.txt");
                        break;
                    }
                    case 1 : {
                        System.out.println("Please enter the new room number:");
                        int room_number=read.nextInt();
                        read.nextLine();
                        System.out.println("enter the capacity of it:");
                        int max_capacity=read.nextInt();
                        m.addDorm(room_number, max_capacity);
                        break;
                    }
                    case 2 : {
                        System.out.println("Please enter the new student's");
                        System.out.println("name:");
                        name=read.nextLine();
                        System.out.println("room number:");
                        room=read.nextInt();
                        read.nextLine();
                        System.out.println("college:");
                        college=read.nextLine();

                        Student s=new Student(name,room,college);
                        m.assignStudent(s);
                        break;
                    }
                    case 3 : {
                        System.out.println("Please enter the student which you want to move");
                        System.out.println("name:");
                        name=read.nextLine();
                        System.out.println("old room number:");
                        room=read.nextInt();
                        read.nextLine();
                        System.out.println("college:");
                        college=read.nextLine();
                        System.out.println("Enter the new room number:");
                        int new_room=read.nextInt();

                        Dorm d=m.findRoom(room);
                        if(d!=null) {
                            m.moveStudent(d.getStudent(name, college), room, new_room);
                        }else System.out.println("The room you've entered does not exist in the system!");
                        break;
                    }
                    case 4 : System.out.println(m.availableRooms()); break;
                    case 5 : System.out.println(m); break;
                }
            }
        }
}
