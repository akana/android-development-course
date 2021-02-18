public class SalaryReport {

  public static double calculateEmployeeSalary(Employee[] employees) {
    double salary = 0.0;
    for (int i = 0; i < employees.length; i++) {
      salary += employees[i].calculateSalary();
    }
    return salary;
  }

  public static void main(String[] args) {
    Teacher akana = new Teacher("mao", "akana", 1980, 'M', 10.0, 40);
    Employee jame = new Employee("bond", "jame", 1970, 500.0, "Actor");
    Employee[] employees = { akana, jame };
    System.out.println("employee salary this month: " + SalaryReport.calculateEmployeeSalary(employees));
  }
}
