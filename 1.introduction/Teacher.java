public class Teacher extends Employee {
  private char gender;
  private double salaryPerHour;
  private int workedHourPerMonth;

  public Teacher(String lastname, String firstname, int yearOfBirth, char gender, double salaryPerHour,
      int workedHourPerMonth) {
    super(lastname, firstname, yearOfBirth, 0, "Teacher");
    this.gender = gender;
    this.salaryPerHour = salaryPerHour;
    this.workedHourPerMonth = workedHourPerMonth;
  }

  public String getFullName() {
    String name = super.getFullName();
    if (this.gender == 'M') {
      return "Mr. " + name;
    } else {
      return "Ms. " + name;
    }
  }

  public double calculateSalary() {
    return this.workedHourPerMonth * this.salaryPerHour;
  }

  public static void main(String[] args) {
    Teacher akana = new Teacher("mao", "akana", 1980, 'M', 10.0, 40);
    System.out.println(akana.getFullName() + ": " + akana.getJob() + ": " + akana.calculateSalary());
  }

}
