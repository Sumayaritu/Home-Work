package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Sumaya");
		employee.setAge(25);
		employee.setSex('F');
		employee.setCitizen(true);

		System.out.println("Employee Name:" + employee.getName() + "\nEmployee Age:" + employee.getAge()
				+ "\nEmployee Sex:" + employee.getSex() + "\nUsCitizen?:" + employee.getCitizen());

	}

}
