package predicates;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	private String name;
	private double salary;
	private int exp;

	public Employee(String name, double salary, int exp) {
		super();
		this.name = name;
		this.salary = salary;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
}

public class Demo1 {
	// Find employeee name whose salary is above 50000 and experience is 3yrs using Predicate functional interface.
	public static void main(String[] args) {
		Employee emp1 = new Employee("wasim", 60000, 4);
		Employee emp2 = new Employee("alex", 30000, 1);
		Employee emp3 = new Employee("mack", 550000, 4);
		Employee emp4 = new Employee("naz", 70000, 5);

		List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4);
		
		Predicate<Employee> p = (Employee employee) -> (employee.getSalary() > 50000 && employee.getExp() > 3);
		
		for (Employee emp : employees) {
			if(p.test(emp)) {
				System.out.println(emp.getName());
			}
		}
	}
}
