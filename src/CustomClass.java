class Employee{
    int id;
    String name;
    int salary;
    String address;
    public void printDetails(){
        System.out.println("My id is: "+id);
        System.out.println("My name is: "+name);
    }
    public int getSalary(){
       return salary;
    }
    public String getAddress(){
        return address;
    }
}
public class CustomClass {
    public static void main(String[] args) {
        Employee saptarshi = new Employee(); // instantiating a new employee object
        // setting attributes (adjectives)
        saptarshi.id = 123;
        saptarshi.name = "Saptarshi Biswas";
        saptarshi.address= "Gangnapur,WB";
        saptarshi.salary=34000;
        saptarshi.printDetails();
        int salary = saptarshi.getSalary();
        String address =saptarshi.getAddress();
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
        // System.out.println(saptarshi.id);
        // System.out.println(saptarshi.name);

    }
    static {
        Employee rakib = new Employee();
        rakib.id=124;
        rakib.name="Rakib Biswas";
        rakib.address="Kamargaria,WB";
        rakib.salary=35000;
        /* System.out.println(rakib.id);
         System.out.println(rakib.name);*/
        rakib.printDetails();
        int salary =rakib.getSalary();
        String address = rakib.getAddress();
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
    }
}
