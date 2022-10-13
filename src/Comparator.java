import java.util.ArrayList;
import java.util.Collections;

class Emps {
    String name;
    int id;
    int salary;
    int yearOfJoining;

    public Emps(String name, int id, int salary, int yearOfJoining) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Emps{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }
}

class CompareName implements java.util.Comparator<Emps> {

    @Override
    public int compare(Emps e1, Emps e2) {
        return e1.name.compareTo(e2.name);
    }
}

class CompareId implements java.util.Comparator<Emps> {

    @Override
    public int compare(Emps e1, Emps e2) {

        if (e1.id == e2.id) {
            return 0;
        } else if (e1.id > e2.id) {
            return 1;
        } else return -1;
    }
}

class CompareSalary implements java.util.Comparator<Emps> {

    @Override
    public int compare(Emps e1, Emps e2) {

        if (e1.salary == e2.salary) {
            return 0;
        } else if (e1.salary > e2.salary) {
            return 1;
        } else return -1;
    }
}

class CompareYearOfJoining implements java.util.Comparator<Emps> {
    @Override
    public int compare(Emps e1, Emps e2) {
        return Integer.compare(e1.yearOfJoining, e2.yearOfJoining);
    }
}

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Emps> a1 = new ArrayList<Emps>();
        a1.add(new Emps("Saptarshi", 07, 35000, 2015));
        a1.add(new Emps("Rakib", 12, 30000, 2017));
        a1.add(new Emps("Avishek", 19, 32000, 2016));

        System.out.println("Comparing name.");
        Collections.sort(a1, new CompareName());
        for (Emps e : a1) {
            System.out.println(e.id + " " + e.name + " " + e.salary + " " + e.yearOfJoining);
        }


        System.out.println(" ");


        System.out.println("Comparing id.");
        Collections.sort(a1, new CompareId());
        for (Emps e : a1) {
            System.out.println(e.id + " " + e.name + " " + e.salary + " " + e.yearOfJoining);
        }


        System.out.println(" ");


        System.out.println("Comparing salary.");
        Collections.sort(a1, new CompareSalary());
        for (Emps e : a1) {
            System.out.println(e.id + " " + e.name + " " + e.salary + " " + e.yearOfJoining);
        }


        System.out.println(" ");


        System.out.println("Comparing joining year.");
        Collections.sort(a1, new CompareYearOfJoining());
        for (Emps e : a1) {
            System.out.println(e.id + " " + e.name + " " + e.salary + " " + e.yearOfJoining);
        }
    }
}
