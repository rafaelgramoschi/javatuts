class Manager{
	int salary = 10000;
}

class Employee extends Manager {
	int id = 1;
	int empSal = 1000;
}

public class DemoInheritance {
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Employee " + emp.id + " salary: " + emp.empSal );
		System.out.println("Manager salary: " + emp.salary );
	}
}