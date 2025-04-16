public class Employee {
    String emp_name;
    String emp_id;
    int salary;

    Employee(String name,String id,int sal){
        emp_name=name;
        emp_id=id;
        salary=sal;
    }

    void show(){
        System.out.println("employee name :"+emp_name+"\nemployee id :"+emp_id+"employee salary :"+salary);
    }

    public static void main(String[] args){
        Employee e1=new Employee("Rohit", "emp121", 50000);
        e1.show();
    }
}
