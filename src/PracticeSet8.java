class Employee1{
    String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    int salary;
    public int getSalary(){
        return salary;
    }
}
public class PracticeSet8 {
    public static void main(String[] args) {
        Employee1 avishek=new Employee1();
        avishek.setName("Avishek Hazra");
        System.out.println("Employee name: "+avishek.getName());

        avishek.salary=32000;
        int salary=avishek.getSalary();
        System.out.println("Salary: "+salary);
    }
}
