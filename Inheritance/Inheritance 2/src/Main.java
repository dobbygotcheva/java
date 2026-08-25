// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee(40000);
        HRManager mgr=new HRManager(70000);

        emp.work();
        System.out.println("Employee salary: "+ emp.getSalary());

        mgr.work();
        System.out.println("Manager salary: "+mgr.getSalary());
        mgr.addEmployee();

    }
}