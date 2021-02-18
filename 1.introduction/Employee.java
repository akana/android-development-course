public class Employee {
  private String firstname;
  private String lastname;
  private int yearOfBirth;
  private double salary;
  private String job;

  public Employee(String lastname, String firstname, int yearOfBirth, double salary, String job) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.yearOfBirth = yearOfBirth;
    this.salary = salary;
    this.job = job;
  }

  public String getFullName() {
    return this.firstname + " " + this.lastname;
  }

  public String getJob() {
    return this.job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public int getAge() {
    return 0;
  }

  public double calculateSalary() {
    return this.salary;
  }

  public static void main(String[] args) {
    Employee jame = new Employee("bond", "jame", 1970, 0.0, "Actor");
    System.out.println(jame.getFullName() + " " + jame.getAge());
  }
}