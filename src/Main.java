class Main {
        public static void main(String []args){
            Student s1=new Student("Selia Marcu",133,"AC");
            Student s2=new Student("Alexia Iovanel",133,"AC");
            Dorm d1=new Dorm(133,3);
            d1.addStudent(s1);
            d1.addStudent(s2);
            System.out.println(d1);
        }
}
