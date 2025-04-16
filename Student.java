public class Student{
    String name;
    String usn;

    Student(String n,String u){
        name=n;
        usn=u;


    }

    void display(){
        System.out.println("student name :"+name+"\nSudent USN :"+usn);
    }

    public static void main(String[] args){
        Student s1=new Student("rohit", "01fe23bca031");
        s1.display();
    }
}