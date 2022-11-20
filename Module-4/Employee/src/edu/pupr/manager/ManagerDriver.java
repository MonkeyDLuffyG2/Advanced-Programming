package edu.pupr.manager;

public class ManagerDriver {
    public static void main(String[] args){
        Manager boss = new Manager("Ruis Newgate",75_000, 2021, 8, 30);

        Employee[] staff = new Employee[3];

        boss.setBonus(10_000);
        boss.raiseSalary(10);

        staff[0] = boss;
        staff[1] = new Employee("Roronoa Zoro", 95_000, 1997, 9, 15);
        staff[2] = new Employee("Eiichiro Oda", 99_000, 1989, 1,1);

        System.out.printf("%-16s%-16s%-16sManager%n", "Hire Date", "Employee Name", "Salary");
        System.out.println("============    ============    ===========     =======");

        Manager manager = (Manager) staff[0];
        manager.setBonus(15_000);

        for (Employee employee:staff){
            System.out.println(employee);
        }
    }
}
